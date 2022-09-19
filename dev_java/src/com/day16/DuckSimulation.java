package com.day16;

public class DuckSimulation {

	public static void main(String[] args) {
		Duck myDuck = new MallardDuck();
		Duck hisDuck = new RubberDuck();
		Duck herDuck = new WoodDuck();
		// MallardDuck은 FlyBehavior의 구현체 클래스가 아니다.
		// MallardDuck은 fly메소드를 직접 오버라이딩 하지 않는다. >> 그래서 fly를 직접 호출할 수 없는 것.
		myDuck.display();
		myDuck.performFly();
		
		hisDuck.display();
		hisDuck.performFly();
		
		herDuck.display();
		herDuck.performFly();
	}

}
