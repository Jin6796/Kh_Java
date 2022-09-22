package com.mvc.step3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.util.HashMapBinder;

/*
 * boardList or login과 같은 메소드는 BoardController 또는 LoginController에서 처리할 메소드이다.
 * 그런데 왜 회원관리를 위한 MemberController에 있어야 할까? - 고민 - Spring은 어떻게 이 문제를 해결했나?
 * 클래스 설계에 문제가 있는데?? >> 무슨 문제? >> 의존 관계!!!!!!!!!!! MemberController와 Controller3가 지나치게 의존관계에 있잖아
 *    그럼 어떻게 해결할 수 있을까? >> 추상 클래스를 활용해서 처리해볼 수 있지 않을까? >> 얘는 상속 문제가 있잖아.. - 결합도 증가(단위/통합 테스트 불가) >> 한 명이 야근 시 전원 야근
 * 개발자의 성향이나 취향에 따라 다르게 설계될 수 있다. - Spring(F/W-프레임워크)을 사용하면 일관된 처리가 가능.(실력차이 평준화)
 * 업무마다 업무의 복잡도, depth가 다르다.
 * 먼저 끝나는 사람과 업무가 복잡해서 늦게 끝나는 사람 >> 다른 팀 백업해야 함 우웩 우웩 우웩
 * 
 * 프레임워크(시스템) 입장에서 메모리 활용에 대한 효과를 생각해본다면?
 * 게으른 인스턴스화는 지역변수이니까 메소드가 끝나면 자동소멸된다. - 가비지 컬렉터(청소부)가 사용한 메모리를 회수함.
 * 메모리가 회수되면 NullPointerException이 떨어짐 > 호출이 되지 않고 500번을 반환받는다. (Tomcat서버가 응답으로..)
 * 500번이면 XXX.java 코드를 본다.
 * 그런데 jsp (html, js, css)를 보고 있다면? >> 디버깅 못하는 사람! 원인을 몰라~!!
 * POJO에서는 생성된 객체의 메모리 관리 책임이 개발자에게 있다.
 * Spring에서는 객체 생성에 대한 라이프사이클 관리를 대신 해준다. >> 연차가 다른 개발자의 실력 차이를 평준화 시켜주는 효과가 있다.
 */

public class MemberController implements Controller3 {
	Logger logger = Logger.getLogger(MemberController.class);
	MemberLogic memberLogic = new MemberLogic();
	
	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res, Map<String, Object> pMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object login(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object clogin(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object boardList(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object boardInsert(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object boardDetail(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object boardUpdate(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object boardDelete(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}

	// 인간복제기 Ctrl+C, Ctril+V 갖다가 쓰기 (어디에 복붙? 어디를 수정?)
	
	@Override
	public ModelAndView memberList(HttpServletRequest req, HttpServletResponse res) {
		logger.info("memberList 호출 성공");
//		ModelAndView 객체를 설계함에 따라서 req가 없어도 조회결과를 담을 수 있게 됨
		Map<String,Object> pMap = new HashMap<>();
		HashMapBinder hmb = new HashMapBinder(req);
		hmb.bind(pMap);
		ModelAndView mav = new ModelAndView(req);
		List<Map<String,Object>> memberList = null;
		memberList = memberLogic.memberList(pMap);
		mav.addObject("memberList", memberList);
		mav.setViewName("auth/jsonMemberList");
		return mav;
	}

	@Override
	public Object doEmp(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}

}
