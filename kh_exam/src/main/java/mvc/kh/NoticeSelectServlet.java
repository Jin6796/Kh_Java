package mvc.kh;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;


public class NoticeSelectServlet extends HttpServlet {
	Logger logger = Logger.getLogger(NoticeSelectServlet.class);
	NoticeService noticeService = new NoticeService();
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException{
		logger.info("doGet 호출 성공");
		ArrayList<Notice> list = new NoticeService().selectList();
		req.setAttribute("list", list);
		String page = null;
		if(list !=null) {
			page = "/WEB-INF/views/notice/noticeList.jsp";
			req.setAttribute("list", list);
		}else {
			page = "/WEB-INF/views/common/errorPage.jsp";
			req.setAttribute("msg", "공지사항 조회 실패");
		}
//		아래 코드는 그 아래 두 줄의 코드와 같은 코드라 간편해 보이지만 
//		NullPointerException에 대한 방어코드를 작성할 수 없기 때문에 좋지 않은 코드이다. -- 리팩토링
//		req.getRequestDispatcher(page).forward(req, res);
		RequestDispatcher view = req.getRequestDispatcher(page);
		view.forward(req, res);
		
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException{
		logger.info("doPost 호출 성공");

	}	
}
