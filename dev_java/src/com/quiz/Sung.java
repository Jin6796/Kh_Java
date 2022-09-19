package com.quiz;

public class Sung extends Sung_Simulation {
	public void methodA() {
		int[][] score = { 
				{ 100, 90, 80 }, // 학생1 == score[0]
				 { 85, 95, 80 }, // 학생2 == score[1]
				 { 70, 70, 80 }, // 학생3 == score[2]
				 { 90, 60, 65 }, // 학생4 == score[3]
				 { 65, 80, 70 }  // 학생5 == score[4]
			};
		
		   int st1   = 0;    int st2   = 0;    int st3   = 0;    int st4   = 0;    int st5   = 0;
		double st1_1 = 0; double st2_1 = 0; double st3_1 = 0; double st4_1 = 0; double st5_1 = 0;
		
		for (int i = 0, j = 0; j < score[i].length; j++) {
			st1 += score[0][j];
			st2 += score[1][j];
			st3 += score[2][j];
			st4 += score[3][j];
			st5 += score[4][j];

			st1_1 = st1 / (double) score[i].length;
			st2_1 = st2 / (double) score[i].length;
			st3_1 = st3 / (double) score[i].length;
			st4_1 = st4 / (double) score[i].length;
			st5_1 = st5 / (double) score[i].length;
			}
	
		System.out.println("학생 1: 점수의 총 합은 "+(st1)+"점이며, "+"평균은 "+Math.round(st1_1*10)/10.0+"점입니다.");
		System.out.println("학생 2: 점수의 총 합은 "+(st2)+"점이며, "+"평균은 "+Math.round(st2_1*10)/10.0+"점입니다.");
		System.out.println("학생 3: 점수의 총 합은 "+(st3)+"점이며, "+"평균은 "+Math.round(st3_1*10)/10.0+"점입니다.");
		System.out.println("학생 4: 점수의 총 합은 "+(st4)+"점이며, "+"평균은 "+Math.round(st4_1*10)/10.0+"점입니다.");
		System.out.println("학생 5: 점수의 총 합은 "+(st5)+"점이며, "+"평균은 "+Math.round(st5_1*10)/10.0+"점입니다.");
		
		
		
		
		
		
		
	
	}
}
