package com.day13;
//문제 : 1부터 5까지의 합을 구하는 while문을 이용해 프로그램을 작성하시오.
public class WhileTest {
	int i = 1; int hap;
	public void account() {
		while(i<=5) {
			hap = hap + i ;
/*			0   =  0  + 1
 * 			1   =  1  + 2
 * 			3   =  3  + 3
 *          6   =  6  + 4
 *         10   = 10  + 5
 *         15   >>   종료           */			
			
			System.out.print("int=" + i);
			i++;
			System.out.println(" hap=" + hap);
		}
		System.out.println("1부터 5까지의 합은 " + hap);
	}
	public static void main(String[] args) {
		WhileTest wt = new WhileTest ();
		wt.account();
	}

}
