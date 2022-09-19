package com.day16;

public class WoodDuck extends Duck {
	public WoodDuck () {
		flyBehavior = new FlyNoWay();
	}
	@Override
	public void display() {
		System.out.println("저는 나무오리 입니다.");
	}

}
