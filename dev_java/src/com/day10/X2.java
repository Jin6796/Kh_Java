package com.day10;

public class X2 {

	public static void main(String[] args) {
		// 이 때 true는 논리연산자가 아닌 문자열이다.
		String s1 = new String("true");
		// 원시형 타입의 boolean의 Wrapper클래스이다.
		// 원시형 타입은 변수와 메소드를 가질 수 없다.
		// 이러한 원시형도 변수와 메소드 선언이 필요한 경우가 있는데
		// 이것을 지원하기 위해 제공되는 클래스를 "Wrapper 클래스"라고 한다.
		Boolean b1 = new Boolean(true);
		boolean isOK = false;
		// s1이 가리키는 값과 b1이 가리키는 값이 같은지를 비교할 때 사용.
		// s1==b1 >> 주소번지가 같은지 비교하는 것
		System.out.println(s1.equals(b1));
//		System.out.println(s1==b1);
	}
}
