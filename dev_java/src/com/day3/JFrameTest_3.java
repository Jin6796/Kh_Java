package com.day3;

import javax.swing.JFrame;

public class JFrameTest_3 {
	// 선언부
	JFrame jf = new JFrame();
	int width = 400; int height = 300; //변수 선언 
	public void initDisplay() {
		System.out.println("initDisplay 호출 성공");
		jf.setSize(width,height);//변수 사용
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setTitle("최경진");
	}// end of initDisplay 
	public static void main(String[] args) {
		// non-static 타입의 변수는 static이 붙어있는 메인 메소드 안에서는 
		// static이 붙어있지 않은 7번(JFrame) 변수명을 메인 메소드 안에서는 사용할 수 없다.
		JFrameTest_3 jft = new JFrameTest_3();
		jft.initDisplay();
		

	}

} // end of JFrameTest_3
