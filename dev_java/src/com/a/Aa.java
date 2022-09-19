package com.a;

public class Aa {
	public void selftest() {
		int[][] arr = {
						{ 11500, 1350 }, 
						{ 12300, 1330 }, 
						{ 10900, 1390 }, 
						{ 13200, 1310 } };
		
		int i = 0;  int j = 0;	int nd = 0;  int nd2 = 0;
		
		for (i = 0; i <= arr.length; i++) {
			nd = arr[i][0];
//			System.out.println("nd: " + nd);
			for (j=0; j <= arr[i].length; j++) {
				nd2 = arr[i][j];
//				System.out.println("nd2: " + nd2);
				System.out.println("nd와 nd2의 값: "+ nd +", "+ nd2);
			}
		}
	}

	public static void main(String[] args) {
		Aa a = new Aa();
		a.selftest();

	}

}
