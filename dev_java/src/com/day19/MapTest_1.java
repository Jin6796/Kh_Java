package com.day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest_1 {
	// 제네릭
	Map<String,Object> map = new HashMap<>();
	public MapTest_1() {
// Map 계열은 값을 담을 때 put 메소드를 사용한다
		// 파라미터가 두 개 필요한데, 첫번째는 키 값이고, 두번째는 값(value)이다.
		map.put("mem_id", "scott");  // 아이디
		map.put("mem_pw", "tiger");  // 비번
		map.put("mem_name", "홍스콧"); // 이름
		printMap(); // 출력을 담당하는 메소드 호출하기
	}
	public void printMap() {
		// 키 값만을 추출할 때 사용한다.
		Set<String> set = map.keySet();
		// 키 값이 세 개니까(아이디, 비번, 이름) 배열에 담을 수 있다.
		// 프론트엔드 개발자 - 배열 집중! 
		Object obj[] = set.toArray();
		for(int i = 0; i < obj.length; i++) {
			// 형전환 연산자를 사용할 때에는 받아주는 타입을 적는 것이다.
			String key = (String)obj[i]; // 타입을 맞추자
			System.out.println(key+", "+map.get(key));
		}

	}
	public static void main(String[] args) {
		new MapTest_1();
	}

}
