package com.basic;

public class StaticTest {
	// non-static 타입의 변수를 선언하고 초기화하였다.
	// 변수명 대신 컴퓨터는 메모리의 주소번지로 기억하지만 사람은 이 긴 숫자를 기억하는 것
	// 보다는 변수명으로 접근하는 것이 편리함
	int age = 20;// =기호는 대입연산자라고 읽는다
	// 변수 선언 시 앞에 static을 붙이니까 변수이름이 누워있음 >> static 타입의 변수로 변환됨
	// 변수의 역할: 데이터>정보화
	static int birth_year = 2000;
	//오른쪽에 있는 값을 왼쪽에 대입해주세요 라는 의미
	public static void main(String[] args) {
		// insert here - age변수를 접근할 수 있나?
		// main 메소드는 선언부에 static에 붙어 있으니까 static 영역인 것 
		// 하지만 변수 age앞에는 static이 없어서 사용이 불가! non-static은 static영역 안에서 사용이 불가
		// 이에 대한 해결방법: 인스턴스화를 하면 사용 가능
	
		StaticTest st = new StaticTest();
		System.out.println(st.age);
		System.out.println(birth_year);
		// 변수를 호출하면 주소번지가 나오지 않고 값이 나옴
	}// end of main

}////// end of StaticTest
