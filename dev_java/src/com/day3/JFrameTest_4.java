package com.day3;

import javax.swing.JFrame;

public class JFrameTest_4 {
	// 선언부
	JFrame jf = new JFrame();
	int width = 400; int height = 300;  
	// 타입 변수명(내 마음대로! a,b,c...>>디진다 진짜) = 값
	String name = "최경진";
	public void initDisplay() {
		
		System.out.println("뿡");
		
		jf.setSize(width,height);
		jf.setTitle(name);// 홍길동 출력
		jf.setTitle("이순신");// 문자열 상수 > 이순신으로 덮어쓰기, 출력
		jf.setLayout(null);		
		jf.setVisible(true);
		
		/// 
	}// end of initDisplay 
	public static void main(String[] args) {
		JFrameTest_4 jft = new JFrameTest_4();
		jft.initDisplay();
		

	}

} // end of JFrameTest_4
