package com.day3;

import javax.swing.JFrame;

public class JFrameTest_2 {
	// 선언부
	JFrame jf = new JFrame();
	int width = 600;
	public void initDisplay() {
		System.out.println("initDisplay 호출 성공");
		jf.setSize(500,400);
		jf.setSize(width,400); // 같은 마지막 코드로 결정이 되기 때문에 위의 (500, 400)은 실행되지 X
		jf.setLayout(null);
		jf.setVisible(true);
	}// end of initDisplay 
	public static void main(String[] args) {
		// non-static 타입의 변수는 static이 붙어있는 메인 메소드 안에서는 
		// static이 붙어있지 않은 7번(JFrame) 변수명을 메인 메소드 안에서는 사용할 수 없다.
		JFrameTest_2 jft = new JFrameTest_2();
		jft.initDisplay();
		

	}
	
} //end of JFrameTest_2
