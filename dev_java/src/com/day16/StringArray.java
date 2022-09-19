package com.day16;

public class StringArray {

	public static void main(String[] args) {
		String names[] = {"이순신", "강감찬", "이성계"};
		// 배열의 인덱스는 왜 0부터 인가요?
		// 배열 변수의 주소번지와 배열 첫번째 주소번지가 같아서
		for (int i = 0 ; i<names.length ; i++) {
			System.out.println(names[i]);
		}
		for (String name : names) {
			System.out.println(name);
		}
	}

}
