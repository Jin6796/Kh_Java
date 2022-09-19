package address.view3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class ModifyAddrEty {
	DBConnectionMgr dbMgr = new DBConnectionMgr();
	Connection con = null;
	PreparedStatement pstmt = null;
	StringBuilder sql = new StringBuilder();
	AddressBook book = new AddressBook();

	public AddressVO modify(AddressVO vo) {
		
		sql.append(" UPDATE mkaddrtb                                                           ");
        sql.append("    SET name = ? , address = ?, telephone = ?, gender = ?,                 ");
        sql.append("        relationship = ?, birthday = ?, comments = ?, registedate = ?      ");   
        sql.append("  WHERE id = ?                                                             ");		
		
        
        try {
        	con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			int i = 1;
			int result = 0;
			
			pstmt.setString(i++, vo.getName());
			pstmt.setString(i++, vo.getAddress());
			pstmt.setString(i++, vo.getTelephone());
			pstmt.setString(i++, vo.getGender());
			pstmt.setString(i++, vo.getRelationship());
			pstmt.setString(i++, vo.getBirthday());
			pstmt.setString(i++, vo.getComments());
			pstmt.setString(i++, vo.getRegistedate());

			pstmt.setInt(i++,  vo.getId());
			
			result = pstmt.executeUpdate();
			
			if (result==1) {
				JOptionPane.showMessageDialog(book, "데이터가 수정되었습니다.", "INFO", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(book, "오류가 발생하였습니다.", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionMgr.freeConnection( pstmt, con );
		}
		
		System.out.println("ModifyAddrEty modify 호출 성공");
		return vo;
	}

}
