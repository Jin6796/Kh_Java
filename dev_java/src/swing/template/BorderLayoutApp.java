package swing.template;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;

// BorderLayoutApp.java 소스는 하나인데 클래스는 두 개가 만들어짐
// "BorderLayoutView.class" & "BorderLayoutApp.class"
class BorderLayoutView{
	// 인스턴스화 하기 - syntax >> 타입 인스턴스변수명 = new 클래스명();// 생성자
	// 생긴 모양이 괄호가 있으면 셋 중에 하나. "메소드, 생성자, Casting연산자"
	// 예습할거면.. 메소드 오버라이딩과 메소드 오버로딩에 대해서!
	JFrame jf = new JFrame ();
	// 상수로 되어있는 것들을 변수로 바꿔보자
//	String send = "전송";
	JButton jbtn_north = new JButton("북쪽");
	JButton jbtn_south = new JButton("남쪽");
	JButton jbtn_east = new JButton("동쪽");
	JButton jbtn_west = new JButton("서쪽");
	JButton jbtn_center = new JButton("중앙");
	
	int width = 400; int height = 350;
	
	public void initDisplay() {
		//실행문
		System.out.println("initDisplay 호출 성공");
		jbtn_north.setBackground(Color.LIGHT_GRAY); // 버튼 색깔 설정
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
//		String north = "North"; // 버튼을 배치할 위치 정보를 담는 변수 선언

	}
}
public class BorderLayoutApp {
	
	public static void main(String[] args) {
		//insert here
		//클래스타입 변수명(주소번지 출력) = new 클래스명();
		BorderLayoutView blView = new BorderLayoutView();
		blView.initDisplay();
		
	} 

}
