package com.day3;

public class JFrameTest {
	// 선언부
	
	// 화면처리부 - non-static타입의 메소드 선언 > void 앞에 static이 없으니까..
	// non-static의 메소드는 메인 메소드에서 호출이 불가
	public void initDisplay() {
		System.out.println("initDisplay 호출 성공");
	}// end of initDisplay 
	// 메인메소드 - 실행할 수 있다. exe 파일로 만들 수 있다. 가장 먼저 실행된다.
	// entry point - main thread

	public static void main(String[] args) {
		// public: 접근제한자, static: 변수, void: 빈 공간(반환 타입), 
		// String: 파라미터(parameter)> 뒤에는 대괄호:어레이(배열) / 파라미터의 기능: 듣기
		JFrameTest jft = new JFrameTest();
		jft.initDisplay();
		
				

	}

} // end of JFrameTest
