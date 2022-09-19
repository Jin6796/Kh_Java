package ajdbc.crud;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import address.view3.DBConnectionMgr;
import oracle.vo.DeptVO;
// 단일 상속의 단점을 보완하기 위해서 인터페이스를 제공하고 았다.
// 인터페이스는 다충 처리가 가능하다.
public class CRUDDept extends JFrame implements ActionListener, MouseListener{
	// 선언부
	////////////////// DB연동 /////////////////////
	DBConnectionMgr dbMgr   = new DBConnectionMgr();
	Connection          con = null;  // 연결통로
	PreparedStatement pstmt = null;  // DML구문을 전달하고 오라클에게 요청
	ResultSet            rs = null;  // 조회의 경우 커서를 조작하는 데에 필요한 인터페이스
	////////////////// DB연동 /////////////////////
	JPanel jp_north     = new JPanel(); // JFrame의 디폴트 레이아웃은 FlowLayout
	JButton jbtn_sel 	= new JButton("조회");
	JButton jbtn_ins	= new JButton("입력");
	JButton jbtn_upd	= new JButton("수정");
	JButton jbtn_del	= new JButton("삭제");
	JButton jbtn_sam	= new JButton("메롱");
	JButton jbtn_exit   = new JButton("종료");
	// 서로 의존관계에 있다. - '의존성 주입(인스턴스화-싱글톤패턴)', '객채 주입법', 'annotation'
	String    cols[]      = {"부서번호", "부서명", "지역"};
	String    data[][]    = new String[0][3];
	DefaultTableModel dtm = new DefaultTableModel (data,cols);
	JTable jtb            = new JTable(dtm);
	JScrollPane jsp       = new JScrollPane(jtb);
	// 테이블의 로우에 바인딩하기 - UI 솔루션 기본 제공
	JPanel jp_south         = new JPanel();
	JTextField jtf_deptno	= new JTextField("", 10);
	JTextField jtf_dname	= new JTextField("", 10);
	JTextField jtf_loc		= new JTextField("", 10);
	
