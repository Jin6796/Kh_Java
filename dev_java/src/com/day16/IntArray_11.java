package com.day16;

public class IntArray_11 {
	int deptnos[] = null;
	public IntArray_11() {
		deptnos = new int[3];
		initArray();
		arrayPrint();
	} 
	public void initArray() {
		deptnos[0] = 10; // 0으로 초기화 되어있던 값이 재정의가 됨.
		deptnos[1] = 20;
		deptnos[2] = 30;
	}  //// end of initArray
	public void arrayPrint() {
		for (int i = 0; i < 4; i++) {
			try {
				System.out.println(deptnos[i]);
			} catch (Exception e) {
				System.out.println("※ 장애가 발생하였습니다. ※");
			}
		}
	}  //// end of arrayPrint

	public static void main(String[] args) {
		new IntArray_11();
	}  //// end of main

}
