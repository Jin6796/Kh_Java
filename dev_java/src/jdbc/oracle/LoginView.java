package jdbc.oracle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginView extends JFrame implements ActionListener {
	JPanel	   jp_center  = new JPanel();
	JTextField jtf_id     = new JTextField("",10);
	JTextField jtf_pw     = new JTextField("",10);
	JPanel 	   jp_east    = new JPanel();
	JButton    jbtn_login = new JButton("로그인");
	
	LoginView(){
		jbtn_login.addActionListener(this);
		initDisplay();
		}
			
	public void initDisplay() {
		this.setVisible(true);
		jp_center.setBackground(Color.orange);
		jp_center.setLayout(new GridLayout(2,1));
		jp_center.add(jtf_id);
		jp_center.add(jtf_pw);
		jp_east.setBackground(Color.green);
		jp_east.setLayout(new BorderLayout());
		jp_east.add("Center", jbtn_login);
		this.setTitle("짭톡");
		this.add("Center", jp_center);
		this.add("East", jp_east);
		this.setSize(300, 100);
	}
		
	public static void main(String[] args) {
		new LoginView();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (jbtn_login == obj) {
			System.out.println("로그인 호출 성공");
			// 사용자가 화면에 입력하는 ID를 담기
			String user_id = jtf_id.getText();
			// 사용자가 화면에 입력하는 비밀번호를 담기
			String user_pw = jtf_pw.getText();
			// 오라클 서버에서의 반환 값 담기
			String result = ""; // 이름(1) or 0(비밀번호가 틀림) or -1(아이디가 존재하지 않음)
			LoginDao loginDao = new LoginDao(); // 이제 더 이상 initDisplay가 호출되지 않는다.
			// 사용자가 입력한 ID와 비밀번호를 Dao 클래스의 로그인 메소드에 파라미터로 넘김
			result = loginDao.login(user_id, user_pw);
			// 위에서 오라클 서버에 요청한 결과를 출력하기
			System.out.println("result: " + result);
			
		}
		
		
	}

}
