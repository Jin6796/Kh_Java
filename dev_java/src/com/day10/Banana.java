package com.day10;

public class Banana {
	private int x;
	private static int nth;
	Banana(){ x = nth++;}
	
	Banana(int x) { this.x=x;}
	
	public static void main(String[] args) {
		Banana b1 = new Banana();
		Banana b2 = new Banana();
		Banana b3 = new Banana(1);
		Banana b4 = b3;
		if (b3==b4) { System.out.println("b3과 b4의 주소번지는 같다."); }
		
		if (b1==b2) { System.out.println("b1과 b2의 주소번지가 같다."); }
		else if (b1!=b2) {System.out.println("주소번지가 다르다");}
	}

}
