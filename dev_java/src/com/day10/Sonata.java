package com.day10;

public class Sonata extends Object { //extends Object는 생략 가능
	// 너는 지금 시속 몇 km로 달리고 있니?
	int speed;       //0
	// 4
	int wheelNum;    //0
	// 자동차 마다의 대표 색상이 있다.
	String carColor; //null
	public Sonata() {}
	public Sonata(String carColor) {
		System.out.println(carColor);
		this.carColor = "검정색"; 
		// 앞에 this.를 붙이면 자기 자신을 가리키는 수정자가 되기 때문에
		// 전역변수가 된다. (지역변수 > 전역변수)
		System.out.println(carColor);
	}
	public Sonata(int speed, int wheelNum, String carColor) {
		this.speed = speed;
		this.wheelNum = wheelNum;
		this.carColor = carColor;
	}
	@Override
	public String toString() {
		return "내 자동차는 현재 "+speed+"로 달리고 있고 바퀴 수는 "+wheelNum+"이고, 자동차 색상은 "+carColor+"입니다.";
		
	}
}
