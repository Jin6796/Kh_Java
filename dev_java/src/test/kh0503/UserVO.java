package test.kh0503;
// 데이터만 담을 수 있는 클래스를 설계하기
// 접두어에 사용된 VO는 Value Object의 약자이다.
// 자바의 변수와 오라클의 변수 사이에 매치애주는 클래스 설계이름이다.
public class UserVO {
	// 전역변수의 위변조를 막기 위에서 private으로 선언한 뒤 
	// 값을 꺼내야 할 때는 getter 메소드를 호출하고, 
	// 값을 (전역변수에)담을 때는 setter 메소드의 파라미터를 통해 복사된 값이 전역변수인 mem_id에 저장된다.
	private String mem_id;//ㅡ     아이디를 담을 변수 선언
	private String mem_pw;//     비밀번호를 담을 변수 선언
	private String mem_birth;//  생년월일을 담을 변수 선언
	// 디폴트 생성자 - 파라미터가 하나도 없는 생성자 >> 니가 있어서 내가 RAM(h/w)에 올라간다.(for 재사용)
	// 전역변수를 재사용하기 위해서는 반드시 생성자를 호출해야 함.
	public UserVO () { }
	// 세 개의 파라미터를 갖는 생성자를 통해서 전역변수의 초기화가 가능함.
	public UserVO(String mem_id, String mem_pw, String mem_birth) {
		//this가 붙은 mem_id만 전역변수, this가 없는 변수는 지역변수(위치: 파라미터)
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_birth = mem_birth;  // >>> 전역변수의 초기화
		}                  
	public String getMem_id() {
		return mem_id;
	}
	// 접근제한자가 public이므로 외부에서 접근이 가능하다.
	// 파라미터를 통해서 값이 전달되고 전역변수인 mem_id 스트링 배열에 해당하는 값이 저장된다.
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pw() {          //* Getter, setter 메소드 생성 방법
		return mem_pw;                   //  6-8라인 드래그 > 마우스 우클릭 > Source - Getters and Setters
	}                                    //               > select all, Insertion point: Last member
	public void setMem_pw(String mem_pw) {   
		this.mem_pw = mem_pw;
	}
	public String getMem_birth() {
		return mem_birth;
	}
	public void setMem_birth(String mem_birth) {
		this.mem_birth = mem_birth;
	}

}
