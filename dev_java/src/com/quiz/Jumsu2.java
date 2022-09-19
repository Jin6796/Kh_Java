package com.quiz;

import java.util.Random;

public class Jumsu2 {

	public static void main(String[] args) {
		int hap = 0;                  // 총점
		double average = 0.0;         // 평균
		int rank = 0;
		Random r = new Random();
		int jumsu1 = r.nextInt(101);
		int jumsu2 = r.nextInt(101);
		int jumsu3 = r.nextInt(101);
		int jumsu4 = r.nextInt(101);
		int jumsu5 = r.nextInt(101);
		
		int[] jumsu = {jumsu1, jumsu2, jumsu3, jumsu4, jumsu5};
		int max = jumsu[0];
		int min = jumsu[0];
		
		for (int j = 0; j<jumsu.length; j++) {
			hap += jumsu[j];
		}
		average = hap/(double)jumsu.length;
		System.out.println("총 합 "+hap);
		System.out.println("평균 "+average);

		
//		sum = (jumsu1+jumsu2+jumsu3+jumsu4+jumsu5);
//		average = (sum/5.0);
//		System.out.println("점수 A는 "+jumsu1+", 점수 B는 "+jumsu2+", 점수 C는 "+jumsu3+", 점수 D는 "+jumsu4+", 점수 E는 "+jumsu5+"입니다.");
//		System.out.println("총 점은 " + sum + "점 입니다.");
//		System.out.println("평균은 " + average + "점 입니다.");
		
		
	}

}
