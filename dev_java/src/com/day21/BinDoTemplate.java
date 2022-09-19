package com.day21;

import java.util.Arrays;

public class BinDoTemplate {
	public BinDoTemplate() {
		int nanSus[] = new int[100];
		int pCount[] = new int[10];
		//insert here
		initArray(nanSus, nanSus.length);
		numberCount(nanSus, nanSus.length, pCount);
		print10PerLine(nanSus, nanSus.length);
		printResult(pCount, 10);
	}
	// 배열의 초기화
	void initArray(int nanSus[], int size) {
		//insert here
		for(int i = 0; i<nanSus.length; i++) {
			//0.0~10.0 실수를 채번. 0.0은 포함, 10.0은 미포함
			nanSus[i] = (int)(Math.random()*10);
		}
	}
	// 빈도 검사  nanSus에 들어 있는 숫자의 빈도를 pCount에 저장함
	void numberCount(int nanSus[], int size, int pCount[]) {
		//insert here
		int j = 0;
		//채번된 100가지 숫자에 대해 판정을 해야한다.
		for(int i = 0; i<size; i++) {
			// 카운트하기 위해 배열의 값을 담는다.
			// 채번된 숫자를 배열(pCount)의 인덱스 변수에 담긴다.
			j = nanSus[i];
			// pCount는 100개의 숫자에 대한 빈도수를 관리하는 1차배열이다.
			pCount[j]++;
		}
		
//		System.out.println("개수 : " + Arrays.toString(pCount));
	}
	// 배열 출력 한 줄에 10개씩 출력하고 줄바꿈 하기
	void print10PerLine(int nanSus[], int size) {
		System.out.printf("원본 : 	");
		for(int i=0;i<size;i++) {
			System.out.printf("%3d", nanSus[i]);
			if(i%10 == 9) System.out.printf("\n	");
		}
	}
	// 빈도 출력 빈도 배열과 인덱스를 함께 출력
	void printResult(int pCount[], int size) {
		//insert here
		System.out.printf("\n"); // 개행처리하기
		System.out.printf("숫자 : ");
		for(int i=0;i<size;i++) {
			System.out.printf("%3d", i);
		}
		System.out.printf("\n");
		System.out.printf("개수 : ");
		for(int i=0;i<size;i++) {
			System.out.printf("%3d", pCount[i]);
		}
	}
	public static void main(String[] args) {
		new BinDoTemplate();
	}

}