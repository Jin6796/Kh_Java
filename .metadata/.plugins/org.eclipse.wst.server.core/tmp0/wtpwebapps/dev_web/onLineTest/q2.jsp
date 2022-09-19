<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String test1 = request.getParameter("htest1");
	out.print("1번문제 답안지: " + test1);
	// 쿠키 생성하기 - insert here
	Cookie ctest1 = new Cookie("test1", test1);
	ctest1.setPath("/onLineTest");
	ctest1.setMaxAge(30*60);
	response.addCookie(ctest1);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문제 2</title>
<script type="text/javascript">
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
	function prev(){
		location.href = "q1.jsp";
	}
	function next() {
		console.log('next');
		let temp = 1;
		for(let i = 0; i<document.f_test1.cb.length; i++){
			if(document.f_test1.cb[i].checked == 1){
				document.f_test1.htest2.value = temp;
			}else{
				temp = temp + 1;
			}
		}/// end of for
		document.f_test1.submit();
	}
</script>
</head>
<body>
	<form name="f_test1" method="get" action="q3.jsp">
		<input type="hidden" name="htest2">
		문제2. 다음 중 DDL구문이 아닌 것을 고르시오.<br>
		<input type="checkbox" name="cb" onChange="test(0)">create<br>
		<input type="checkbox" name="cb" onChange="test(1)">drop<br>
		<input type="checkbox" name="cb" onChange="test(2)">alter<br>
		<input type="checkbox" name="cb" onChange="test(3)">delete<br>
		<br>
		<input type="button" value="이전문제" onClick="prev()">
		<input type="button" value="다음문제" onClick="next()">
	</form>

</body>
</html>