<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>인증처리 - 쿠키와 세션</title>
<%@include file="../common/easyui_common.jsp" %>
<script type="text/javascript">
	function login(){
		const tb_id = $("#tb_id").val();
		const tb_pw = $("#tb_pw").val();			
		location.href="./login.pj?mem_id="+tb_id+"&mem_pw="+tb_pw;
	}
	function logout(){
		location.href="./logout.jsp";
	}
</script>
</head>
<body>
	<script>
	// DOM트리가 다 그려진건가?
	$(document).ready(function(){
		$("#tre_gym_easyui_tree_2 span").click(function(){
			alert("여기");
		})
		$(".member li").click(function(e){
			alert("call: " + e.target.val);
		});
	});
	</script>
	<div style="margin: 20px 0;"></div>
	<div class="easyui-layout" style="width: 1000px; height: 500px;">
		<div data-options="region:'south',split:true" style="height: 50px;"></div>
	    <div data-options="region:'west',split:true" title="KH정보교육원"
	         style="width: 200px;">
	                 
      		<div style="margin: 10px 0;"></div> <!-- 여백 -->
     
<%
	String s_name = (String)session.getAttribute("s_name");
	//s_name = "이순신";
	if(s_name ==null){
%>
<!-- ######################## 로그인 영역 ################### -->      
      <div id="d_login" align="center">
      <div style="margin: 3px 0;"></div>
      <input id="mem_id" name ="mem_id" class="easyui-textbox"/>
      <script type="text/javascript">
         $("#mem_id").textbox({
            iconCls:'icon-man',
            iconAlign: 'right',
            prompt: '아이디'
         });
      </script>
      <div style="margin: 3px 0;"></div>
      <input id="mem_pw" name ="mem_id" class="easyui-psswardbox"/>
      <script type="text/javascript">
         $("#mem_pw").passwordbox({
            iconAlign: 'right',
            prompt: '비밀번호'
         });
      </script>
      <div style="margin: 3px 0;"></div>
         <a id="btn_login" href="javascript:login()" class="easyui-linkbutton" data-options="iconCls:'icon-man'">
            로그인
         </a>
         <a id="btn_member" href="javascript:memberShip()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">
            회원가입
         </a>
      </div>   
<!-- ######################## 로그인 영역 끝 ##################### -->

<!-- 안했네 -->
<%
	}else {
%>
<!-- ######################## 로그아웃 영역 ################### -->   
      <div id="d_logout" align="center">
         <div id="d_ok"><%=s_name%>님 환영합니다.</div>
         <div style="margin:3px 0"></div>
         <a id="btn_login" href="javascript:logout()" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">
            로그아웃
         </a>
         <a id="btn_member" href="javascript:memberUpdate()" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">
            정보수정
         </a>
      </div>
<!-- ######################## 로그아웃 영역 끝 ##################### -->
<%
	} // end of else
%>
<!-- ######################## 메뉴 영역 시작  ##################### -->
	  <div style="margin:20px 0;"></div>
	        <ul id="tre_gym" class="easyui-tree">
	            <li data-options="state:'closed'">
	                <span>회원관리</span>
	                <ul class ="member">
	                    <li>
	                        회원 목록
	                    </li>
	                    <li>
	                        회원 등록
	                    </li>
	                    <li>
	                        회원 삭제
	                    </li>
	                </ul>
	            </li>
	            
	             <li data-options="state:'closed'">
	                <span>쪽지관리</span>
	                <ul>
	                    <li>
	                        <span>받은 쪽지함</span>
	                    </li>
	                     <li>
	                        <span>보낸 쪽지함</span>
	                    </li>
	                </ul>
	            </li>
	            
	            <li data-options="state:'closed'">
	                <span>게시판</span>
	                <ul>
	                    <li >
	                        <span>1:1 게시판</span>
	                    </li>
	                     <li>
	                        <span>공지게시판</span>
	                    </li>
	                </ul>
	            </li>
	            
	            
	        </ul>
	    </div>
 
<!-- ######################## 메뉴 영역 끝 ##################### -->
        <div data-options="region:'center',title:'TerrGYM System',iconCls:'icon-ok'">
        	<div style="margin: 5px 0;"></div>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>인증처리 - 쿠키와 세션</title>
<%-- <%@include file="../common/easyui_common.jsp" %>
 --%><script type="text/javascript">
	function login(){
		const tb_id = $("#tb_id").val();
		const tb_pw = $("#tb_pw").val();			
		location.href="./login.pj?mem_id="+tb_id+"&mem_pw="+tb_pw;
	}
	function logout(){
		location.href="./logout.jsp";
	}
