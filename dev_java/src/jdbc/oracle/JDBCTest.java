package jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCTest {

	public static void main(String[] args) {
		// 물리적으로 떨어져있는 오라클 서버와 연결통로를 만든다.
		// 메소드 호출로 객체생성이 가능하다.
		// getConnection(URL, username, pw)
		Connection        con   = null; // Interface - 단독으로 인스턴스 불가 A a = new A()
		// 오라클 서버에 sql문을 전달할 때 사용함.
		PreparedStatement pstmt = null;
		// 조회결과를 받아서 자바에서 출력할 때 오라클에 커서를 조작해야 함.
		ResultSet         rs    = null;
		String sql = "SELECT deptno, dname, loc FROM dept";
		try {
			// 오라클 제조사가 제공하는 드라이버 클래스가 있어야 함. (ojdbc6.jar)
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl11", "scott", "tiger");
			System.out.println(con+"생성되었나요?");
			//파라미터로 받은 select문을 전달
			pstmt = con.prepareStatement(sql);
			//전달 된 select문에 대한 처리를 요청하고 커서 받아내기
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("deptno")+ ", " + rs.getString("dname")+", "+rs.getString("loc"));
			}
		} catch (Exception e) {
			System.out.println("오라클 서버와 연결통로 확보 실패");
			// stack메모리에 쌓인 에러 메세지에 대한 history정보를 출력해줌
			e.printStackTrace();
			
		}
	}

}
