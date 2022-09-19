package com.day16;

public class IntArray_2 {
	
	int deptnos[] = null; // 1차 배열
	// 아래 디폴트 생성자는 언제 호출되나요? -28번라인
	public IntArray_2() {
		deptnos = new int[3]; // 배열 생성 - 어떤 장애를 갖고 있나? > > int 밖에 못담아! > > 해결점: 컬렉션 프레임워크를 공부해보자(자료구조)
		System.out.println(deptnos);
		initArray();
		arrayPrint();
	}

	public void initArray() {
		deptnos[0] = 10;
		deptnos[1] = 20;
		deptnos[2] = 30;
	}

	public void arrayPrint() {
		// 개선된 for문 - 전체조회 할 때.
		// for(변수선언 내 안에 있는 타입 : 배열의 변수명)
		for (int deptno : deptnos) {
			System.out.println(deptno);
		}
	}

	public static void main(String[] args) {
		// 인스턴스 변수를 재사용하지 않는 경우라면 아래처럼 해도 괜찮다.
		// 메소드 호출을 생성자에서 하고 있기 때문에!
		new IntArray_2();
	}

}