	// 생성자
	public CRUDDept() {
		// 이벤트 소스와 이벤트 핸들러 매핑하기(이벤트 처리를 담당하는 핸들러 클래스)
		// ActionListener al = new CRUDDept(); 구현체 클래스가 되는 것!? 
		//  >> 생성부와 선언부 클래스 이름이 다르네?? >> "다형성"  >> 클래스 사이의 결합도를 낮출 수 있어서 단위 테스트가 가능한 구조가 된다. 
		jbtn_sel.addActionListener(this);
		jbtn_ins.addActionListener(this);
		jbtn_upd.addActionListener(this);
		jbtn_del.addActionListener(this);
		jbtn_sam.addActionListener(this);
		jbtn_exit.addActionListener(this);
		jtb.addMouseListener(this);
		initDisplay();
	}
	public void initDisplay () {
		jp_north.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp_north.add(jbtn_sel);
		jp_north.add(jbtn_ins);
		jp_north.add(jbtn_upd);
		jp_north.add(jbtn_del);
		jp_north.add(jbtn_sam);
		jp_north.add(jbtn_exit);
		this.add("North", jp_north);
		this.setSize(400, 400);
		this.setTitle("부서관리시스템");
		this.setVisible(true);
		this.add("South", jp_south);
		jp_south.add(jtf_deptno);
		jp_south.add(jtf_dname);
		jp_south.add(jtf_loc);
		this.add("Center", jsp);
	}
	public static void main(String[] args) {
		new CRUDDept ();
	}
	/***********************************************************
	 * 부서등록 구현
	 * @param dvo - 사용자가 입력한 부서번호, 부서명, 지역을 받는다
	 * @return int - 1: 등록 성공, 0: 등록 실패
	 * INSERT INTO dept(deptno, dname, loc)
              VALUES(71, '개발1팀', '서귀포')
	 ***********************************************************/
	// 부서 입력 메소드
	public int deptInsert(DeptVO dvo) {
		System.out.println("deptInsert 호출 성공");
		int result = 0;
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO dept(deptno, dname, loc) ");
        sql.append("VALUES(?, ?, ?)                      ");
        // 물리적으로 떨어져있는 오라클 서버와 통신! 반드시 예외처리가 필요하다.
        // 사용한 자원은 명시적으로 반납처리가 이루어지게 한다 (생성된 역순으로)
        // 왜 역순으로 반납해야하나? >> 의존관계에 있는 것들 때문. (Connection, PreparedStatement, ResultSet)
		try {
			con   = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			// 동적 쿼리를 처리하는 PreparedStatemane에서 ?자리에 필요한 파라미터를 적용하는데
			// 테이블 설계가 바뀌거나 컬럼이 추가되는 경우를 예측하여 최소한 코드 변경이 되도록 변수를 사용해본다.
			// ? 자리는 1부터 이므로 ++i로 시작한다. 만일 1로 초기화 했다면 i++로 하면 될 것이다.
			int i = 0;
			pstmt.setInt   (++i, dvo.getDeptno());
			pstmt.setString(++i, dvo.getDname());
			pstmt.setString(++i, dvo.getLoc());
			// select인 경우 커서를 리턴받고, insert, update, delete인 경우는 int를 리턴받음.
			result = pstmt.executeUpdate();
			// 오라클 서버에서 입력 처리를 성공했을 때 1을 돌려 받는다.
			if(result == 1) {
				System.out.println("데이터가 입력되었습니다.");
				deptSelectAll();
				// 입력 성공 후에 화면에 대한 초기화 - 사용자의 편의성 제공
				setDeptno(0);
				setDname("");
				setLoc("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionMgr.freeConnection(pstmt, con);
		}
        return result;                                  
		
	}
	// 부서 수정 메소드
	public int deptUpdate(DeptVO dvo) {
		System.out.println("deptUpdate 호출 성공");
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE dept                            ");
		sql.append("   SET  dname = ?, loc = ?             ");
		sql.append(" WHERE deptno = ?                      ");
		int result = 0;
		try {
			con   = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			int i = 1;
			pstmt.setString(i++, dvo.getDname());
			pstmt.setString(i++, dvo.getLoc());
			pstmt.setInt   (i++, dvo.getDeptno());
			result = pstmt.executeUpdate();
			if(result == 1) {
				JOptionPane.showMessageDialog(this,"데이터가 수정되었습니다.","Info" ,JOptionPane.INFORMATION_MESSAGE);				
				deptSelectAll();
			}
//			DBConnectionMgr.freeConnection(pstmt, con);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionMgr.freeConnection(pstmt, con);
		}
		return result;
			
		
	}
	// 부서 삭제 메소드
	public int deptDelete(int deptno) { // 전체를 삭제하면 안되니까 반드시 파라미터는 int로!
		System.out.println("deptDelete 호출 성공: " + deptno);
		int result = 0;
		StringBuilder sql = new StringBuilder();
		sql.append("  DELETE FROM dept          ");
		sql.append("   WHERE deptno = ?         ");
		try {
			con   = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1,  deptno);
			result = pstmt.executeUpdate();
			if(result == 1){
				JOptionPane.showMessageDialog(this, "데이터가 삭제되었습니다.", "Error", JOptionPane.INFORMATION_MESSAGE);
				// 삭제가 된 후에 화면 갱신처리 하기! - 동기화 처리가 여기서 진행됨.
				// 입력, 수정, 삭제에서 반복적으로 호출 될 수 있다.
				// List<VO> / List<Map>의 형태
				deptSelectAll(); // 새로고침 메소드 호출하기 - 메소드의 재사용성 - 반복되는 코드를 줄여준다.
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionMgr.freeConnection(pstmt, con);
		}
		return result;
	}
	// 전체 조회 메소드
	public List<Map<String,Object>> deptSelectAll(){
		System.out.println("deptSelectAll 호출 성공");
		List<Map<String,Object>> deptList = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT deptno, dname, loc FROM dept");
		try {
			con   = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs    = pstmt.executeQuery();
			Map<String,Object> rmap = null;
			while (rs.next()) {
				rmap = new HashMap<>(); // 같은 이름의 변수이지만 서로 다른 주소번지를 갖는다.
				rmap.put("deptno",  rs.getInt("deptno"));
				rmap.put("dname",   rs.getString("dname"));
				rmap.put("loc",     rs.getString("loc"));
				deptList.add(rmap); // 순서가 정해진다. 기본 정렬은 오라클에서 하는 것이 빠르다.
			}
			// 기존에 조회된 결과, 즉 목록을 삭제하기.
			while(dtm.getRowCount()>0) {
				// 파라미터에 0을 주어서 테이블의 인덱스가 바뀌는 문제를 해결.
				dtm.removeRow(0);
			}
			// Iterator는 자료구조가 갖고있는 정보의 유무를 체크하는데에 필요한 메소드를 제공하고 있다.
			Iterator<Map<String, Object>> iter = deptList.iterator();
			Object keys[] = null;
			while(iter.hasNext()) {
				Map<String,Object> data = iter.next();
				keys = data.keySet().toArray();
				Vector<Object> oneRow = new Vector<>();
				oneRow.add(data.get(keys[2]));
				oneRow.add(data.get(keys[1]));
				oneRow.add(data.get(keys[0]));
//				System.out.println(keys[2]);
//				System.out.println(keys[1]);
//				System.out.println(keys[0]);
				// 데이터셋인 DefaultTableModel에 조회결과 담기 - 반복처리 => 10, 20, 30, 40
				dtm.addRow(oneRow);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionMgr.freeConnection(rs, pstmt, con); 
		}
		return deptList;
		
	}
	// 상세 조회 메소드
	public DeptVO deptSelectDetail(int deptno) {
		DeptVO rdVO = null;
		System.out.println("deptSelectDetail 호출 성공");
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT deptno, dname, loc FROM dept        ");
		sql.append(" WHERE deptno=?                            ");
		try {
			con   = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1,  deptno);
			rs    = pstmt.executeQuery();
			if(rs.next()) {
				rdVO = new DeptVO();
				rdVO.setDeptno(rs.getInt("deptno"));
				rdVO.setDname(rs.getString("dname"));
				rdVO.setLoc(rs.getString("loc"));
			}
			if(rdVO!=null) {
				setDeptno(rdVO.getDeptno());
				setDname(rdVO.getDname());
				setLoc(rdVO.getLoc());
			}
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			DBConnectionMgr.freeConnection(rs,  pstmt, con);
		}
		return rdVO;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jbtn_sel) {
			System.out.println("전체 조회 호출 성공");
			deptSelectAll();
			
		} else if(obj == jbtn_ins) {
			System.out.println("입력 호출 성공");
			String deptno = getDeptno();
			String dname  = getDname();
			String loc    = getLoc();
//			System.out.println(deptno+", "+dname+", "+loc);
			DeptVO dVO = new DeptVO();
			dVO.setDeptno(Integer.parseInt(deptno));
			dVO.setDname(dname);
			dVO.setLoc(loc);
			deptInsert(dVO);
			
		} else if(obj == jbtn_upd) {
			System.out.println("수정 호출 성공");
			String deptno = getDeptno();
			String dname  = getDname();
			String loc    = getLoc();
			DeptVO dVO = new DeptVO();
			dVO.setDeptno(Integer.parseInt(deptno));
			dVO.setDname(dname);
			dVO.setLoc(loc);
			deptUpdate(dVO);
			
		} else if(obj == jbtn_del) {  // view > action(delete) > action(select all) > view
			System.out.println("삭제 호출 성공");
			int index[] = jtb.getSelectedRows();
			if(index.length == 0){
				JOptionPane.showMessageDialog(this, "삭제할 데이터를 선택하세요", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			} else {
				Integer deptno = (Integer)dtm.getValueAt(index[0],  0);
				System.out.println("사용자가 선택한 부서 번호: " + deptno);
				deptDelete(deptno);
			}
		} else if(obj == jbtn_exit) {
			this.dispose();
		} else if(obj == jbtn_sam) {
			System.out.println("호출");
		}
		
	}//////////// end of actionperformed
	// 각 컬럼의 값들을 설정하거나 읽어오는 getter/setter 메소드
	public String getDeptno() {return jtf_deptno.getText();}
	public void setDeptno(int deptno) { jtf_deptno.setText(String.valueOf(deptno));}
	public String getDname() {return jtf_dname.getText();}
	public void setDname(String dname) { jtf_dname.setText(dname);}
	public String getLoc() {return jtf_loc.getText();}
	public void setLoc(String loc) { jtf_loc.setText(loc);}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		int index[] = jtb.getSelectedRows();
		// 테이블의 데이터를 선택하지 않은 경우
		if(index.length == 0) {
			JOptionPane.showMessageDialog(this, "조회할 데이터를 선택하시오.", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		} 
		int udeptno = 0;
		udeptno = Integer.parseInt(dtm.getValueAt(index [0], 0).toString());
		deptSelectDetail(udeptno);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
