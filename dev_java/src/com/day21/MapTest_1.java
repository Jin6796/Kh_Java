package com.day21;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 자바자료구조 - 랜덤하게 쓰기가 된다.
 * List보다 읽기와 쓰기가 빠르다
 * List 구조는 index로 접근한다.
 * 그리고 순차적이다. (정렬 - 2차 가공이 필요하다 - 속도가 느리다) 0.0001
 * 카카오톡에서 1초에 밀어내는 데이터 1조! 1조가 넘는 메세지를 서버가 매 초마다 밀어낸다.
 * Map은 빈자리가 있으면 넣는다.
 * Key는 중복값을 담을 수 없음(덮어쓰기) Map은 중복값도 담을 수 있다.
 */
public class MapTest_1 extends Object{

	public static void main(String[] args) {
		Map<String, Object> pmap = new HashMap<>();
		pmap.put("one", 1);
		pmap.put("two", 2);
		pmap.put("three", 2);
		pmap.put("three", 3);
		
		Set<String>set = pmap.keySet();
		
		// insert here
		Object keys[] = set.toArray();
		for(Object key:keys) {
			System.out.println(key+", " +pmap.get(key) );
		}
		
	}

}
