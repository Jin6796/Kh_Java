package com.day15;

import javax.swing.JFrame;
// 부모를 상속받으면 부모가 정의하고 있는 변수와 메소드를 누릴 수 있다.
//           부모보다 자손이 더 많은 변수와 메소드를 누릴 수 있다.
public class A extends JFrame{ // 어제의 Main 클래스로 생각해보자.
	// 인스턴스화는 초기화와 생성하기를 나누어서 작성할 수도 있다.
	// 그러나 메소드 안이나 생성자 안에서는 가능하다.
//	B_1 b1 = null;
//	b1 = new B_1();
	B b = new B(); // 초기화와 생성을 한 번에 한 경우.
	public void initDisplay() {
		this.setVisible(true);
		this.setSize(400, 500);
	}
	public static void main(String[] args) {
		A a = new A();
		a.initDisplay();
	}

}
