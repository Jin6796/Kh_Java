package com.day20;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 회원가입
 * 아이디: 입력하세요
 * <input type="text" name="mem_id">
 * 비밀번호: 입력하세요
 * <input type="text" name="mem_pw">
 * 이름: 입력하세요
 * <input type="text" name="mem_name">
 * 이메일: 입력하세요
 * <input type="text" name="mem_email">
 * >> name만 바뀌니 map을 사용하자. key로 값을 관리해보자. (식별자)
 * 
 */
public class MapTest_3 {
	// 제네릭
	Map<String, String> map = new HashMap<>();

	public MapTest_3() {
// Map 계열은 값을 담을 때 put 메소드를 사용한다
		// 파라미터가 두 개 필요한데, 첫번째는 키 값이고, 두번째는 값(value)이다.
		map.put("mem_id", "scott"); // 아이디
		map.put("mem_pw", "tiger"); // 비번
		map.put("mem_name", "홍스콧"); // 이름
		printMap(); // 출력을 담당하는 메소드 호출하기
	}

	public void printMap() {
		System.out.println(map.size());// 키 값에 대한 원소의 수 - 3이 출력
		// 22번에서 정의된 클래스를 사용하므로 제네릭 타입이 변하면 아래에서도 동일하게 바꿔야한다.
		for(Map.Entry<String, String> et : map.entrySet()) {
			System.out.println("[key]: " + et.getKey()+", [value]: " + et.getValue());
		}
	}

	public static void main(String[] args) {
		MapTest_3 t3 = new MapTest_3 ();
	}

}
