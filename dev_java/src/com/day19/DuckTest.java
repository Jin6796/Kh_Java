package com.day19;

import com.day16.Duck;
import com.day16.MallardDuck;
import com.day16.RubberDuck;
// 생성부와 선언부의 이름이 다르면 안된다 - 상속관계가 아니잖아! 인터페이스가 아니잖아!! (인터페이스를 implements/재정의하지 않았잖아)
public class DuckTest {
	// 파라미터에 더 상위 클래스 타입을 적어주면 다양한 구현체 클래스를 받을 수 있다 - 다형성 기대 가능함.
	// 같은 이름의 메소드가 호출되더라도 기능이 서로 다르게 동작된다.
	// 선언부와 생성부의 이름이 다를 때 가능하다.
	// 이것이 가능하려면 상속관계 or 인터페이스의 구현체 클래스이어야 한다.
	public void methodA (Duck duck) { 
		System.out.println("methodA(Duck)");
		if(duck instanceof RubberDuck) {//너 RubberDuck 타입이니?
			System.out.println("나는 RubberDuck 타입입니다.");
		}else if(duck instanceof MallardDuck) {
			System.out.println("나는 MallardDuck 타입입니다.");
		}else {
			System.out.println("나는 기타 타입입니다.");
		}
		System.out.println(duck);
	}
	public void methodA (MallardDuck duck) {
		System.out.println("methodA(MallardDuck)");
		System.out.println(duck);
	}
	// 메소드의 파라미터 자리에서는 선언만. 초기화는 불가함. > 그 변수의 값을 정할 수 없다.
	public void methodC (int i) { 
		System.out.println(i);
	}
	public static void main(String[] args) {
		DuckTest dt = new DuckTest();
		Duck myDuck = new RubberDuck();
		Duck herDuck = new MallardDuck();
//		dt.methodA(new Duck()); // 단독으로 인스턴스화 할 수 없기 때문에 구현체 클래스가 와야 한다.
//		Duck myDuck = new Duck(); // 생성자 호출
		// 인스턴스 변수가 있으면 다른 변수나 다른 메소드 호출 시 재사용이 가능하다.
		// new RubberDuck(); 한 번만 사용가능함 - 재사용 불가
		
		dt.methodA(new RubberDuck());
		dt.methodA(herDuck);
		dt.methodA(myDuck); // pass by value(주소번지-원본) <--> call by value(값-복사본)
//		dt.methodB(new MallardDuck());
		dt.methodC(5); // call by value
	}

}
