package com.a;

public class A0622 {
	
	static {
		System.out.println("static {  }"); // 클래스 초기화 블럭
	}
	
	{
		System.out.println("{   }"); // 인스턴스 초기화 블럭
	}
	
	public A0622() {
		System.out.println("생성자");
	}
	

	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		A0622 bt = new A0622();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		A0622 bt2 = new A0622();
	}

}

/*
 * 클래스 초기화 블럭이 가장 먼저 수행
 * 그 다음에 main 메서드가 수행되며 BlockTest의 인스턴스가 생성되며
 * 인스턴스 초기화 블럭이 먼저 수행, 마지막으로 생성자가 수행
 * 
 * 인스턴스 초기화 블럭은 인스턴스가 생성될 때마다 수행
 * 클래스 초기화 블럭은 처음 메모리에 로딩될 때, 한 번만 수행
*/