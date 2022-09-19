package address.view3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisterAddrEty {
	DBConnectionMgr dbMgr = new DBConnectionMgr();
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuilder sql = new StringBuilder();
	
    /****************************************************************************
     * 회원등록 구현
	   INSERT INTO mkaddrtb(id, name, address, telephone
                          , gender, relationship, birthday
                          , comments, registedate)
                     values(11,?,?,?,?,?,?,?,'2022-04-16')
     * @param vo - 사용자가 입력한 값 담기
     * @return - 등록 성공 여부 담기
     ***************************************************************************/
	
	public AddressVO register(AddressVO vo) {
		System.out.println("RegisterAddrEty register 호출 성공");

		
		sql.append("INSERT INTO MKADDRTB(id, name, address, telephone             "); 
		sql.append("                   , gender, relationship, birthday             ");
		sql.append("                   , comments, registedate)                     ");
		sql.append(" VALUES(seq_MKADDRTB_id.nextval ,                             ");
		sql.append(" ?,?,?,?,?,?,?, to_char(sysdate,'yyyy-mm-dd'))                  ");
		
		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			int i = 0;
			int result = 0;
			
			pstmt.setString(++i, vo.getName());
			pstmt.setString(++i, vo.getAddress());
			pstmt.setString(++i, vo.getTelephone());
			pstmt.setString(++i, vo.getGender());
			pstmt.setString(++i, vo.getRelationship());
			pstmt.setString(++i, vo.getBirthday());
			pstmt.setString(++i, vo.getComments());
			
			
			result = pstmt.executeUpdate();
			
			if (result == 1) {
				System.out.println("데이터가 입력되었습니다.");
				vo.setResult(1);
			}else {
				System.out.println("데이터 입력에 실패하였습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionMgr.freeConnection(pstmt, con);
		}
		
		return vo;
	}

}
