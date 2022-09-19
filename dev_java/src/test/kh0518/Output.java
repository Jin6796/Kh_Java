package test.kh0518;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Output {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/com/day20/test.txt");
			fw.write(97);
			fw.write(65);
			fw.write(68);
			
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
			} finally {
			// 예외가 발생하든, 발생하지 않든 간에 반드시 처리해야하는 코드 작성
			try {
				// 입출력의 경우 악의적인 목적으로 접근하여 외부에 노출될 수 있으므로
				// 사용한 객체는 반드시 닫아야 하는 컨벤션이 있다.
				fw.close(); // 사용한 자원을 닫아줘야 한다.  -  권장사항
			} catch (Exception e2) {
			}
			}
	}

}
