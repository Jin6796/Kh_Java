package swing.template;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//이벤트 처리를 담당하는 인터페이스가 필요해요(ActionListener > 이너페이스 > 인터페이스가 정의하고있는 action)
class BorderLayoutView_1_2 implements ActionListener{ 
	JFrame jf = new JFrame ();
	JButton jbtn_north = new JButton("북쪽");
	JButton jbtn_south = new JButton("남쪽");
	JButton jbtn_east = new JButton("동쪽");
	JButton jbtn_west = new JButton("서쪽");
	JButton jbtn_center = new JButton("중앙");
	int width = 400; int height = 350;
	public BorderLayoutView_1_2() {
		System.out.println("디폴트 생성자 호출 성공");
		//이벤트 소스(주소번지)와 
		jbtn_north.addActionListener(this);
	}
	
	public void initDisplay() {
		System.out.println("initDisplay 호출 성공");
		jbtn_north.setBackground(Color.LIGHT_GRAY);
//		String north = "North"; // 버튼을 배치할 위치 정보를 담는 변수 선언
		jf.add("North", jbtn_north);
		jf.add("South", jbtn_south);
		jf.add("West", jbtn_west);
		jf.add("East", jbtn_east);
		jf.add("Center", jbtn_center);
		jf.setSize(width, height);
		jf.setVisible(true); 
//		String loc[] = {"North", "South", "Center", "East", "West"};
//		JButton[] jbtns = new JButton[5];
//		jbtns[0] = jbtn_north;		
//		jbtns[0] = jbtn_south;		
//		jbtns[0] = jbtn_east;		
//		jbtns[0] = jbtn_west;		
//		jbtns[0] = jbtn_center;	
	}
	// 메소드 오버라이딩 = 어노테이션
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource(); //이벤트 소스를 가져온다
		System.out.println("주소번지 @4321bbca"+obj);
		String jbtnLabel = e.getActionCommand();
		System.out.println(jbtnLabel);
		if(jbtn_north == obj) {
			System.out.println("북쪽 버튼 클릭 성공");
		}
	}
}
public class BorderLayoutApp_1_2 {
	
	public static void main(String[] args) {
		//insert here
		//클래스타입 변수명(주소번지 출력) = new 클래스명();
		BorderLayoutView_1_2 blView_1 = new BorderLayoutView_1_2();
		blView_1.initDisplay();
		
	} 

}
