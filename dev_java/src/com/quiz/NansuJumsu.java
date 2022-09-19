package com.quiz;

import java.util.Random;

public class NansuJumsu {
	public void nansu(int jumsu[], int hap) {
			System.out.println("nansu호출");
		for(int i=0; i<jumsu.length;i++) {
			System.out.println(i);
			hap = hap + jumsu[i];
		}
		System.out.println("총 합: "+hap);
	}

	public static void main(String[] args) {
		int jumsu[] = new int[5];
		Random r = new Random(); // 난수 발생을 위한 씨앗이 되는 값. for문 안에 넣지 말어라
		int hap = 0;
		double ave = 0.0;
		
		// 5개의 임의의 점수를 입력받아야 하므로 반복문을 사용한다.
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(101);
			System.out.println("jumsu[" + i + "] : " + jumsu[i]);
		}
		for (int j = 0; j < jumsu.length; j++) {
			hap = hap + jumsu[j];
		}
		System.out.println("jumsu의 합 : " + hap);
		//평균 구하기
		ave = hap/5.0;
		System.out.println("jumsu의 평균 : " + ave);
		//석차 구하기
		int rank[] = {1,1,1,1,1};
		for(int i=0; i<jumsu.length; i++) {
			for(int j=0; j<jumsu.length; j++) {
				if(jumsu[i] < jumsu[j]) {
					rank[i]++;
				}
			}
		}
		for(int rnk : rank) {
			System.out.println(rnk);
		}
	}
}
