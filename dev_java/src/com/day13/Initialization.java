package com.day13;
//문제 : 1부터 5까지의 합을 구하는 for문을 이용해 프로그램을 작성하시오.
public class Initialization {
	int count; // 전변은 초기화 생략 가능.
	int hap; //=0
	
	public void account() {
		for(count=1; count<=5; count++) {
			hap = hap+count; }
		/*  0  =  0 + 1
		 *  1  =  1 + 2
		 *  3  =  3 + 3
		 *  6  =  6 + 4
		 *  10 = 10 + 5
		 *  15 >> 종료   */
			System.out.println("hap= "  + hap);
			System.out.println("count= "+ count); 
			
			// 홀수의 합
		hap = 0;
		for(count=1; count<=5; count++) {
			if(count%2==1) {
				hap = hap+count;
			} 
		} 		/// for ended
		System.out.println("홀수의 합은 " + hap);	
		}		/// end of account		
	
	public static void main(String[] args) {
		Initialization iz = new Initialization();
		iz.account();
	}           /// end of main

}               /// end of class
