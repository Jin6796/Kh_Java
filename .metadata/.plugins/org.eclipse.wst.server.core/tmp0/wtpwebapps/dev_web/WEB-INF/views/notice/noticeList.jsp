<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, model.vo.Notice" %>    
<%
// forward는 시간과 관계가 없다. - 시간과 관계 있는건 딱 두 가지 >> 쿠키(문자열/텍스트만)와 세션
// 바이너리 코드 - 첨부파일 작성이 가능하다
	ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list");
	out.print(list);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>noticeList.jsp</title>
</head>
<body>
공지사항 목록
</body>
</html>