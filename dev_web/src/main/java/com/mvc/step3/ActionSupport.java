package com.mvc.step3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.mvc.step3.Board3Controller;
import com.mvc.step3.ModelAndView;

/*
 * 리턴타입을 String + ModelAndView를 추가적으로 지원해보자
 * CRUD 구현에 필요한 로직을 if문이 아닌 메소드 중심의 코딩 전개가 가능하도록 개선해보자!!!
 * : 메소드 안에 req와 res를 지원해야한다. 
 * 그러기 위해서는 클래스 설계를 어떻게 가져가야할까?
 * :board3/boardList.pj와 메소드 이름으로 매칭을 할 수 있어야 한다.
 * 넌 FrontController!!!!
 * request 객체와 response객체를 주입받는다.
 * LiveServer 내 안에는 servlet-api.jar와 jsp-api.jar가 없다.
 * 요청객체로 할 수 있는 것
 * request.getParameter("name"); 듣기
 * PrintWriter out = req.getWriter(); // document.write(""); 태그를 쓴다 (출력)
 * 페이지 처리
 * 페이지 이동
 * response.sendRedirect("");
 * response.setContentType("text/html;utf-8") // 마입타입 결정
 * 브라우저가 보고 처리를 한다.
 * scope의 하나이다. - request.setAttribute("이름", 값) - 유지
 * request.getRequestDispatcher("XXX.jsp").forward(req,res)
 * session.setAttribute("",값);
 * HttpSession session = request.getSession();  세션객체를 생성할 때도 request가 필요하다.
 */
public class ActionSupport extends HttpServlet {
	Logger logger = Logger.getLogger(ActionSupport.class);
	
	private void doService(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		logger.info("doService 호출 성공");
		String requestURI = req.getRequestURI(); // -> /board2/boardApp.kh?crud=select
		String contextPath = req.getContextPath();
		String command = requestURI.substring(contextPath.length()+1);
		int end = command.lastIndexOf(".");
		command = command.substring(0,end);
		String upmu[] = null;
		upmu = command.split("/");
		logger.info(upmu[0]+", "+upmu[1]);
//		1-2, 3과는 다르게 메소드에 파라미터로 upmu 배열을 전달하기 때문에 아래 코드는 필요가 없음.
//		req.setAttribute("upmu", upmu);
//		업무에 대응하는 컨트롤러 클래스에 대한 인스턴스화는 HandlerMapping 클래스에서 하기 때문에 아래 코드도 필요 없음
//		Board2Controller boardController = new Board2Controller();
		Object obj = null;
		try {
			obj = HandlerMapping.getController(upmu, req, res);
		} catch (Exception e) {
			logger.info("Exception: "+e.toString());
		}
		
		if(obj!=null) {
			String pageMove[] = null;
			ModelAndView mav = null;
			if(obj instanceof String) {
				if(((String)obj).contains(":")){
					logger.info(":콜론이 포함되어 있어요");
					pageMove = obj.toString().split(":");
				}else {
					logger.info(": 콜론이 포함되어 있지 않아요");
					pageMove = obj.toString().split("/");
				}
				logger.info("pageMove==>"+pageMove[0]+","+pageMove[1]);
			}/// end of String
			// Model(데이터-내 안에 List있다!)과 View의 혼합
			else if(obj instanceof ModelAndView) {
				mav = (ModelAndView)obj;
				pageMove = new String[2]; // forward
				pageMove[0] = "forward";
				pageMove[1] = mav.getViewName();
				logger.info("pageMove==>"+pageMove[0]+","+pageMove[1]);

		}
			if(pageMove !=null) {
				String path = pageMove[1];
				if("redirect".equals(pageMove[0])){ // 너 select가 아니야?
					res.sendRedirect(path);
				}	
				else if("forward".equals(pageMove[0])) { // 난 유지하게 해줄래
					RequestDispatcher view = req.getRequestDispatcher("/"+path+".jsp");
					view.forward(req, res);
				}
				else {//redirect나 forward문자열이 없는 경우라면?
					path = pageMove[0]+"/"+pageMove[1];
					RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/jsp/"+path+".jsp");
					view.forward(req, res);
				}
			} // end of 출력 페이지 호출. URL 패턴 조립하기
		}     // end of 컨트롤계층 리턴 결과		
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		logger.info("doGet 호출 성공");
		doService(req,res);
	}


	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		logger.info("doPost 호출 성공");
		doService(req,res);
	}
}
