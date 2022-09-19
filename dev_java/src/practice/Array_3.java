package practice;

import java.util.Arrays;

public class Array_3 {
	public void methodA() {
		int sum = 0;
		double ave = 0.0;

		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random() * 100) + 1;

			sum += score[i];
			ave = sum / (double) score.length;
		}
		System.out.println("점수들: " + Arrays.toString(score));
		System.out.println("총 합: " + sum);
		System.out.println("평균: " + ave);
	}

	public static void main(String[] args) {
		Array_3 ar = new Array_3();
		ar.methodA();
	} 
} 


