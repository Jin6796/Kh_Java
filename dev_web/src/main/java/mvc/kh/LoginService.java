package mvc.kh;

import org.apache.log4j.Logger;

// 여러개의 Dao를 호출할 수 있다. - 트랜잭션 처리
// 하나의 테이블에서 조회된 정보를 가지고 A테이블에는 insert, B테이블에는 update처리한다. - 여기까지가 하나의 업무
// 트랜잭션 처리는 Logic 클래스에서 해야만 한다.
public class LoginService {
	Logger logger = Logger.getLogger(LoginService.class);
	// 이른 인스턴스화 (스프링) - 멤버 // 클래스 선언 바로 뒤에 두는 게 제일 베스트.
	// 게으른 인스턴스화 - 필요할 때 직전에 주입. - 효율성 - NullPointerException
	// 로컬 성격 - 지변
	LoginDao loginDao = new LoginDao();
	public String login(String mem_id, String mem_pw) {
		
		return null;
	}
}
