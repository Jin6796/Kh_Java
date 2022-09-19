package com.quiz;

import java.util.Random;

public class Array {

	public static void main(String[] args) {
		int []jumsu = new int[5];

		int sum = 0;                // 총점
		double average = 0.0;       // 평균
		int rank = 0;               // 석차
		
		Random r = new Random();
		int jumsu1 = r.nextInt(101);
		int jumsu2 = r.nextInt(101);
		int jumsu3 = r.nextInt(101);
		int jumsu4 = r.nextInt(101);
		int jumsu5 = r.nextInt(101);
	
		for (int j = 0; j<jumsu.length; j++) {
		sum += jumsu[j];}
		average = sum / (double)jumsu.length;
		
		System.out.println("총 점은 "+sum+"점 입니다.");
		System.out.println("평균은"+average+"점 입니다.");
		
	}

}
