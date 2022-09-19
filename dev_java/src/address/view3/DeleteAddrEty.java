package address.view3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class DeleteAddrEty {
	
	public AddressVO delete(AddressVO vo) {
		
		DBConnectionMgr dbMgr = new DBConnectionMgr();
		Connection con = null; 
		PreparedStatement pstmt = null; 
		ResultSet rs = null; 
		AddressBook book = new AddressBook();
		
		int result = 0;
		StringBuilder sql = new StringBuilder();
		sql.append("  DELETE FROM mkaddrtb          ");
		sql.append("   WHERE id = ?                 ");
		
		try {
			
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, vo.getId());
			
			result = pstmt.executeUpdate();
			if (result == 1) {
				JOptionPane.showMessageDialog(book, "데이터가 삭제되었습니다.", "INFO", JOptionPane.INFORMATION_MESSAGE);
	 			vo.setResult(result);
			} else {
				JOptionPane.showMessageDialog(book, "오류가 발생하였습니다.", "ERROR", JOptionPane.ERROR_MESSAGE);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionMgr.freeConnection(pstmt, con);
		}
		
		System.out.println("DeleteAddrEty delete 호출 성공");
		return null;
	}

}
