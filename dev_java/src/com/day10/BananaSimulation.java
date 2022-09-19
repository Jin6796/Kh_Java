package com.day10;

class Banana2 {
	public int x; // 초기화가 생략됨 > 기본값 0
	public static int nth;

	Banana2() {
		nth = nth + 1 ;
		x = nth;
	}

	Banana2(int x) { //x=1
		this.x = x;}//x=1 >> this
}
public class BananaSimulation {
	public static void main(String[] args) {
		Banana2 b1 = new Banana2();
		Banana2 b2 = new Banana2();
		Banana2 b3 = new Banana2(1);
		Banana2 b4 = b3;
		Banana2 b5 = new Banana2();
			System.out.println(b1+", "+b2+", \n"+b3+", "+b4);
			System.out.println("b1.x =>"+b1.x); //1
			System.out.println("b2.x =>"+b2.x); //2
			System.out.println("b3.x =>"+b3.x); //1
			System.out.println("b4.x =>"+b4.x); //1
			System.out.println("b5.x =>"+b5.x); //3
} }
