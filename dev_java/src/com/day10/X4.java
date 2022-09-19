package com.day10;

public class X4 {

	public static void main(String[] args) {
		// 이 때 true는 논리연산자가 아닌 문자열이다.
		Boolean s1 = new Boolean(true);
		// 원시형 타입의 boolean의 Wrapper클래스이다.
		// 원시형 타입은 변수와 메소드를 가질 수 없다.
		// 이러한 원시형도 변수와 메소드 선언이 필요한 경우가 있는데
		// 이것을 지원하기 위해 제공되는 클래스를 "Wrapper 클래스"라고 한다.
		Boolean b1 = new Boolean(true);
		System.out.println(s1+" ,"+b1);
		if(s1.equals(b1)) {
			System.out.println("Equal");
		} else { 
			System.out.println("Not Equal");
			}
		if(s1==b1 ) {
			System.out.println("주소번지가 같다");
		} else if(s1!=b1) { //if(s1!=b1)을 생략해도 출력되는 값은 동일하다.
			System.out.println("주소번지가 다르다");
		}
	}
}
