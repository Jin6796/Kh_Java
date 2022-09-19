package com.day15;
// 이때 Pride를 MoveBehavior 인터페이스의 구현체 클래스이다. 라고 말할 수 있다.
/*
 *  추상클래스와 인터페이스의 공통점
 *  - 단독으로 인스턴스화가 불가하다.
 */
public class Pride extends Car implements MoveBehavior {
	// run이라는 메소드는 {}가 있는 것 만으로도 구현이다.
	// MoveBehavior인터페이스에 선언된 추상메소드를 재정의함
	@Override
	public void run() {
		// 내 안에 선언된 변수가 아닌데 어떻게 사용이 가능한가?
		// Car를 상속 받았으니까..
		// 원래 Car에서는 엑셀을 밟을 때마다 1씩 증가하였는데 자손클래스에서는 2번 증가하는 것으로 재정의 되었다.
		// 오버라이딩이다
		speed = speed+2;
		// TODO Auto-generated method stub
	}

	@Override
	public int stop() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
