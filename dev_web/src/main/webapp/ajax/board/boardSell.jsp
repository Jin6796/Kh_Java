<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
jsp: java server page
처리 주체: 서버(WAS:web application server) -- tomcat9.0 버전 사용
동적 페이지 처리가 가능하다.       - Back-End  Developer
html, css, js > 정적페이지 처리 - Front-End Developer
VS-CODE에서 사용하던 live server는 사용이 불가한가요? 네 서버에 jsp엔진이 없어서요.
-->
<%
  String name = "scott";
  out.print(name);//scott출력 - 브라우저에
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous" defer></script>
<style type="text/css">
    body{
      text-align: center;
    }
    table{
      margin-left: auto;
      margin-right: auto;
      border: thin dotted gray;
    }
    th, td {
      border: thin dotted gray;
    }
    th {
      background-color: yellow;
    }
</style>
<script>
  function getBoardSold(){
    $.ajax({
      method:"get", /* get방식은 intercept 당한다잉 */
      url:"./boardSellAction.jsp?"+new Date().getTime(),
      success:function(result){
				// console.log("result: " + result);
				const boardSold = $("#boardSold").text(result); // 10 -> 15
				const cost = $("#cost").text();
				const price = $("#price").text();
				const cashPerBoard = price-cost;
				// alert("구매가 가져오기: "+cost);
				// alert("소비자가 가져오기: " +price);
				// alert("보드 당 마진금액: " + cashPerBoard);
				$("#cash").text(cashPerBoard*result);
      }
    });
  }
   // 두 번째 파라미터로 받은 문자열을 첫번째 파라미터 받은 위치에 붙여준다.
  function replaceText(el,text){
		if(el !=null){
			//기존의 노드에 들어있는 값은 초기화 시킨다.
			clearText(el);
			let newNode = document.createTextNode(text);
			el.appendChild(newNode);
		}
	}
  </script>
</head>
<body>
	<table width="300px" height="80px">
		<tr>
			<td align="center" colspan="2">보드판매집계</td>
		</tr>
		<tr>
			<th width="120px">보드판매량</th>
			<!-- 텍스트노드는 태그이름은 없고 태그값만 있다. -->
			<td width="180px"><span id="boardSold">10</span></td>
		</tr>
		<tr>
			<th width="120px">구매가</th>
			<td width="180px"><span id="cost">700000</span></td>
		</tr>
		<tr>
			<th width="120px">소비자가</th>
			<td width="180px"><span id="price">850000</span></td>
		</tr>
	</table>
	<h2>
		마진금액 : <span id="cash">1500000</span>
	</h2>
	<button onclick="getBoardSold()">마진금액은?</button>
</body>
</html>