<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문제 1</title>
<script type="text/javascript">
// 브라우저가 DOM트리를 구성할 떄 하나면 그 이름이 그대로 적용이 되지만, 같은 이름이 여러개이면 자동으로 배열 전환 처리가 됨 (브라우저가 해줌)
// 페이지 이동하는 코드 
// form 태그 사용
// location.href ,
// response.sendRedirect("a.jsp")
// view.forward(request, response)
// ajax({
//	url:"XXX.jsp" or XXX.pj ActionSupport
// })
	function test(pcb) {
		console.log(pcb); // pcb는 checkbox에 대한 index 값이다. 그래서 0부터.. (배열)
		for(let i=0; i<document.f_test1.cb.length; i++){
			if(pcb==i){
				document.f_test1.cb[i].checked = 1;
			} else {
				document.f_test1.cb[i].checked = 0;
			}
		}
	}
// 다음 문제로 이동하기 - URL - 기존 요청이 끊어진다 - 유지 문제
	function next() {
	// 사용자가 선택한 답안 정보를 기억
	// 현재 페이지에 대한 사용자의 선택을 전송하기
		console.log('next');
		let temp = 1;
		for(let i = 0; i<document.f_test1.cb.length; i++){
			if(document.f_test1.cb[i].checked == 1){
				document.f_test1.htest1.value = temp;
			}else{
				temp = temp + 1;
			}
		}/// end of for
		document.f_test1.submit();
	}
</script>
</head>
<body>
	<form name="f_test1" method="get" action="q2.jsp">
		<input type="hidden" name="htest1">
		문제1. 다음 중 DML구문이 아닌 것을 고르시오.<br>
		<input type="checkbox" name="cb" onChange="test(0)">select<br>
		<input type="checkbox" name="cb" onChange="test(1)">insert<br>
		<input type="checkbox" name="cb" onChange="test(2)">create<br>
		<input type="checkbox" name="cb" onChange="test(3)">delete<br>
		<br>
		<input type="button" value="다음문제" onClick="next()">
	</form>
	
</body>
</html>