package com.day21;

import com.day16.MallardDuck;

public class DuckTest_2 {
	MallardDuck myDuck = null;
	
	MallardDuck getInstance() {
		return myDuck;
	} 
	
	public void Ducktest() {
		myDuck.display();
	}

	public static void main(String[] args) {
		DuckTest_2 dt = new DuckTest_2();
		dt.Ducktest();
		}
}