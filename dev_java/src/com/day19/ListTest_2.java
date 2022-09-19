package com.day19;

import java.util.ArrayList;

import java.util.List;
public class ListTest_2 {
	List<String> list = new ArrayList<>();
	
	public void setList() {
		list.add("수박");
		list.add("토마토");
		list.add("사과");
	}
	public void printList() {
		setList();
		// 배열처럼 첫번째 인덱스가 0이므로 두번째를 삭제하려면 숫자 1을 기재해야한다.
		String ele = list.remove(1);
		boolean isFail = list.remove("사과");
		list.add("바나나");
		boolean isOk = list.isEmpty();
		
		for (int i=0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("삭제된 항목은 " + ele + "입니다.");
		System.out.println("응답 결과는 " + isFail + "입니다.");
		System.out.println("바나나 있니? " + list.contains("바나나")+", "+list.contains("키위"));
		if(list.contains("바나나")) {
			System.out.println("네. 있습니다. 드릴까요?");
		}else System.out.println("아니오. 없습니다.");	
		if(list.contains("키위")) {
			System.out.println("네. 있습니다. 드릴까요?");
		}else System.out.println("아니오. 없습니다.");
	}
	
	public static void main (String[] args) {
		ListTest_2 l2 = new ListTest_2(); // 디폴트 생성자 호출
		l2.printList();
	
	}
	
}
