package test.kh0503;
// 더 큰 타입은 더 작은 타입에 대입연산자를 통해서 재정의 할 수 없다.
// 대입(=)연산자를 기준으로 오른쪽이 왼쪽보다 큰 타입이 오면 폭망~~~

public class Exam1 {
	int j = 3;
	public static void main(String[] args) {
		int i = 5; //지역변수
		double d = 1.5;
		i = (int)d; // 캐스팅연산자를 사용해서 합법으로 만들어줄 수 있다.
		// 위와 같이 강제 형전환이 이루어지게 되면 int에 들어갈 수 있는 값만 저장이 된다. (0.5는 버려짐)
		System.out.println(i);
		boolean isOK = false; //if나 while같은 제어문에서는 필수!!!!!!!
		if(isOK) {
			float f = 1.5f;
			//조건을 만족하지 않으면 단 한번도 실행의 기회를 주지 않는다.
			//insert here - 실행문
		}else {
			
		}
		Exam1 e1 = new Exam1 ();
		//지역변수는 "인스턴스변수.변수명"이 불가능하다.
//		System.out.println(e1.i);
		System.out.println(e1.j);
	}

}
