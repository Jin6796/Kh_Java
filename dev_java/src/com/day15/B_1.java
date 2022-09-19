package com.day15;

import javax.swing.JDialog;

public class B_1 extends JDialog {
	public B_1() {
		System.out.println("B 디폴트 생성자 호출 성공: 전역 변수 초기화 > 선언 시 초기화 생략 가능");
		initDisplay();
	}
	public void initDisplay() {
		this.setTitle("자손창 - 다이얼로그");
		this.setSize(300, 500);
		this.setVisible(true);
	}
}