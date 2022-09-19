package com.day16;

public class IntArray_1 {
	// 부서번호를 담을 배열 선언
	int deptnos[] = null;
	// 디폴트 생성자 선언
	public IntArray_1() {
		// 배열의 생성 - 방이 3개, 각각의 값은 모두 0으로 자동 초기화가 된 상태
		deptnos = new int[3];
		// 배열의 초기화를 담당하는 메소드 호출
		initArray();
		// 위 메소드를 경유(호출)하면 0 0 0이 10 20 30으로 초기화가 이루어짐
		arrayPrint();
	}
	// 아래 메소드가 호출되어야 deptnos 1차배열의 초기화가 이루어진다.
	public void initArray() {
		deptnos[0] = 10; // 0으로 초기화 되어있던 값이 재정의가 됨.
		deptnos[1] = 20;
		deptnos[2] = 30;
	}  //// end of initArray
	// 배열 원수의 갯수를 카운트 해줌.
	public void arrayPrint() {
		for (int i = 0; i < deptnos.length; i++) {
			System.out.println(deptnos[i]);
		}
	}  //// end of arrayPrint

	public static void main(String[] args) {
		// 배열을 초기화 하는 initArray 호출, 또 초기화된 배열을 출력하는 arrayPrint 호출
		// 이 모든게 생성자에서 처리되었다. (그래서 생성자 호출이 필요한 것)
		new IntArray_1();
	}  //// end of main

}
