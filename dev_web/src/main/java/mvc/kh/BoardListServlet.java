package mvc.kh;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import model.vo.Board;

public class BoardListServlet extends HttpServlet {
	Logger logger = Logger.getLogger(BoardListServlet.class);
	JDBCTemplate jt = JDBCTemplate.getInstance();
	Connection conn = null;
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException{
		logger.info("doGet 호출 성공");
		conn = jt.getConnect();
		// 아래에서 선언만 함
		List<Board> boardList = null;
		logger.info("boardList 주소번지 1: " + boardList);
		BoardDao boardDao = new BoardDao();
		// 아래 코드에서 BoardDao의 selectBoard(conn)메소드의 리턴값으로 받음
		boardList = boardDao.selectBoard(conn);
		logger.info("boardList 주소번지 2: " + boardList);
		// 위치의 문제 - 뭐가 다른 거임 ??
		// 31번에서 인스턴스화 한 후 아래에서 다시 인스턴스화! 
//		결과적으로는 31번에서 생성된 객체가 아니라 아래에서 재생성됨 >> 타입은 같지만 주소번지가 다름. --오버라이딩
//		boardList = new ArrayList<>();
		logger.info("boardList 주소번지 3: " + boardList);
		req.setAttribute("boardList", boardList);
		RequestDispatcher view = req.getRequestDispatcher("/board_k/boardList.jsp");
		view.forward(req, res);		
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException{
		logger.info("doPost 호출 성공");

	}	
}
