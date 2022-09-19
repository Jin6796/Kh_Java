package test.kh0503;

public class Exam3 {
	
	public static void main(String[] args) {
		//원시형 >> 값                   + 원시형은 하나의 변수만 선언할 수 있다.
		//참조형 >> 주소번지           + 클래스 안에 여러개의 변수를 선언할 수 있다.
		boolean isFail = false;
		Exam3 e3 = new Exam3 (); // 참조형 변수
		// 참조형 변수에는 여러 개의 변수가 있을 수 있다.
		System.out.println(e3); // 주소번지가 출력됨
		// 디폴트 생성자가 호출된다. >> mem_id = null, mem_pw = null, birth = null로 초기화가 됨
		// uVO를 인스턴스(참조형) 변수라고 한다.
		UserVO uVO = new UserVO();
		// mem_id = "banana", mem_pw = "156", birth = "1999-12-25"로 초기화가 됨
		uVO = new UserVO("banana", "156", "1999-12-25"); 
		System.out.println(uVO.getMem_id()); // 접근제한자가 private이라서 접근 불가능으로 인한 에러 발생.
		System.out.println(uVO.getMem_pw()); // UserVO 클래스에서 getter/setter 메소드를 생성한 후 
		System.out.println(uVO.getMem_birth()); // uVO.mem_id >> uVO.getMem_id()로 수정하면 정상적으로 실행된다.
	}

}
