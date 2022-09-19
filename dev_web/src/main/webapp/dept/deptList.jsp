<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, book.ch1.DeptVO, java.util.ArrayList" %>
<%@ page import="java.util.*, book.ch1.DeptVO, java.util.ArrayList" %>
<%
//	sentRedirect - 불가 (반드시 유지해야하는 상황에서는 쿠키/세션을 사용하자)
//	forward - 가능 - 직접 출력해보자
	String s_name = (String)request.getAttribute("s_name");
	List<DeptVO> list = (List)request.getAttribute("list");

	out.print("서버에서 요청 객체에 담은 값: " + s_name); //null > 포워드를 처리했어야 하는데 sendRedirect로 처리되어서.
	out.print("<br>");
	out.print(list.get(0).getDeptno()+list.get(0).getDname()+list.get(0).getLoc());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>