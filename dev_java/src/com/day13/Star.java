package com.day13;

public class Star {
	public void DotStar() {
		int i; int j;
		for(j=1;j<=5;j++)  {
		for(i=1;i<=10;i++) System.out.print("*"); System.out.println();

		}
	}
	public static void main(String[] args) {
		Star ds = new Star ();
		ds.DotStar();
	}

}
