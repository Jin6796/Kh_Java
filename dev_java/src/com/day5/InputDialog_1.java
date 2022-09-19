package com.day5;

import javax.swing.JOptionPane;

// 사용자로 부터 입력받는 값을 읽어오는데 필요한 다이얼로그 화면입니다

public class InputDialog_1 {

	public static void main(String[] args) {
		// 사용자에 의한 첫번째 문자열 입력
		// String name = "이름"; InputDialog에서는 이름을 설정할 수 없음.
		// 이름을 설정하고 싶으면 JOptionPane이 아닌 JDialog를 사용해야한다고 함.
		
		String inputValue = null;
		inputValue = JOptionPane.showInputDialog("당신의 이름은 무엇입니까?");
		System.out.println("당신의 이름은 : " + inputValue);
	} 

}