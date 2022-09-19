package com.day19;

import java.util.ArrayList;
import java.util.List;

// 생성자도 메소드 오버로딩의 컨벤션을 따른다.
// 같은 이름의 생성자를 여러 개 가질 수 있다.
// 클래스 쪼개기를 자유자재로 구성할 수 있다.
// MVC 패턴을 적용한 게시판 구현, 프로젝트 구현 시 
public class ListTest_1 {
	// 변수 list는 List타입이고요, 구현체 클래스 이름은 ArrayList입니다.
	List<String> list = new ArrayList<>();
	
	//List<String> list2 = new List<>();  >> 인터페이스 이름은 생성부에 올 수 없다.
	public ListTest_1() {
		System.out.println("디폴트 생성자 호출");
	}
	public ListTest_1(int i) {
		System.out.println("파라미터가 int인 생성자 호출");
		list.add("토마토");
		list.add("복숭아");
		list.add(1, "딸기"); // 1번째에 딸기를 넣어주세요.
		list.add("수박");
//		list.remove("토마토");
		
		for (int j=0; j< list.size(); j++) {
			System.out.println(list.get(j));
		}
	}
	public static void main (String[] args) {
		ListTest_1 l1 = new ListTest_1(); // 디폴트 생성자 호출
		// 문제 제기 >> 디폴트 생성자에는 ArrayList에 대한 초기화가 없다.
		// 인스턴스화만 되어있는 상태인지 원소까지도 추가된 상태인지를 구분해야한다.
		int cnt = l1.list.size();   // 0 ??
		System.out.println(cnt);
		l1 = new ListTest_1(10);
		cnt = l1.list.size();       // 총 몇 개? >> 4개
		System.out.println(cnt);
		
		
	}
	
}
/*
 * 인스턴스화 유형 3가지 
 * 1) 기초편 - 선언부와 생성부가 같은 타입 (다형성을 기대할 수 없음)
 *   A a = new A();
 *   Sonata myCar = new Sonata();
 *   MallardDuck herDuck = new MallardDuck();
 * 2) 메소드의 리턴타입으로 객체를 생성받는 타입
 *   A a = 주소번지.methodA(); // 메소드 호출을 통해서 객체를 주입받아서 변수와 메소드를 누릴 수 있다.(재사용할 수 있다.)
 *   public A methodA();
 * 3) 다형성을 기대할 수 있는 타입 - 제네릭/다이아몬드 연산자 > 내 안에 있는 타입을 명시한다.
 *   List nameList = new ArrayList();
 *   List<String> nameList2 = new ArrayList<String>();
 *   // 생성부에 오는 명시적인 타입은 생략이 가능하다. 단! <> 다이아몬드 연사자를 붙여야한다.
 *   List<String> nameList2 = new ArrayList<>();
 *   
 *   //get(int i):Object - API
 *   오른쪽에 오는 타입이 왼쪽에 오는 타입보다 큰 타입은 절대로 ㅂ루가능하다.
 *   만일 강제로 타입을 바꾸고 싶으면 캐스팅 연산자를 사용할 것
 *   String name = (String)nameList.get(2);
 *   // 제네릭을 사용하는 경우에는 다이아몬드 연산자 안에 타입을 적어 놓았으므로 명시적으로 알수 있다. >> 강제 형전환이 필요없다.
 *   String name = nameList2.get(2);
 *   
 *   
 *   변수와 배열은 같은 타입만 담을 수 있는 단점이 있어서 객체 배열이 나왔다. (Sonata myCars[] = new Sonata[5];)
 *   중간에 끼워넣기나 늘였다 줄였다가 되지 않는다.
 *   그런데! List는? 다른 타입도 담을 수 있고 끼워넣기도 가능하고 (list.add(2,"토마토"))
 *   add하면 계속 방이 늘어나고 remove(3)하면 방이 줄어들기도 한다. Object면 타입이 달라도 모두 담을 수 있다.
 *   
*/





