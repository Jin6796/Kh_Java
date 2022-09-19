<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시험 결과 확인</title>
</head>
<body>
판정 페이지 입니다.
<br>
<% 
	// 이 코드가 먼저 결정이 됨.
	String isPass = request.getParameter("isPass");
	boolean bpass = Boolean.parseBoolean(isPass);
	if(bpass) {
%>
ㅊㅋㅊㅋ 합격티비
<%
	}else{
%>
불합격 ㅋㅋ 수고티비
<% 
	}
%>
</body>
</html>