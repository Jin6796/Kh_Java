package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Jumsu2 {
	public void jumsu() {
		int sum = 0;
		double ave = 0;
	Integer[] score = new Integer[5];
	Scanner sc = new Scanner(System.in);
	System.out.println("점수를 입력해주세요.");
	
		for (int i = 0; i < score.length; i++) {
			score[i]=sc.nextInt();
			sum += score[i];
			ave = sum / (double) score.length;
			System.out.println("점수 " + (i+1) + ":" + score[i]);
		}
		System.out.printf("입력하신 점수는 모두 " + Arrays.toString(score)+"입니다. %n%n");
		System.out.print("입력된 점수의 총 합은 " + sum +"점이며,");
		System.out.printf(" 평균은" + ave +"점 입니다.%n%n");
		
		Arrays.sort(score,Collections.reverseOrder()); // 이중 for문
		//for (int i : score) {
		int rnk = 1;
		for (int i=0;i<score.length;i++) {
			System.out.print("석차 "+ rnk++ +"위: "+score[i]+"점. ");
		} 
}
	
}

