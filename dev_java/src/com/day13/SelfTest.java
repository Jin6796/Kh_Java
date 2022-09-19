package com.day13;
/*
 * 1. 1부터 10까지의 합 while문으로 구하기  ////////////////////////////////
 * 2. 1부터 10까지의 합 for문으로 구하기
 * 3. 1부터 10까지 중 짝수의 합 구하기 * 
 */
public class SelfTest {
	public void Self() {
		int i = 0; int hap = 0;
		while(i<=10) {
			hap = hap + i ;
			System.out.println("hap="+hap);
			i++;
		} System.out.println("1부터 10까지의 합은" + hap + "입니다.");
	}
	public static void main(String[] args) {
		SelfTest st = new SelfTest ();
		st. Self();
		
	}

}
