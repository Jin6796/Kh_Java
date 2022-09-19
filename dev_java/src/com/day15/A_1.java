package com.day15;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JVM으로 자동으로 검색할 수 있는 패키지는 java.lang 뿐이기 때문에 그 밖의 패키지에 대해서는 반드시 import를 해주어야 한다.
import javax.swing.JButton;
import javax.swing.JFrame;

public class A_1 extends JFrame implements ActionListener{ 
	// 인터페이스는 단독으로 인스턴스화가 불가하다. 그래서 인터페이스 안에는 추상메소드만 올 수 있다.
	// 추상메소드란 선언부 뒤에 세미콜론으로 끝나는 것을 말한다.
	// 아래에 있는 initDisplay메소드의 경우 중괄호가 있으므로 추상메소드가 아니다.
	// 메소드 이름 뒤에 세미콜론으로 끝나는 거 메소드 호출이라면서요!?!?!!!!?!??!?? >>>>>> 추상메소드에는 리턴타입이랑 접근제한자가 올 수 있어요.
	// 생성부에는 반드시 구현체 클래스 이름이 와야한다.
//	ActionListener a1 = new A_1 ();
	B_1 b = new B_1();
	JButton jbtn_insert = new JButton("입력");
	JButton jbtn_edit   = new JButton("수정");
	
	public void initDisplay() {
		System.out.println("initDisplay 호출성공");
		// 입력 버튼이 눌려졌을 때 이벤트를 감지하고 콜백함수(콜백메소드)를 호출하는 코드를 추가해야 한다!!!!!
		// 현재 클래스 안에 ActionPerformed라는 메소드가 재정의(오버라이딩)되어있지 않을 때에는 오류가 생긴다.
		// 이벤트 처리를 담당하는 클래스를 외부에 둘 수도 있다.
		jbtn_insert.addActionListener(this);
		// this는 A_1클래스를 의미하고, add 메소드는 JFrame 창에 버튼을 붙이는 기능
		// this에 무엇을 붙일 것인가는 파라미터를 통해서 결정할 수 없다.
		this.add(jbtn_insert);
		this.add(jbtn_edit);
		this.setVisible(true);
		this.setSize(400, 500);
//		FlowLayout API를 이용해서 배치할 때에는 동서남북/중앙 배치 불가.
//		BorderLayout이 기본이라 FlowLayout을 사용하지 않을 때에는 동서남북/중앙 배치 가능.
	    this.setLayout(new FlowLayout());
	}////////// end of initDisplay
	
	public static void main(String[] args) {
//		A_1 a = new A_1();
		A_1 a = null; // 타입만 정해졌다.
		a = new A_1(); 
		//A_1 클래스에 대해서 선언만 되어있고 생성이 되지 않은 상태에서 메소드 호출이 일어났다.
		a.initDisplay(); // NullPointerException이 발생하면 그 뒤에 어떤 코드도 실행기회를 얻지 못한다.
	}
	
	// 아래 메소드는 ActionListener라는 인터페이스 선언되어 있는 추상메소드이다.
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
