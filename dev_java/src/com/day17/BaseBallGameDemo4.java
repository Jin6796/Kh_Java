package com.day17;

import java.util.Scanner;

public class BaseBallGameDemo4 {
	int my[] = new int[3];
	// 컴퓨터가 채번한 숫자를 담을 배열 선언 - 전역변수로 처리해보기
	int com[] = new int[3];
	// 0부터 9사이의 중복을 제거한 세 자리 숫자 채번하기
	public void nanSu() {
		// 0.0 ~ 1.0 >> 0.0 ~ 10.0
		com[0] = (int)(Math.random()*10);
		do {
			com[1] = (int)(Math.random()*10);
		}while(com[0]==com[1]);
		do {
			com[2] = (int)(Math.random()*10);
		}while(com[0]==com[2] || com[1]==com[2]);
	}
	// 파라미터를 String으로 왜? >> 화면에서 입력받을 때 문자로 인식이 되기 때문에.
	public String account(String input) {
		System.out.println("입력된 값: ");
		if(input.length() !=3) {
			return "세 자리 숫자를 입력하세요.";
		}
		int temp = 0;
		try {
			temp = Integer.parseInt(input);
		} catch (NumberFormatException ex) {
			System.out.println(ex.toString());
			return "숫자만 입력하세요";
		}
		my[0] = temp/100;       // 789/100=7.89 => 7 - 백의자리
		my[1] = (temp%100)/10;  // 0.89*10      => 8 - 십의자리
		my[2] = (temp%10);      // 78.9         => 9 - 일의자리
		for(int val:my) {
			System.out.println(val);
		}
		return "1스 0볼";
	}
	public static void main(String[] args) {
		BaseBallGameDemo4 bbg4 = new BaseBallGameDemo4();
		Scanner sc = new Scanner(System.in);
		System.out.println("0부터 9까지 세 자리 숫자를 입력하세요.");
		String result = bbg4.account(sc.next());
		
			System.out.println("판정 결과: " + result);
			
	}

}