</script>
</head>
<body>
	<script>
	// DOM트리가 다 그려진건가?
	$(document).ready(function(){
		$("#tre_gym_easyui_tree_2 span").click(function(){
			alert("여기");
		})
		$(".member li").click(function(e){
			alert("call: " + e.target.val);
		});
	});
	</script>
	<div style="margin: 20px 0;"></div>
	<div class="easyui-layout" style="width: 1000px; height: 500px;">
		<div data-options="region:'south',split:true" style="height: 50px;"></div>
	    <div data-options="region:'west',split:true" title="KH정보교육원"
	         style="width: 200px;">
	                 
      		<div style="margin: 10px 0;"></div> <!-- 여백 -->
     
<%
/* 	String s_name = (String)session.getAttribute("s_name"); */
	//s_name = "이순신";
	if(s_name ==null){
%>
<!-- ######################## 로그인 영역 ################### -->      
      <div id="d_login" align="center">
      <div style="margin: 3px 0;"></div>
      <input id="mem_id" name ="mem_id" class="easyui-textbox"/>
      <script type="text/javascript">
         $("#mem_id").textbox({
            iconCls:'icon-man',
            iconAlign: 'right',
            prompt: '아이디'
         });
      </script>
      <div style="margin: 3px 0;"></div>
      <input id="mem_pw" name ="mem_id" class="easyui-psswardbox"/>
      <script type="text/javascript">
         $("#mem_pw").passwordbox({
            iconAlign: 'right',
            prompt: '비밀번호'
         });
      </script>
      <div style="margin: 3px 0;"></div>
         <a id="btn_login" href="javascript:login()" class="easyui-linkbutton" data-options="iconCls:'icon-man'">
            로그인
         </a>
         <a id="btn_member" href="javascript:memberShip()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">
            회원가입
         </a>
      </div>   
<!-- ######################## 로그인 영역 끝 ##################### -->

<!-- 안했네 -->
<%
	}else {
%>
<!-- ######################## 로그아웃 영역 ################### -->   
      <div id="d_logout" align="center">
         <div id="d_ok"><%=s_name%>님 환영합니다.</div>
         <div style="margin:3px 0"></div>
         <a id="btn_login" href="javascript:logout()" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">
            로그아웃
         </a>
         <a id="btn_member" href="javascript:memberUpdate()" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">
            정보수정
         </a>
      </div>
<!-- ######################## 로그아웃 영역 끝 ##################### -->
<%
	} // end of else
%>
<!-- ######################## 메뉴 영역 시작  ##################### -->
	  <div style="margin:20px 0;"></div>
	        <ul id="tre_gym" class="easyui-tree">
	            <li data-options="state:'closed'">
	                <span>회원관리</span>
	                <ul class ="member">
	                    <li>
	                        회원 목록
	                    </li>
	                    <li>
	                        회원 등록
	                    </li>
	                    <li>
	                        회원 삭제
	                    </li>
	                </ul>
	            </li>
	            
	             <li data-options="state:'closed'">
	                <span>쪽지관리</span>
	                <ul>
	                    <li>
	                        <span>받은 쪽지함</span>
	                    </li>
	                     <li>
	                        <span>보낸 쪽지함</span>
	                    </li>
	                </ul>
	            </li>
	            
	            <li data-options="state:'closed'">
	                <span>게시판</span>
	                <ul>
	                    <li >
	                        <span>1:1 게시판</span>
	                    </li>
	                     <li>
	                        <span>공지게시판</span>
	                    </li>
	                </ul>
	            </li>
	            
	            
	        </ul>
	    </div>
 
<!-- ######################## 메뉴 영역 끝 ##################### -->
        <div data-options="region:'center',title:'TerrGYM System',iconCls:'icon-ok'">
        	<div style="margin: 5px 0;"></div>
             <p style="margin: 20px 10px">
             여기는 TerrGYM 시스템 입니다.<br>
             로그인 후 사용하시길 바랍니다.<br>
             </p>
             <div id="d_memberList">회원목록</div>
        	<div style="margin: 20px 0;"></div>
        	<div id="dg_member"></div>
        </div>
    </div>
</body>
</html>
        	<div style="margin: 20px 0";"></div>
        	<div id="dg_member"></div>
        </div>
    </div>
</body>
</html>