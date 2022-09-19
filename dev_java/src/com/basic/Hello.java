package com.basic;
// crtl+s => 저장+javac Hello.jave => Hello.class
// jave Hello 엔터
// public은 접근제한자라고 한다 
// public > protected > friendly > private
// 접근제한자 public같은 예약어는 변수명으로 사용불가
// class는 클래스 선언 시 사용하는 예약어
public class Hello {
	// 선언부 - 변수 선언 및 초기화를 할 수 있음
	// 변수와 메소드를 선언할 수 있음
	// 변수 선언을 통해서 데이터를 담을 수 있음
	// 변수 타입의 변수명 대입연산자 값
	int age = 25;
// 클래스 영역, 클래스 안에는 변수와 메소드가 존재. 변수에는 데이터(숫자, 문자열, 참 또는 거짓)를 담음
	// 메인 메소드가 있어야 exe파일로 만들 수 있음
	// 메인 메소드가 entry point! - 제일 먼저 실행됨
	// 메인 스레드
	// 코드가 많아도 가장 먼저 실행되는 곳이 main 메소드.
	// entry point
	// 메소드와 변수 구분하기: 이름 뒤에 괄호가 있으면 메소드.
	// static 영역에서는 non-static변수나 메소드는 사용이 불가.
	public static void main(String[] args) {
		// system이 가리키는 건 내가 사용 중인 PC.
		// out 변수는 출력장치를 의미
		// println은 메소드 - 출력 기능을 담당하는 메소드 (어디에 출력? > 콘솔창)
		System.out.println("Hello World");
	}// end of main method - 기능, 처리, event

}// end of Hello - 사용자 정의 클래스 선언 및 구현이 끝나는 것
