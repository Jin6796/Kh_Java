package com.day5;

public class Variable_3 {
	int age = 20;
	//메소드의 파라미터 자리도 지역변수 자리이다. 값은 호출할 때 결정된다
	void methodA(int age) {
		System.out.println("지역변수---> "+age);//50 - automatic 자동소멸
		age = 30;
		System.out.println("methodA 전역변수: "+this.age);//전역변수 20이 도출
	}
	public static void main(String[] args) {
		Variable_3 v1 = new Variable_3();
		System.out.println("before : "+v1.age);
		v1.methodA(50);
		System.out.println("after : "+v1.age);	//전역변수 20 출력	
	}
}
