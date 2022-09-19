package com.day3;

import javax.swing.JFrame;

public class JFrameTest_5 {
	// 선언부
	JFrame jf = new JFrame();
	int width = 400; int height = 300;  
	String name = "최경진";
	public void initDisplay() {
		System.out.println("뿡");
		jf.setSize(width,height);
		jf.setTitle(name);
		jf.setVisible(true);
		
	}// end of initDisplay
	// javac JFrameTest_5.java -> 컴파일 - Ctrl+S
	// java JFrameTest_5 "홍길동" "강감찬" "이순신"
	// 마우스 우클릭 - run as - run configurations - arguments - program arguments: "홍길동" "강감찬" "이순신"
	public static void main(String[] args) {
		JFrameTest_5 jft = new JFrameTest_5();
		jft.initDisplay();
		for(int i=0;i<3;i=i+1){// i=0, i=1, i=2 , i+1과 i++은 같은 뜻.
			System.out.println(args[i]);
		}
	}

} // end of JFrameTest_5

/* 변수가 갖고있는 단점
 * 한 번에 하나만 담을 수 있다
 * 같은 타입만 담을 수 있다
 * 타입이 갖고있는 크기만큼만 담을 수 있다
 * >>>>> 해결법: 배열을 사용하면 한 번에 여러개를 담을 수 있다.
 * 변수 - 배열 - 객체 배열 - list of map 자료구조 - 쿠키와 ㅅㅔ션
 */ 
