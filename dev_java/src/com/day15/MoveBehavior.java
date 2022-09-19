package com.day15;

public interface MoveBehavior {
	int i = 0;
	public abstract void run();
	// 인터페이스에서 선언된 모든 메소드는 추상메소드이므로 abstract 예약어는 생략이 가능하다.
	// 인터페이스에서 선언된 메소드의 리턴타입이 있더라도 { }를 쓸 수 없으므로 return예약어를 쓰지 않아도 된다.
	public abstract int stop();
	

}
