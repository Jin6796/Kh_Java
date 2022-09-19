package com.day17;

public class A {
	void methodA(int i) {
		int z = 0;
		try {
			z = i/0;
			System.out.println(z);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(z);
	}
	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		A a  = new A ();
		a.methodA(i);
		
	}

}
