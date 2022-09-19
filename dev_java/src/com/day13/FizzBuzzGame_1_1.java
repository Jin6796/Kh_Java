package com.day13;
///////// for 문
public class FizzBuzzGame_1_1 { 
	int i = 0; int j = 0;
	public void Star() {
		for(i=1;i<=100;i++) {
			if((i%5==0)&&(i%7==0))  System.out.println("fizzbuzz"); // if ended
			else if(i%7==0) System.out.println("buzz");
			else if(i%5==0) System.out.println("fizz");
			else System.out.println(i);
		}     // end of for
	}         // end of Star
	public static void main(String[] args) {
		FizzBuzzGame_1_1 fbg11 = new FizzBuzzGame_1_1 ();
		fbg11.Star();

	}   /////////////////////////////////////////// end of main

}       /////////////////////////////////////////// end of class
