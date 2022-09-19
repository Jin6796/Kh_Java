package practice;

public class Array_5 {

	public static void main(String[] args) {
		int sum = 0;
		double average = 0;
		
		int[] score = {100, 88, 90, 87, 93};
		
		 int max = score[0];
		 int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(score[i] > max) {
				max = score [i]; 
			} else if(score[i] < min) {
				min = score[i];
			}
		} System.out.println("최고점: "+max+", 최저점: "+min);
		
	}

}
