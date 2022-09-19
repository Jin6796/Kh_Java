package com.day20;

import java.util.ArrayList;
import java.util.List;
/* 
 * int - Integer
 * double - Double
 * float - Float
 * boolean - Boolean, new Boolean(true);, new Boolean("true");
 *                                             >> 어떤 값에 ""를 붙이면 String타입니다.
 */
public class ListTest_4 {
	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
		numberList.add(5);
		numberList.add(6);
		
		Integer num = numberList.get(0);
		// 받을 때에는 원시형 타입으로 받을 수 있다 > 오토박싱이 적용되었기 때문에!
		int num2 = numberList.get(1);
		System.out.println(num);
		System.out.println(num2);
		
		
	}

}
