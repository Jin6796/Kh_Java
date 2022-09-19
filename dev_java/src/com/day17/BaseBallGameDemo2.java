package com.day17;

public class BaseBallGameDemo2 {
	// 사용자가 입력한 숫자를 받는 코드
	public int userInput(String input) {
		int my = 0;
		// 예외가 발생할 가능성이 있는 코드
		// 예외처리를 다중문으로 처리할 때 반드시 상위 클래스가 맨 나중에 와야 함.
		try {
			my = Integer.parseInt(input);
//		} catch (NumberFormatException e) {
//			System.out.println("제발 숫자만 입력하세요");
		} catch (Exception ex) {
			// toString메소드로 예외이름을 확인 가능하니까 외우지않아도 됩니다.
			System.out.println(ex.toString());
		}
		System.out.println("요기");
		return 0;
	}
	public static void main(String[] args) {
		BaseBallGameDemo2 bbg2 = new BaseBallGameDemo2();
		int result = bbg2.userInput("안녕");
			System.out.println("사용자가 입력한 값은 " + result);
	}

}
