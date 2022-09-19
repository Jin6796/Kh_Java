package jdbc.oracle;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import address.view2.DBConnectionMgr;

public class LoginDao extends JFrame implements ActionListener {
	JPanel jp_north = new JPanel();
	JPanel jp_north_first = new JPanel();
	JPanel jp_north_second = new JPanel();
	JPanel jp_south = new JPanel();
	JPanel jp_center = new JPanel();
	JTextField jtf_id = new JTextField("", 10);
	JTextField jtf_pw = new JTextField("", 20);
	JButton jbtn_check = new JButton("ID 중복검사");
	JButton jbtn_check2 = new JButton("PW 보안확인");
	JButton jbtn_join = new JButton("회원가입");
	JButton jbtn_exit = new JButton("종료");
	boolean isIDCheck = false;

	public LoginDao() {
		jbtn_check.addActionListener(this);
		jbtn_check2.addActionListener(this);
		jbtn_exit.addActionListener(this);
		// 화면을 그리는 메소드 호출
//		initDisplay();
	}

	public void initDisplay() {
		jp_north.setLayout(new GridLayout(2,1));
		jp_north_first.setLayout(new BorderLayout());
		jp_north_first.add("Center",jtf_id);
		jp_north_first.add("East",jbtn_check);
		jp_north_second.setLayout(new BorderLayout());
		jp_north_second.add("Center",jtf_pw);
		jp_north_second.add("East",jbtn_check2);
//		jp_north_second.setLayout(new GridLayout(2,1));
		jp_north.add(jp_north_first);
		jp_north.add(jp_north_second);
		this.add("North", jp_north);
		//jp_north.add("East", jbtn_check);
		//jp_north.add("Center", jtf_id);
		//jp_north.add("South", jtf_pw);
		this.add("South", jp_south);
		jbtn_join.setEnabled(false);
//		jp_south.setLayout(new BorderLayout());
//		jp_south.setLayout(new GridLayout(1, 2));
		jp_south.add("East", jbtn_exit);
		jp_south.add("West", jbtn_join);
		//this.add("Center", jp_center);
		//jp_center.add("East", jbtn_check2);
		this.setSize(500, 400);
		this.setVisible(true);
		this.setTitle("회원가입");
	}
	/*******************************************************************
	 * 로그인 구현
	 * @param mem_id - 사용자가 입력한 아이디 받아오기
	 * @param mem_pw - 사용자가 입력한 비밀번호 받아오기
	 * @return mem_name: 아이디, 비밀번호 일치, 0: 비밀번호 오류, -1: 아이디 존재X
	 *******************************************************************/
	
	public String login(String mem_id, String mem_pw) {
		String mem_name = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String result = "";
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT result                                            ");
		sql.append("FROM (SELECT                                             ");
		sql.append("          CASE                                           ");
		sql.append("             WHEN mem_id =? AND mem_pw =? THEN mem_name  ");
		sql.append("             WHEN mem_id =? AND mem_pw!=? THEN '0'       ");
		sql.append("             ELSE '-1'                                   ");
		sql.append("            END as result                                ");
		sql.append("      FROM member                                        ");
		sql.append("      ORDER BY result desc                               ");
		sql.append("      )                                                  ");
		sql.append("WHERE rownum = 1                                         ");
	DBConnectionMgr dbMgr = new DBConnectionMgr();
	try {                                                   
		con = dbMgr.getConnection();
		pstmt = con.prepareStatement(sql.toString());
		pstmt.setString(1, mem_id);
		pstmt.setString(2, mem_pw);
		pstmt.setString(3, mem_id);
		pstmt.setString(4, mem_pw);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			System.out.println("mem_name: " + mem_name);
			mem_name = rs.getString("result");
		}
	} catch (Exception e) {
		System.out.println(e.toString());
	}
	return mem_name;
	}
	
	/*********************************************************************************
	 * 아이디 중복체크
	 * @param mem_id - 사용자가 입력한 아이디
	 * @return 1: 아이디 존재함, 0: 아이디 사용가능함, -1: 디폴트 - end of file
	 *********************************************************************************/
	public int idCheck(String mem_id) {
		// 물리적으로 떨어져있는 오라클 서버와 연결통로 만들기
		Connection con = null;
		// 오라클 서버에 작성한 select문 전달하고 오라클 서버에 처리 요청할 때 사용
		PreparedStatement pstmt = null;
		// 조회 결과를 자바코드로 가져올 때 필요 - 오라클 서버의 커서를 조작하는데 필요함.
		ResultSet rs = null;
		int result = -1;
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT NVL((                                ");
	    sql.append("       SELECT 1                             ");
	    sql.append("         FROM dual                          ");
	    sql.append("        WHERE EXISTS (SELECT mem_name       ");
	    sql.append("                        FROM member         ");
	    sql.append("                       WHERE mem_id=?)      ");
	    sql.append("       ), 0) 								");
	    sql.append(" FROM dual                                  ");
	    DBConnectionMgr dbMgr = new DBConnectionMgr();
		try {                                                   
			con = dbMgr.getConnection();
			//?자리에 들어갈 아이디를 설정해야함
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, mem_id);
			// select 처리는 executeQuery()호출, insert나 update, delete는 excuteUpdate()호출
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt(1);
			}
			System.out.println("result: " + result);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}

	public static void main(String[] args) {
		LoginDao loginDao = new LoginDao();
		loginDao.initDisplay();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		// 버튼 눌렸어?
		if (obj == jbtn_check) {
			System.out.println("ID 중복체크 호출 성공");
			// 사용자가 입력한 아이디를 가져와 담기
			String user_id = jtf_id.getText();
			int result = idCheck(user_id);
			// 입력한 아이디가 존재하는거야?

			if (result == 1) {
				// 입력한 아이디는 사용 못해.
				// 다시 입력해야 한다.
				jtf_id.setText("");
				JOptionPane.showMessageDialog(this, "입력한 아이디는 사용할 수 없습니다.", 
						                     "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}

			// 입력한 아이디가 없는데?
			else if (result == 0) {
				// 입력한 아이디를 사용할 수 있어
				JOptionPane.showMessageDialog(this, "입력한 아이디는 사용할 수 있습니다.", 
											 "INFO", JOptionPane.INFORMATION_MESSAGE);
				jbtn_check.setEnabled(false);
				jtf_id.setEnabled(false);
				isIDCheck = true;
				jbtn_join.setEnabled(isIDCheck);
			}
		}
		if (obj == jbtn_exit) {
			this.dispose();
			System.out.println("화면 종료 호출 성공");
		}
		if (obj == jbtn_check2) {
			System.out.println("비밀번호 보안 호출 성공");
		}
	}

}
