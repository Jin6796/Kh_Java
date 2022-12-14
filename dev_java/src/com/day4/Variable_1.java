package com.day4;

public class Variable_1 {
	// 선언부 - 전역변수(global variable, member variable)
	int age = 20;
	void methodA() {
		// 실수를 담을 때에는 double 타입으로 선언한다
		// 지변은 클래스 외부에서는 사용할 수가 없다.
		// 전변은 클래스 외부에서도 사용할 수 있다.
	//	double Pi = 3.14; (?)
		age = 30;
	}
	public static void main(String[] args) {// break point
		//인스턴스화 - 메모리 로딩됨, 상주됨
		//인스턴스화를 하면 변수와 메소드를 누릴 수 있다.`
		Variable_1 v1 = new Variable_1();
		//메소드를 호출할 땐 뒤에 세미콜론(;)를 붙인다.
		//메소드를 구현할 땐 { } 좌, 우 중괄호로 영역을 표시한다. >> "지역변수"
		System.out.println("before : "+v1.age);
		v1.methodA();
		System.out.println("after : "+v1.age);		
	}// end of main - 북마크!!!!!!
}
