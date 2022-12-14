package com.day16;
// 변수 - 배열 - 객체 배열 - 컬렉션 프레임워크(List, Map) - 쿠키/세션
// 사용하기에는 전역변수보다 지역변수가 더 어렵다. 
public class IntArray_4 {
	// 부서번호를 담을 배열 선언
	// 가능하다면 코드를 적게 수정하면서 요구사항을 만족하는 코딩을 전개하자.
	public void initArray(int deptnos[]) {
		arrayPrint(deptnos);
	}

	public void arrayPrint(int deptnos[]) {
		for (int deptno : deptnos) {
			System.out.println(deptno);
		}
	}
	public int[] initArray2() {
		int a[] = new int[] { 10, 20, 30 };
		return a;
	}
	public void arrayPrint2() { 
		int deptnos[] = initArray2();
		for (int deptno : deptnos) {
			System.out.println(deptno);
		}
	}

	public static void main(String[] args) {
		IntArray_4 i3 = new IntArray_4();
		// 배열선언을 지역변수로 하였다. - 파라미터 또는 리턴타입을 고려해야만 한다.
		int deptnos[] = null;
		deptnos = new int[] { 10, 20, 30 };
		i3.initArray(deptnos);
	}

}
