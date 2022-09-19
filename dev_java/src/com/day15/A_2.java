package com.day15;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JVM으로 자동으로 검색할 수 있는 패키지는 java.lang 뿐이기 때문에 그 밖의 패키지에 대해서는 반드시 import를 해주어야 한다.
import javax.swing.JButton;
import javax.swing.JFrame;
// ActionListener가 인터페이스이다.
// 이때 추상메소드인 actionPerformed를 오버라이딩해야한다.
public class A_2 extends JFrame implements ActionListener{ 
	B_2 b = new B_2();
	JButton jbtn_insert = new JButton("입력");
	JButton jbtn_edit   = new JButton("수정");
	JButton jbtn_detail = new JButton("상세보기");
	
	public void initDisplay() {
		System.out.println("initDisplay 호출성공");
		jbtn_insert.addActionListener(this);
		jbtn_edit.addActionListener(this);
		jbtn_detail.addActionListener(this);
		this.add(jbtn_insert);
		this.add(jbtn_edit);
		this.add(jbtn_detail);
		this.setTitle("임시 창");
		this.setVisible(true);
		this.setSize(400, 500);
	    this.setLayout(new FlowLayout());
	}////////// end of initDisplay
	
	public static void main(String[] args) {
		// 이것을 예외처리라고 한다. try...catch블록을 사용!!
		// 단축키: try + ctrl + space + enter
		try {
			// 예외가 발생할 가능성이 있는 코드 집어 넣기
			A_2 a = new A_2(); 
			a.initDisplay(); 
		} catch (Exception e) {
			System.out.println("NullPointerException 발생");
		}
		System.out.println("initDisplay 호출 후 ...");
	}
	// JVM이 정의하고 있는 객체 중에 JVM이 대신 인스턴스화 해주는 클래스가 있다.
	// 의존성 주입 - 필요할 때 알아서 해줌.
	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트 버튼을 누르는 건 사용자이지만, 느끼는 건 JVM!
		// JVM이 느낀 버튼의 주소번지를 가져오는 메소드가 있다. >> e.getSourse
		// 더 큰 타입은 더 작은 방에 대입할 수 없다. 오른쪽이 작아야한다.
		// 강제 형전환!?
		Object obj = e.getSource();
		// 어라. 아깐 NullPointerException이 떴는데? 뭐징?
		if(obj == jbtn_insert) { // JVM이 감지한 주소번지와 개발자가 선언한 주소번지가 같니?
			System.out.println("입력버튼 눌렸다");
		} else if(obj == jbtn_edit) {
			System.out.println("수정버튼 눌렸다");
		} else if(obj == jbtn_detail) {
			System.out.println("상세보기 버튼 눌렸다");
		}
	}

}
