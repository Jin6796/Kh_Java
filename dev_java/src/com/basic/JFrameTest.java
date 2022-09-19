package com.basic;

public class JFrameTest { //1. 클래스 선언
	// 선언부
	
	// 화면그리기 >> non-static 메소드
	public void initDisplay()  { // static이 없음
		// insert here 
	}
	public static void methodA() { // static이 있음
		System.out.println("methodA 호출 성공");
	}
	// 메인메소드 >> static 메소드
	public static void main(String[] args) {
		// 인스턴스화를 통해서 선언된 변수명을 인스턴스 변수라고 부른다.
		JFrameTest jft = new JFrameTest ();
		// 내 안에 있는 메소드라 하더라도 static 영역 안에서 non-static 메소드를 호출할 수 X
		// 본래 내 안에 선언된 메소드는 내 안에서는 호출 가능
		jft.initDisplay(); //jft는 인스턴스 변수! 
		// static이 붙은 메소드는 인스턴스화 없이도 사용 가능
		methodA();
	}

}// end of JFrameTest

/*
 * static 영역 안에서 non-static 타입의 변수나 메소드를 호출 할 수 없다.
 * 선언부에 선언된 변수나 메소드는 본래 클래스 내부에서는 언제든 어느 위치에서 호출 할 수 있는데
 * 위의 경우는 예외인 것이다.
 * 문제 해결방법
 * : non-static 타입의 변수나 메소드를 사용할 때에는 인스턴스화를 하면 접근이 가능함.
 */