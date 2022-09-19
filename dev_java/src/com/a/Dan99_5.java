package com.a;

import java.util.Scanner;

public class Dan99_5 {
	int i = 2;
	int j = 1;

	public Dan99_5() {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("원하는 구구단의 첫 단수를 입력해주세요.");
		int start = sc.nextInt();
		System.out.print("원하는 구구단의 마지막 단수를 입력해주세요. \n");
		int end = sc.nextInt();
		
		for (i=start; i<=end; i++) {
			System.out.println("\n["+i+"단]");
			for (j=1; j <= 9; j++) {
			System.out.println(i + " x " + j + " = " + (i * j));
			} //inner for
			j=1;
		} // outer for 

	}

	public static void main(String[] args) {
		Dan99_5 d1 = new Dan99_5();
//		d1 = new Dan99_5();
	}
}