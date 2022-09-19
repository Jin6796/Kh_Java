package com.day20;

import java.util.ArrayList;
import java.util.List;

public class ListTest_3 {
	public static void main(String[] args) {
		List nameList = new ArrayList();
		nameList.add("나신입");
		String name = (String)nameList.get(0);
		System.out.println(nameList.size()+", "+name);  // 1, 나신입
		
		List<String> nameList2 = new ArrayList<>();
		nameList2.add("나초보");
		// 제네릭에서 String타입을 명시하였으므로 캐스팅 연산자가 필요없다.
		String name2 = nameList2.get(0);
		nameList2.add("나고수");
		nameList2.add(1, "나천재");
		
		nameList.remove("나신입");
		
		System.out.println(nameList2.size()+", "+name2);  // 3, 나초보
		
		System.out.println(nameList.size());
		
		
	}

}
