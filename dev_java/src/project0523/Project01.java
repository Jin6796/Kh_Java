package project0523;

public class Project01 {

	public static void main(String[] args) {

/*	
 * 로우 4개, 컬럼 3개(부서번호,부서이름,위치)  >> List랑 Map으로 관리하세요 <제네릭> -- Map은 뭘로 관리한다? key로
 * deptno = key(String)
 * 		
 * List(로우) < Map < String(컬럼명)--key, 값--value (10, research, Sicago)
 * 부서번호의 타입은 숫자고 부서이름은 String이잖아? 타입이 다르니까 Object로 담자. >> 꺽새 사용 <>
 * 
 * int deptno[] = {10,20,30}; 타입이 같은 애들은 배열로 정리 (칼럼)
 * String dname[] =                                         >>>>>>> 망한다~ 
 * 
 * SELECT  deptno, dname, loc // 얘를 String으로.
 *   FROM  dept		
 *   
 *   class.forName(oracle.jdbc.driver.OracleDriver); << 재조사를 위한 접근
 *   Connection con = DriverManager.getConnection(url,user,pw)<< 연결통로 // DriverManager:클래스이름
 *                                 url: ip 주소, port번호, sid 타입
 *   PreparedStatement pstmt = con.prepareStatement("select문");
 *   ResultSet rs = pstmt.executeQuery(); // 오라클아 셀렉트문 좀 처리해주실 수?
 *   while(rs.next()) //true: 로우가 있다. false: 로우가 없다.// 로우가 네 개라서 네 번 반복한다 > 맵은 while문 안에서 인스턴스화(총 네 번)
 *   list.add(rmap) 
 */	
		
		
		
	}

}
