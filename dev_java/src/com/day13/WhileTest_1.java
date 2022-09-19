package com.day13;

public class WhileTest_1 {

	public void account(int i, int hap) { //파라미터 자리에 선언된 변수는 지역변수이다.
		while(i < 6) { // = for (i=1;i < 6;i++)
			hap = hap + i;
			System.out.print("i : "   + i);
			System.out.println(" hap : " + hap);
			i++;
		}
		System.out.println("1부터 5까지의 합은 " + hap);
	}

	public static void main(String[] args) {
		WhileTest_1 w = new WhileTest_1();
		int i = 1;
		int hap = 0;
		w.account(i, hap);  // 원시형 타입은 메소드 호ㅜㄹ 시 값에 의한 호출이 일어난다.
	}

}
