package com.a;

class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매시 제공하는 보너스점수

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0); // 보너스점수는 제품가격의 10%
	}
}

class Tv1 extends Product {
	Tv1() {
		// super메서드 : 조상클래스의 메소드(Product(int price))를 호출해준다
		// =조상클래스 생성자 Product(int price)를 호출한다
		super(100); // Tv1(int price=100)이 되는거임
	}

	// Object클래스의 toString()을 오버라이딩한다. 하지 않으면 티비의 주소번지가 출력됨(참조변수라)
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}// Computer(int price=200)이 되는거임
	// Object클래스의 toString()을 오버라이딩한다. 하지 않으면 컴퓨터의 주소번지가 출력됨(참조변수라)

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product p) {// Product 클래스를 p로 치환, 이제 Product는 p로 부르는거임
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		} else {
			money -= p.price;// Product의 가격을 뺀다
			bonusPoint += p.bonusPoint; // Product의 가격의 10%를 보너스로 더한다
			System.out.println(p + "을/를 구입하셨습니다.");
		}
	}
}

public class Gn2 {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		b.buy(new Tv1());
		b.buy(new Computer());

		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");

	}
}
