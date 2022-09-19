package com.day10;

public class X1 {
	public static void main(String[] args) {
		// 이 때 true는 논리연산자가 아닌 문자열이다.
		String s1 = new String("true");
		boolean isOK = false;
//		if(s1.equals(isOK)) {
//		if(조건식-true or false) 
//		if(true)
//		if(1==1) >> true
		if(isOK) {
			//13번의 조건이 참이 아니라면 실행 기회를 갖지 못한다.
			System.out.println("참");
		}
		else {System.out.println("거짓");
	}
}
}
