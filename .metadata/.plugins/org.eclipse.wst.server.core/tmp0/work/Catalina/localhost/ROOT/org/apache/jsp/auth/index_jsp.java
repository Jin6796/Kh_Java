/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-09-01 03:44:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.auth;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.vo.MemberVO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/auth/../common/easyui_common.jsp", Long.valueOf(1659485655057L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.vo.MemberVO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

	MemberVO mVO = (MemberVO)session.getAttribute("mVO");
	String s_id   = null;
	String s_name = null;
	
	if(mVO!=null) {
	s_id   = mVO.getMem_id();
	s_name = mVO.getMem_name();
	out.print("회원입니다. [회원 아이디: " + s_id+"], [회원 이름: "+s_name+"]"); // 처음에는 null, null이 찍힐 듯
	} else {
		out.print("비회원입니다.");
	}
//	out.print("위치 어디야?");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>인증처리 - 쿠키와 세션</title>\r\n");

// íì¥ìë¥¼ jspë¡ í´ì¼ ì¤í¬ë¦½íë¦¿ ì¬ì©ì´ ê°ë¥í¨
// JSP = html+CSS+JS(ë¸ë¼ì°ì -ì¸í°íë¦¬í°-ë¡ì»¬-ë¤ì´ë¡ë)+JAVA (ë°±ìë-ìë²ê° ì£¼ì²´-ìë²ì¸¡ìì ì²ë¦¬ë ê²°ê³¼ê° ë¤ì´ë¡ëë¨)
// ì ì¤ìíë ì´ê²? > ìê°ì°¨ ëë¬¸ì! (ì¸ì¤í´ì¤í - ìì¹ - ì±ê¸í¤í¨í´ - ìë¸ë¦¿ ì±ê¸í¤ ê´ë¦¬)
// ìë¸ë¦¿ì ë¼ì´í ì¬ì´í´ - ì¤ë ëë¡ ê´ë¦¬ > ê´ë¦¬ëë ì£¼ì²´: ê°ì²´(ìë¸ë¦¿)
// ì ìë¸ë¦¿ì´ì´ì¼ íì§? >> ìë¸ë¦¿ì´ì´ì¼ ì¹ìë¹ì¤ê° ê°ë¥íëê»~
//		                       ì¹ìë¹ì¤ë ìì²­ì¼ë¡ ììí´ì ìëµì¼ë¡ ëëë ê² (ìì²­ì ìí´ ìì²­ê°ì²´ì ìëµê°ì²´ì ëí ê°ì²´ ì£¼ìì´ íìíë¤.)
//                                                                ëê°? í°ìº£ì´! ëêµ¬ìê²? ìì²­ììê²!
//		 												ìì²­ë°©ì: GET/POST
//		 												ìë¹ì¤ë¥¼ ì ê³µíë ë°±ìë ë¨ìì ì ì¡ë°©ìì ë§¤ì¹­ëë ë©ìëê° íìíë¤ (doGet, doPost)
// a.jsp -> a_jsp.java -> a_jsp.class -> ë¸ë¼ì°ì  ì°ê¸°
//     jsp ì»¨íì´ë(ìì§), servlet-api.jar(ìë¸ë¦¿ ìì§)
// init() - service() - destroy()  
// >> ê°ë°ìë? init() - service(req,res) / doGet,doPost(êµ¬ë¶ ê°ë¥) - destroy()
// í°ìº£ ìë²ê° init()ê³¼ destroy()ê¹ì§ë ì±ìì ì§ë¤ - ê°ë°ì ì±ìì´ ìë
// íë¡ì í¸ ì´ë¦ë§ë¤ ê²½ë¡ê° ë¤ë¥¼ ì ìë¤.
// ë§¤ë² ê·¸ ëë§ë¤ ê²½ë¡ë¥¼ ìì íë¤?? ì°ì©
// WASìì ê´ë¦¬íë server.xmlë¬¸ììì Contextì ì ë³´ë¥¼ ê°ì ¸ì¤ë ë©ìë í¸ì¶!
    StringBuilder path = new StringBuilder(request.getContextPath());
    path.append("/");

      out.write("   \r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://www.jeasyui.com/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path.toString() );
      out.write("themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path.toString() );
      out.write("demo/demo.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path.toString() );
      out.write("themes/icon.css\">\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.js\"></script>");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	a {\r\n");
      out.write("		text-decoration: none;\r\n");
      out.write("		color: black;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("// 함수 선언은 head 태그 안에서!!!\r\n");
      out.write("// easyui_common.jsp\r\n");
      out.write("	function login(){\r\n");
      out.write("		const tb_id = $(\"#mem_id\").val();\r\n");
      out.write("		const tb_pw = $(\"#mem_pw\").val();			\r\n");
      out.write("		location.href=\"./login.pj?mem_id=\"+tb_id+\"&mem_pw=\"+tb_pw;\r\n");
      out.write("	}\r\n");
      out.write("	function logout(){ // 로그아웃\r\n");
      out.write("		location.href=\"./logout.jsp\";\r\n");
      out.write("	}\r\n");
      out.write("	// 순서 지향적인, 절차 지향적인 코딩을 전개 하는 데에서 모듈화 해 나가는 것, 비동기 처리하는 연습(await/async)\r\n");
      out.write("	function memberList(){ // 회원목록\r\n");
      out.write("        alert($(\"#_easyui_textbox_input4\").val());\r\n");
      out.write("	\r\n");
      out.write("        let type = null;\r\n");
      out.write("        let keyword = null;\r\n");
      out.write("\r\n");
      out.write("        if($(\"#_easyui_textbox_input4\").val()!=null && $(\"#_easyui_textbox_input4\").val()) {\r\n");
      out.write("            type = \"mem_id\";\r\n");
      out.write("            keyword = $(\"#_easyui_textbox_input4\").val();\r\n");
      out.write("        }\r\n");
      out.write("        else if($(\"#_easyui_textbox_input5\").val()!=null && $(\"#_easyui_textbox_input5\").val()) {\r\n");
      out.write("            type = \"mem_name\";\r\n");
      out.write("            keyword = $(\"#_easyui_textbox_input5\").val();\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("//		alert(\"회원목록 호출 성공\");\r\n");
      out.write("		// 아래 코드는 클라이언트 측에 같이 다운로드가 완료된 상태에서 처리된다. - 결정이 되었다.\r\n");
      out.write("		\r\n");
      out.write("		// 시점 문제 유의하자\r\n");
      out.write("		// jeasyUI datagrid에서도 get/post방식을 지원함\r\n");
      out.write("		$(\"#dg_member\").datagrid({\r\n");
      out.write("			// 오라클 서버에서 요청한 결과를 myBatis를 사용하면 자동으로 컬럼명이 대문자! 단, List<XXVO>형태라면 그땐 소문자가 맞다.\r\n");
      out.write("			method:\"get\"\r\n");
      out.write("		// url 속성에 XXX.jsp가 오면 표준 서블릿인 HttpServlet이 관여하는 것이고 XXX.pj로 요청하면 ActionSupport가 관여하는 것\r\n");
      out.write("			,url: \"/member/memberList.pj?type=\"+type+\"&keyword=\"+keyword // JSON으로 전달하는 페이지가 조립이 되어야 한다. (응답페이지는 html이 아니라 JSON포맷의 파일이어야 한다.)\r\n");
      out.write("			,onDblClickCell: function(index,field,value){\r\n");
      out.write("				console.log(index + \", \" + field + \", \" + value);\r\n");
      out.write("				if(\"BUTTON\" == field){\r\n");
      out.write("					alert(\"쪽지쓰기 클릭\");\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("		});	\r\n");
      out.write("        $(\"#d_member\").show();\r\n");
      out.write("		$(\"#d_memberInsert\").hide();\r\n");
      out.write("	}\r\n");
      out.write("	function memberInsert(){ // 회원등록\r\n");
      out.write("		alert(\"회원등록 호출 성공\");\r\n");
      out.write("		$(\"#d_member\").hide();\r\n");
      out.write("		$(\"#d_memberInsert\").show();\r\n");
      out.write("	}\r\n");
      out.write("	function memberDelete(){ // 회원삭제\r\n");
      out.write("		alert(\"회원삭제 호출 성공\");\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<script>\r\n");
      out.write("	// DOM트리가 다 그려진건가?\r\n");
      out.write("	// DOM트리가 다 그려졌을 때(준비되었을 때) - 메소드 이름도 ready !!\r\n");
      out.write("	$(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("		$(\"#d_member\").hide();\r\n");
      out.write("		$(\"#d_memberInsert\").hide();\r\n");
      out.write("\r\n");
      out.write("/* \r\n");
      out.write("		$(\"#dg_memberInsert\").datagrid({\r\n");
      out.write("			\r\n");
      out.write("		});\r\n");
      out.write("*/\r\n");
      out.write("	});\r\n");
      out.write("	</script>\r\n");
      out.write("	<div style=\"margin: 20px 0;\"></div>\r\n");
      out.write("	<div class=\"easyui-layout\" style=\"width: 1000px; height: 500px;\">\r\n");
      out.write("		<div data-options=\"region:'south',split:true\" style=\"height: 50px;\"></div>\r\n");
      out.write("	    <div data-options=\"region:'west',split:true\" title=\"KH정보교육원\"\r\n");
      out.write("	         style=\"width: 200px;\">\r\n");
      out.write("	                 \r\n");
      out.write("      		<div style=\"margin: 10px 0;\"></div> <!-- 여백 -->\r\n");
      out.write("     \r\n");

//	String s_name = (String)session.getAttribute("s_name");
	//s_name = "이순신";
	if(s_name ==null){

      out.write("\r\n");
      out.write("<!-- ######################## 로그인 영역 ################### -->      \r\n");
      out.write("      <div id=\"d_login\" align=\"center\">\r\n");
      out.write("      <div style=\"margin: 3px 0;\"></div>\r\n");
      out.write("      <input id=\"mem_id\" name =\"mem_id\" class=\"easyui-textbox\"/>\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("         $(\"#mem_id\").textbox({\r\n");
      out.write("            iconCls:'icon-man',\r\n");
      out.write("            iconAlign: 'right',\r\n");
      out.write("            prompt: '아이디'\r\n");
      out.write("         });\r\n");
      out.write("      </script>\r\n");
      out.write("      <div style=\"margin: 3px 0;\"></div>\r\n");
      out.write("      <input id=\"mem_pw\" name =\"mem_pw\" class=\"easyui-psswardbox\"/>\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("         $(\"#mem_pw\").passwordbox({\r\n");
      out.write("            iconAlign: 'right',\r\n");
      out.write("            prompt: '비밀번호'\r\n");
      out.write("         });\r\n");
      out.write("      </script>\r\n");
      out.write("      <div style=\"margin: 3px 0;\"></div>\r\n");
      out.write("         <a id=\"btn_login\" href=\"javascript:login()\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-man'\">\r\n");
      out.write("            로그인\r\n");
      out.write("         </a>\r\n");
      out.write("         <a id=\"btn_member\" href=\"javascript:memberShip()\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-add'\">\r\n");
      out.write("            회원가입\r\n");
      out.write("         </a>\r\n");
      out.write("      </div>   \r\n");
      out.write("<!-- ######################## 로그인 영역 끝 ##################### -->\r\n");
      out.write("\r\n");
      out.write("<!-- 안했네 -->\r\n");

	}else {

      out.write("\r\n");
      out.write("<!-- ######################## 로그아웃 영역 ################### -->   \r\n");
      out.write("      <div id=\"d_logout\" align=\"center\">\r\n");
      out.write("         <div id=\"d_ok\">");
      out.print(s_name);
      out.write("님 환영합니다.</div>\r\n");
      out.write("         <div style=\"margin:3px 0\"></div>\r\n");
      out.write("         <a id=\"btn_login\" href=\"javascript:logout()\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-cancel'\">\r\n");
      out.write("            로그아웃\r\n");
      out.write("         </a>\r\n");
      out.write("         <a id=\"btn_member\" href=\"javascript:memberUpdate()\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-edit'\">\r\n");
      out.write("            정보수정\r\n");
      out.write("         </a>\r\n");
      out.write("      </div>\r\n");
      out.write("<!-- ######################## 로그아웃 영역 끝 ##################### -->\r\n");

	} // end of else

      out.write("\r\n");
      out.write("<!-- ######################## 메뉴 영역 시작  ##################### -->\r\n");
      out.write("	  <div style=\"margin:20px 0;\"></div>\r\n");

if (mVO!=null){

      out.write("\r\n");
      out.write("	        <ul id=\"tre_gym\" class=\"easyui-tree\">\r\n");
      out.write("	            <li data-options=\"state:'closed'\">\r\n");
      out.write("	                <span>회원 관리</span>\r\n");
      out.write("	                <ul class =\"member\">\r\n");
      out.write("	                    <li>\r\n");
      out.write("	                        <a href=\"javascript:memberList()\">회원목록</a>\r\n");
      out.write("	                    </li>\r\n");
      out.write("	                    <li>\r\n");
      out.write("	                        <a href=\"javascript:memberInsert()\">회원등록</a>\r\n");
      out.write("	                    </li>\r\n");
      out.write("	                    <li>\r\n");
      out.write("	                        <a href=\"javascript:memberDelete()\">회원삭제</a>\r\n");
      out.write("	                    </li>\r\n");
      out.write("	                </ul>\r\n");
      out.write("	            </li>\r\n");
      out.write("	            \r\n");
      out.write("	             <li data-options=\"state:'closed'\">\r\n");
      out.write("	                <span>쪽지 관리</span>\r\n");
      out.write("	                <ul>\r\n");
      out.write("	                    <li>\r\n");
      out.write("	                        <span>받은 쪽지함</span>\r\n");
      out.write("	                    </li>\r\n");
      out.write("	                     <li>\r\n");
      out.write("	                        <span>보낸 쪽지함</span>\r\n");
      out.write("	                    </li>\r\n");
      out.write("	                </ul>\r\n");
      out.write("	            </li>\r\n");
      out.write("	            \r\n");
      out.write("	            <li data-options=\"state:'closed'\">\r\n");
      out.write("	                <span>게시판</span>\r\n");
      out.write("	                <ul>\r\n");
      out.write("	                    <li >\r\n");
      out.write("	                        <span>1:1 게시판</span>\r\n");
      out.write("	                    </li>\r\n");
      out.write("	                     <li>\r\n");
      out.write("	                        <span>공지게시판</span>\r\n");
      out.write("	                    </li>\r\n");
      out.write("	                </ul>\r\n");
      out.write("	            </li>\r\n");
      out.write("	            \r\n");
      out.write("	            \r\n");
      out.write("	        </ul>\r\n");

}

      out.write("\r\n");
      out.write("	    </div>\r\n");
      out.write("<!-- ######################## 메뉴 영역 끝 ##################### -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div data-options=\"region:'center',title:'&nbspTerrGYM System',iconCls:'icon-ok'\" style=\"padding: 2px;\">\r\n");
      out.write("        \r\n");
      out.write("        <!-- [[ 회원관리 {회원목록, 회원등록, 회원삭제} ]] -->\r\n");
      out.write("	        <div id = \"d_member\">\r\n");
      out.write("	        	<div style=\"margin: 5px 0;\"></div>\r\n");
      out.write("	        	&nbsp Home > 회원관리 > 회원목록\r\n");
      out.write("	        	<hr>\r\n");
      out.write("	        	<div style=\"margin: 20px 0;\"></div>\r\n");
      out.write("	    <!--[[ 조건검색 화면 ]]-->\r\n");
      out.write("	            <div style=\"margin: 20px 0;\">\r\n");
      out.write("			         아이디: <input id=\"mem_id\" name=\"mem_id\" class=\"easyui-textbox\" style=\"width:110px\">&nbsp&nbsp\r\n");
      out.write("			         이 름: <input id=\"mem_name\" name=\"mem_name\" class=\"easyui-textbox\" style=\"width:110px\">        \r\n");
      out.write("	            </div>\r\n");
      out.write("	    <!-- [[ 조회|입력|수정|삭제 버튼 ]] -->\r\n");
      out.write("	        	<div style=\"margin: 10px 0;\">\r\n");
      out.write("		        	<a id=\"btn\" href=\"javascript:memberList()\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\">조회</a>\r\n");
      out.write("		        	<a id=\"btn\" href=\"javascript:memberInsert()\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-add'\">입력</a>\r\n");
      out.write("		        	<a id=\"btn\" href=\"javascript:memberUpdate()\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-edit'\">수정</a>\r\n");
      out.write("		        	<a id=\"btn\" href=\"javascript:memberDelete()\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-remove'\">삭제</a>\r\n");
      out.write("	        	</div>\r\n");
      out.write("        <!-- [[ 회원목록 출력 ]] -->\r\n");
      out.write("	        	<table id=\"dg_member\" class=\"easyui-datagrid\" style=\"width:700px;height:250px\"\r\n");
      out.write("           		 		data-options=\"singleSelect:true,collapsible:true,method:'get'\">\r\n");
      out.write("			        <thead>\r\n");
      out.write("			            <tr>\r\n");
      out.write("			                <th data-options=\"field:'MEM_ID',width:80,align:'center'\">아이디</th>\r\n");
      out.write("			                <th data-options=\"field:'MEM_NAME',width:100,align:'center'\">이름</th>\r\n");
      out.write("			                <th data-options=\"field:'MEM_ADDRESS',width:300,align:'center'\">주소</th>\r\n");
      out.write("			                <th data-options=\"field:'BUTTON',width:80,align:'center'\">버튼</th>\r\n");
      out.write("			            </tr>\r\n");
      out.write("			        </thead>\r\n");
      out.write("			    </table>\r\n");
      out.write("	        </div>\r\n");
      out.write("        <!-- [[ 쪽지관리 {받은 쪽지함, 보낸 쪽지함} ]] -->\r\n");
      out.write("	        <div id = \"d_memberInsert\">\r\n");
      out.write("	        	<div style=\"margin: 5px 0;\"></div>\r\n");
      out.write("	        	&nbsp Home > 회원관리 > 회원등록\r\n");
      out.write("	        	<hr>\r\n");
      out.write("	        	<div style=\"margin: 20px 0;\"></div>\r\n");
      out.write("	        	<div id=\"dg_memberInsert\">회원등록 화면 보여주기</div>\r\n");
      out.write("	        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
