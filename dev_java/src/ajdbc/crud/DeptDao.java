package ajdbc.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import address.view3.DBConnectionMgr;
import oracle.vo.DeptVO;

public class DeptDao {
	DeptView deptview = null;
	DBConnectionMgr dbMgr = new DBConnectionMgr();
	Connection con = null; 
	PreparedStatement pstmt = null; 
	ResultSet rs = null; 

	// 디폴트 생성자는 생성자가 하나도 없을 경우에만 제공됨.
	// 파라미터를 갖는 생성자가 하나라도 있으면 디폴트 생성자도 제공안됨
	public DeptDao() {}
	public DeptDao(DeptView deptview) {
		this.deptview = deptview;
		
	}
	public int deptInsert(DeptVO pdvo) {
		System.out.println("deptInsert 호출 성공");
		int result = 0;
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO dept(deptno, dname, loc) ");
		sql.append("VALUES(?, ?, ?)                      ");
		// 물리적으로 떨어져있는 오라클 서버와 통신. 반드시 예외처리가 이루어져야한다.
		// 사용한 자원은 명시적으로 반납해준다. 왜 생성한 역순으로 반납을 해야할까? >> 의존관계에 있기 때문에.
		try {
			con = dbMgr.getConnection();
			// 생략이 가능하다. false면 커밋이 안된다.
			// 굳이 저렇게 해야하는 이유가 있나? throw new Exception()
			// false면 커밋하지 말고 기다려?
			// XXX.masterInsert();
			// XXX.detailInsert();
			// con.commit();  >> 이걸 트랜잭션 처리라고 한다.
			pstmt = con.prepareStatement(sql.toString());
			int i = 0;
			pstmt.setInt(++i, pdvo.getDeptno());
			pstmt.setString(++i, pdvo.getDname());
			pstmt.setString(++i, pdvo.getLoc());
			result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("데이터가 입력되었습니다.");
				deptSelectAll();
				deptview.setDeptno(0);
				deptview.setDname("");
				deptview.setLoc("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionMgr.freeConnection(pstmt, con);
		}
		return result;

	}

	// 부서 수정 메소드
	public int deptUpdate(DeptVO pdvo) {
		System.out.println("deptUpdate 호출 성공");
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE dept                            ");
		sql.append("   SET  dname = ?, loc = ?             ");
		sql.append(" WHERE deptno = ?                      ");
		int result = 0;
		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			int i = 1;
			pstmt.setString(i++, pdvo.getDname());
			pstmt.setString(i++, pdvo.getLoc());
			pstmt.setInt(i++, pdvo.getDeptno());
			result = pstmt.executeUpdate();
			if (result == 1) {
				JOptionPane.showMessageDialog(deptview, "데이터가 수정되었습니다.", "Info", JOptionPane.INFORMATION_MESSAGE);
				deptSelectAll();
			}
//				DBConnectionMgr.freeConnection(pstmt, con);
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
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, deptno);
			result = pstmt.executeUpdate();
			if (result == 1) {
				JOptionPane.showMessageDialog(deptview, "데이터가 삭제되었습니다.", "Error", JOptionPane.INFORMATION_MESSAGE);
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
	public List<Map<String, Object>> deptSelectAll() {
		System.out.println("deptSelectAll 호출 성공");
		List<Map<String, Object>> deptList = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT deptno, dname, loc FROM dept");
		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			Map<String, Object> rmap = null;
			while (rs.next()) {
				rmap = new HashMap<>(); // 같은 이름의 변수이지만 서로 다른 주소번지를 갖는다.
				rmap.put("deptno", rs.getInt("deptno"));
				rmap.put("dname", rs.getString("dname"));
				rmap.put("loc", rs.getString("loc"));
				deptList.add(rmap); // 순서가 정해진다. 기본 정렬은 오라클에서 하는 것이 빠르다.
			}
			// 기존에 조회된 결과, 즉 목록을 삭제하기.
			while (deptview.dtm.getRowCount() > 0) {
				// 파라미터에 0을 주어서 테이블의 인덱스가 바뀌는 문제를 해결.
				deptview.dtm.removeRow(0);
			}
			// Iterator는 자료구조가 갖고있는 정보의 유무를 체크하는데에 필요한 메소드를 제공하고 있다.
			Iterator<Map<String, Object>> iter = deptList.iterator();
			Object keys[] = null;
			while (iter.hasNext()) {
				Map<String, Object> data = iter.next();
				keys = data.keySet().toArray();
				Vector<Object> oneRow = new Vector<>();
				oneRow.add(data.get(keys[2]));
				oneRow.add(data.get(keys[1]));
				oneRow.add(data.get(keys[0]));
//					System.out.println(keys[2]);
//					System.out.println(keys[1]);
//					System.out.println(keys[0]);
				// 데이터셋인 DefaultTableModel에 조회결과 담기 - 반복처리 => 10, 20, 30, 40
				deptview.dtm.addRow(oneRow);
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
		System.out.println("deptSelectDetail 호출 성공");
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT deptno, dname, loc FROM dept        ");
		sql.append(" WHERE deptno=?                            ");
		DeptVO rdVO = null;
		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				rdVO = new DeptVO();
				rdVO.setDeptno(rs.getInt("deptno"));
				rdVO.setDname(rs.getString("dname"));
				rdVO.setLoc(rs.getString("loc"));
			}
			if (rdVO != null) {
				deptview.setDeptno(rdVO.getDeptno());
				deptview.setDname(rdVO.getDname());
				deptview.setLoc(rdVO.getLoc());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionMgr.freeConnection(rs, pstmt, con);
		}
		return rdVO;
	}
	
}
