package com.a;

public class TvTest4 {

	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv객체 배열
		
		// Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
		
		for(int i=0;i<tvArr.length;i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10; //tvArr[i]의 channel에 i+10을 저장
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
			System.out.printf("tvArr["+i+"].channel=" + tvArr[i].channel +"%n");
			System.out.println("tvArr["+i+"].channel=" + tvArr[i].channel);
			System.out.println("====================================");
		}
		
		for(int i=0;i<tvArr.length;i++) {
			tvArr[i].channelUp(); // tvArr[i]의 메서드를 호출. 채널이 1증가
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
	}/////////// main 끝
}
class Tv {
	String color; 		// 색상
	boolean power; 		// 전원상태(on/off)
	int channel; 		// 채널
	
	void power() {	power =! power;	}
	void channelUp() {	++channel;	}
	void channelDown() {	--channel;	}
}