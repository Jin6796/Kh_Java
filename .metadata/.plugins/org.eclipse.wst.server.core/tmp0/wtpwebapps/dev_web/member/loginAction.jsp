<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 오라클 서버에 아이디와 비밀번호를 넘겨서 모두를 만족하면
// 아이디와 비밀번호가 일치하면 이름을 가져온다.
// SELECT mem_name FROM 회원 WHERE 아이디=? AND 비밀번호=?
// 오라클 서버에서 조회된 이름을 세션 객체에 담는다.
	session.setAttribute("s_name", "최경진");
%>