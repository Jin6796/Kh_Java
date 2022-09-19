package com.day10;

import javax.swing.JButton;

// 가능하면 메인 메소드에 코딩을 하지 않는다.
public class SonataSimulation {

	public static void main(String[] args) {
		Sonata myCar = new Sonata(65,4,"자주색");
		Sonata herCar = new Sonata("핑크");
		System.out.println(herCar.carColor);
		System.out.println(myCar+ ", "+herCar);
		System.out.println(myCar.toString()+ ", "+herCar.toString());
		JButton jbtn = new JButton ("전송");
		System.out.println(jbtn);
	}

}
