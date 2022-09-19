package com.day13;
/*
 * 1. 1부터 10까지의 합 while문으로 구하기
 * 2. 1부터 10까지의 합 for문으로 구하기     ////////////////////////////////
 * 3. 1부터 10까지 중 짝수의 합 구하기 * 
 */
public class SelfTest_1 {
	public void Self() {
		int i = 0; int hap = 0;
		for(i=0;i<=10;i++) {
			hap = hap + i ;
			System.out.println("hap="+hap);
		} System.out.println("1부터 10까지의 합은" + hap + "입니다.");
	}
	public static void main(String[] args) {
		SelfTest_1 st1 = new SelfTest_1 ();
		st1. Self();
		
	}

}
