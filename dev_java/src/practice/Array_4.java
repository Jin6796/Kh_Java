package practice;

public class Array_4 {
	public static void main(String[] args) { 
		int sum = 0;
		double average = 0;
		
		int[] score = {100, 88, 90, 87, 93};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		average = sum / (double)score.length;
		
		System.out.println(sum);
		System.out.println(average);
	}
}
