package com.day11;

import java.util.Scanner;

public class ScannerTest_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		while(true) { 
			System.out.println("0~9사이의 숫자를 입력하세요.");
			System.out.println(sc.next());
			if(sc.next().equals("q")) {
				break; 
			}
		}
		System.out.println("while문 탈출");
	}
}