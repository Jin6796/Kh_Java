package com.day4;

public class Variable_6 {
	int i; //전역변수는 초기화를 생략할 수 있다 > 지역변수는 X
	       //int의 디폴트 값은 0
	void methodA(int i) {// 100이 도출됨
		//insert here i=10
	System.out.println(i);
	}
	public static void main(String[] args) {
		int i; // 변수 선언 >> 메소드 안에서 선언한 변수는 "지역변수"이다.
		i=10; // 변수 초기화
		Variable_6 v6 = new Variable_6();
		i=100;
		v6.methodA(i); // 지역변수의 초기화가 생략될 경우 괄호 안에 v6.i를 넣어주면 됨
	}

}
