package com.day20;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest_1 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/com/day20/sss.txt"); // git이랑 연결 시 절대경로 입력
			fw.write(65); // A
			fw.write(97); // a
			fw.write(98); // b
		} catch (FileNotFoundException fe) {
			System.out.println("해당 파일을 찾을 수 없습니다.");
			
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		} catch (Exception e) {
			//예외가 발생했을 때 에러상황을 기록해두는 stack메모리 영역에 있는
			//에러메세지를 라인번호와 함께 출력해주는 메소드입니다.
			// 주의: print메소드 안에서 사용하지 말 것!!!!!!!
			e.printStackTrace(); // 에러 발생 시 조금 더 자세한 힌트문을 수집할 때 사용
//		} finally {
//			// 예외가 발생하든, 발생하지 않든 간에 반드시 처리해야하는 코드 작성
//			try {
//				// 입출력의 경우 악의적인 목적으로 접근하여 외부에 노출될 수 있으므로
//				// 사용한 객체는 반드시 닫아야 하는 컨벤션이 있다.
//				fw.close(); // 사용한 자원을 닫아줘야 한다.  -  권장사항
//			} catch (Exception e2) {
//			}
		} // end of finally

	} // end of main
}// end of class
