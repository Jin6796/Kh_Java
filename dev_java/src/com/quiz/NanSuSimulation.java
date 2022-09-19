package com.quiz;

public class NanSuSimulation {

	public static void main(String[] args) {
		NansuJumsu js = new NansuJumsu();
		int j[] = {5, 6, 7, 8, 9};
		js.nansu(j, 0); // call by value 값에 의한 호출
	}

}
