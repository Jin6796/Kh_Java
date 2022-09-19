package com.mvc.step3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

public class ModelAndView {
	Logger logger = Logger.getLogger(ModelAndView.class);
	HttpServletRequest req = null;
//	접두어 /WEB-INF/jsp/
//	접미어 .jsp
//	접두어와 접미어를 붙여서 응답 페이지의 URL을 완성한다.
	private String viewName = null;
	List<Map<String,Object>> reqList = new ArrayList<>();
//	객체 재사용을 static(공유-싱글톤패턴 하나)을 쓰지 않고 해보자 --> 생성자를 써볼까?
	public ModelAndView() {}
//	왜 파라미터가 있는 생성자여야 하는데?
//	JButton jbtn = new JButton(); ㅡㅡ> 디폴트 생성자
//	jbtn.setText("전송");
	
//	JButton jbtn = new JButton("전송");
//	내가 갖고있지 않다? ㅡ> req >> ActionSupport한테 있으니 여기서 가져오자
//	Controller > HnadlerMapping > SimpleHandlerMapping
//	생성자의 파라미터를 통해서 객체를 주입받는다.
//	setter 객체 주입법과 생성자 객체 주입법을 스프링이 제공하고 있다.
	public ModelAndView(HttpServletRequest req) {
		this.req = req;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	public String getViewName() {
		return viewName;
	}
	
	public void addObject(String name, Object obj) {
		logger.info(name+", "+obj);
		Map<String, Object> pMap = new HashMap<>();
		pMap.put(name, obj);
		// 메소드 호출하기 - 스코프 적용함
		// 메소드의 파라미터를 결정할 수 있다|없다
		// 메소드의 리턴타입을 결정할 수 있다|없다
		// 파라미터의 클래스타입으로 원본을 보낼 수 있다|없다
		// 파라미터로 전달하는 건 문자열만 가능함
		// 그러나 첨부파일은 바이너리 타입으로 처리를 해야 함
		// 전송 - post / get
		req.setAttribute(name, obj);
		reqList.add(pMap);
	}


}
