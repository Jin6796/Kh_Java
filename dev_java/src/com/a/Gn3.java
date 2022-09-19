package com.a;

class Product2 {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매시 제공하는 보너스점수

	Product2(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0); // 보너스점수는 제품가격의 10%
	}

	Product2() {
	}// 기본생성자
}

class Tv2 extends Product2 {
	Tv2() {
		// super메서드 : 조상클래스의 메소드(Product(int price))를 호출해준다=조상클래스 생성자 Product(int
		// price)를 호출한다
		super(100); // Tv1(int price=100)이 되는거임
	}

//Object클래스의 toString()을 오버라이딩한다. 하지 않으면 티비의 주소번지가 출력됨
	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(200);
	}// Computer(int price=200)이 되는거임
//Object클래스의 toString()을 오버라이딩한다. 하지 않으면 컴퓨터의 주소번지가 출력됨

	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product2 {
	Audio2() {
		super(50);
	}// Audio(int price=50)이 되는거임
//Object클래스의 toString()을 오버라이딩한다. 하지 않으면 컴퓨터의 주소번지가 출력됨

	public String toString() {
		return "Audio";
	}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10];// 구입제품을 저장하기위한 배열
	int i;

	void buy2(Product2 p) {// Product 클래스를 p로 치환, 이제 Product는 p로 부르는거임
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;// Product의 가격을 뺀다
		bonusPoint += p.bonusPoint; // Product의 가격의 10%를 보너스로 더한다
		cart[i++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		// 반복문을 이용해서 구입한 물품의 총 가격과 목록
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null)
				break;// 끝나면 멈추고 포문 나오기
			sum += cart[i].price;
			itemList += cart[i] + ",";
		}
		System.out.println("구입한 물품의 총 금액은 " + sum);
		System.out.println("구입한 물품은 " + itemList);

	}
}

public class Gn3 {
	public static void main(String[] args) {

		Buyer2 b2 = new Buyer2();
		b2.buy2(new Tv2());
		b2.buy2(new Computer2());
		b2.buy2(new Audio2());
		b2.summary();
	}
}