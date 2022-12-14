<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 그리드 테스트</title>
<%@ include file="../common/easyui_common.jsp" %>
</head>
<body>
<script type="text/javascript">
	$(document).ready(function(){
		aleart("돔구성이 완료되었습니다."+$("#dg_board"));
		$("#dg_board").datagrid({
			columns:[[
				{field:'b_no',     title: '글번호', width:100, align: 'center'},
				{field:'b_title',  title: '제목',  width:200, align: 'left'},
				{field:'b_writer', title: '작성자', width:100, align: 'center'}
			]],
			data: [
				{b_no:1, b_title:'게시글 제목 연습이유', b_writer:'김유신'},
				{b_no:2, b_title:'게시글 제목 뿡', b_writer:'홍길동'},
				{b_no:3, b_title:'게시글 제목 우웩', b_writer:'한석봉'}
			]
		})
	})
</script>
<table id="dg_board"></table>
</body>
</html>