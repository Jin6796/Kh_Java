package ajdbc.crud;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

public class DeptView extends JFrame implements ActionListener, MouseListener {
	// 선언부
	JPanel jp_north = new JPanel(); // JFrame의 디폴트 레이아웃은 FlowLayout
	JButton jbtn_sel = new JButton("조회");
	JButton jbtn_ins = new JButton("입력");
	JButton jbtn_upd = new JButton("수정");
	JButton jbtn_del = new JButton("삭제");
	JButton jbtn_sam = new JButton("메롱");
	JButton jbtn_exit = new JButton("종료");
	// 서로 의존관계에 있다. - '의존성 주입(인스턴스화-싱글톤패턴)', '객채 주입법', 'annotation'
	String cols[]   = { "부서번호", "부서명", "지역" };
	String data[][] = new String[0][3];
	DefaultTableModel dtm = new DefaultTableModel(data, cols);
	JTable jtb = new JTable(dtm);
	JScrollPane jsp = new JScrollPane(jtb);
	// 테이블의 로우에 바인딩하기 - UI 솔루션 기본 제공
	JPanel jp_south = new JPanel();
	JTextField jtf_deptno = new JTextField("", 10);
	JTextField jtf_dname  = new JTextField("", 10);
	JTextField jtf_loc    = new JTextField("", 10);
	DeptController deptCtrl = new DeptController(this);

	public DeptView() {
		jbtn_sel.addActionListener(this);
		jbtn_ins.addActionListener(this);
		jbtn_upd.addActionListener(this);
		jbtn_del.addActionListener(this);
		jbtn_sam.addActionListener(this);
		jbtn_exit.addActionListener(this);
		jtb.addMouseListener(this);
		initDisplay();
	}
	public void initDisplay() {
		jp_north.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp_north.add(jbtn_sel);
		jp_north.add(jbtn_ins);
		jp_north.add(jbtn_upd);
		jp_north.add(jbtn_del);
		jp_north.add(jbtn_sam);
		jp_north.add(jbtn_exit);
		jp_south.add(jtf_deptno);
		jp_south.add(jtf_dname);
		jp_south.add(jtf_loc);
		this.add("North", jp_north);
		this.add("Center", jsp);
		this.add("South", jp_south);
		this.setSize(400, 400);
		this.setTitle("부서관리시스템");
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new DeptView();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
//		int index[] = jtb.getSelectedRows();
//		// 테이블의 데이터를 선택하지 않은 경우
//		if (index.length == 0) {
//			JOptionPane.showMessageDialog(this, "조회할 데이터를 선택하시오.", "Error", JOptionPane.ERROR_MESSAGE);
//			return;
//		}
//		int udeptno = 0;
//		udeptno = Integer.parseInt(dtm.getValueAt(index[0], 0).toString());
//		DeptVO dVO = new DeptVO();
//		dVO.setCommand("select");
//		dVO.setDeptno(udeptno);
//		deptCtrl.send(dVO);

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

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == jbtn_sel) {
			System.out.println("전체 조회 호출 성공");
			deptCtrl.deptSelectAll();

		} else if (obj == jbtn_ins) {
			System.out.println("입력 호출 성공");
			String deptno = getDeptno();
			String dname = getDname();
			String loc = getLoc();
//			System.out.println(deptno+", "+dname+", "+loc);
			DeptVO pdVO = new DeptVO();
			pdVO.setCommand("insert");
			pdVO.setDeptno(Integer.parseInt(deptno));
			pdVO.setDname(dname);
			pdVO.setLoc(loc);
			deptCtrl.send(pdVO);

		} else if (obj == jbtn_upd) {
			System.out.println("수정 호출 성공");
			String deptno = getDeptno();
			String dname = getDname();
			String loc = getLoc();
			DeptVO pdVO = new DeptVO();
			pdVO.setCommand("update");
			pdVO.setDeptno(Integer.parseInt(deptno));
			pdVO.setDname(dname);
			pdVO.setLoc(loc);
			deptCtrl.send(pdVO);

		} else if (obj == jbtn_del) { // view > action(delete) > action(select all) > view
			System.out.println("삭제 호출 성공");
			int index[] = jtb.getSelectedRows();
			if (index.length == 0) {
				JOptionPane.showMessageDialog(this, "삭제할 데이터를 선택하세요", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			} else {
				Integer deptno = (Integer) dtm.getValueAt(index[0], 0);
				System.out.println("사용자가 선택한 부서 번호: " + deptno);
				DeptVO pdVO = new DeptVO();
				pdVO.setCommand("delete");
				pdVO.setDeptno(deptno);
				deptCtrl.send(pdVO);
			}
			
			
		} else if (obj == jbtn_exit) {
			this.dispose();
		} else if(obj == jbtn_sam) {
			System.out.println("메! 롱! 메! 롱!");
		}
	}
	public String getDeptno() {return jtf_deptno.getText();}
	public void setDeptno(int deptno) { jtf_deptno.setText(String.valueOf(deptno));}
	public String getDname() {return jtf_dname.getText();}
	public void setDname(String dname) { jtf_dname.setText(dname);}
	public String getLoc() {return jtf_loc.getText();}
	public void setLoc(String loc) { jtf_loc.setText(loc);}

}
