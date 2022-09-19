package com.day10;

public class X6 {

	public static void main(String[] args) {
		// 아래처럼 new를 사용하면 아무리 같은 문자열이라도 다른 주소번지를 할당하고 새로운 객체를 생성함.
		String s1 = new String("이순신");
		String s2 = new String("이순신");
		// new를 사용하지 않고 문자열 객체를 생성하면 기존에 같은 문자열 값을 갖고 있는 객체가 있는지
		// 찾아보고 그 주소번지를 복사하여 갖고 있게 됨.
		String s3 = "이순신";
		String s4 = s3;
//		String s5 = "이순신";
		
//		if(s3==s5) { System.out.println("s3과 s5의 주소번지는 동일하다.");}
//		else { System.out.println("동일하지 않다.");}
		
		
		System.out.println(s1+", "+s2+", "+s3+", "+s4);
		if(s1.equals(s2)) {
			System.out.println("s1과 s2의 '값'이 같다");
		} else { 
			System.out.println("s1과 s2의 '값'이 다르다");
			}
		if(s1==s2) {
			System.out.println("s1과 s2의 '주소번지'가 같다");
		} else if(s1!=s2) { 
			System.out.println("s1과 s2의 '주소번지'가 다르다");
		}	
		
		System.out.println("=========================");
				
		if(s3.equals(s4)) {
			System.out.println("s3과 s4의 '값'이 같다");
		} else { 
			System.out.println("s3과 s4의 '값'이 다르다");
			}
		if(s3==s4) {
			System.out.println("s3과 s4의 '주소번지'가 같다");
		} else if(s3!=s4) { 
			System.out.println("s3과 s4의 '주소번지'가 다르다");
		}
	}
}
