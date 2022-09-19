package com.day13;
///////// while 문
public class FizzBuzzGame_1 {
	public void Star() {
		int i = 0;
		while(i<=100) {
			if((i%5==0)&&(i%7==0))  System.out.println("fizzbuzz"); // if ended
			else if(i%5==00) System.out.println("fizz");
			else if(i%7==00) System.out.println("buzz");
			else System.out.println(i);
			++i;
		}     // end of while
	}         // end of Star
	public static void main(String[] args) {
		
		FizzBuzzGame_1 fbg1 = new FizzBuzzGame_1 ();
		fbg1.Star();
	}   /////////////////////////////////////////// end of main

}       /////////////////////////////////////////// end of class
