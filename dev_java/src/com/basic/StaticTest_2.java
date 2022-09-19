package com.basic;

public class StaticTest_2 {
	int age = 30;// =기호는 대입연산자라고 읽는다
	public static void main(String[] args) {
		
		//StaticTest st = new StaticTest();
		StaticTest_2 st = new StaticTest_2();
		System.out.println(st.age);
		// 변수를 호출하면 주소번지가 나오지 않고 값이 나옴
	}// end of main

}////// end of StaticTest
