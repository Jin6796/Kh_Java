package com.day13;
/*
 * 1. 1부터 10까지의 합 while문으로 구하기
 * 2. 1부터 10까지의 합 for문으로 구하기     
 * 3. 1부터 10까지 중 짝수의 합 구하기          ////////////////////////////////  
 */
public class SelfTest_2 {
	public void Self() {
		int i = 0; int hap = 0;
		for(i=0;i<=10;i++) 
			hap = hap + i ;
		 System.out.println("1부터 10까지의 합은 " + hap + "입니다.");
	
		 hap = 0;
		for(i=0;i<=10;i++)
			if(i%2==0) {hap = hap + i;}
		 System.out.println("1부터 10까지 중 짝수의 합은 " + hap + "입니다.");
		 
	}
	public static void main(String[] args) {
		SelfTest_2 st2 = new SelfTest_2 ();
		st2. Self();
		
	}

}
