package com.day10;
class Quiz7s{
	public float getNum() {
		return 3.0f;}
	
public class Quiz7 extends Quiz7s {
	@Override
	public float getNum() {
		return 4.0f;}
	
	// 왜 int i 를 넣으면 오류가 사라지나요? >> 메소드 오버로딩의 조건
	// (파라미터의 타입이 달라야함)을 수렴하니까
	public double getNum(int i) {
		return 4.0d;}
	
	public float getNum(double d) {
		return 4.0f;}
	
	public double getNum(float d) {
		return 4.0d;}
}
}
