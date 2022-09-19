package mvc.kh;

import org.apache.log4j.Logger;
// 리액트와 조인이 일어남
// DAO [JSON포맷출력, XML 포맷출력기: DataSet] - Data Access Object - 오라클 서버와 연계해주는 전담 클래스
// XXXLogic클래스의 하나의 메소드 안에 여러개의 Dao 메소드 호출을 받아낸다.
//                               >> 업무에 대한 프로세스를 알고있다. - 판단 가능
// 모델 계층의 일부이다. - DAO가 있고 없고는 MVC 기준이 아니다.
// DataSet은 프론트앤드와 만난ㄷr. >> 응답
// MyBatis와 같은 ORM솔루션 연계 - 클래스 설계 - MyBatis와의 의존관계 포함
// 의존관계에 대해 말할 수 있는 개발자가 되자!!!!!!!!!!
public class LoginDao {
	Logger logger = Logger.getLogger(LoginDao.class);
	
	public String Login(String mem_id, String mem_pw) {
		String mem_name = null;
		mem_name = "이순신";
		
		return mem_name;
	}
}
