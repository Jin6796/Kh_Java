/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-08-11 05:34:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/common/easyui_common.jsp", Long.valueOf(1659485655057L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!-- \r\n");
      out.write("웹서비스에서 이용하는 프로토콜(http)은 비상태 프로토콜이다.\r\n");
      out.write("상태가 유지되지 않는다.\r\n");
      out.write("요청을 하면 연결을 하고 요청에 대한 응답이 나가고 나면 연결이 끊어진다.\r\n");
      out.write("어 현재 내가 요청한 페이지에 내용이 아직도 보이고 있는데... 왜 끊어졌다는 걸까?\r\n");
      out.write("html, css, js는 로컬 pc에 다운로드가 일어난다 - 브라우저\r\n");
      out.write("주소 - url\r\n");
      out.write("장바구니, 찜\r\n");
      out.write("* 쿠키 - 문자열 - 텍스트 - base2, base8, base16 ... - 메모리주소번지와 관계가 있다.\r\n");
      out.write("- 개인 pc에 저장됨. - 노출될 수 있다.\r\n");
      out.write("* 세션 - Object타입 - 서버컴. cash memory가 노출됨\r\n");
      out.write("쿠키와 세션 둘 다 저장소!\r\n");
      out.write("session.setAttribute(\"s_name\", \"김유신\");\r\n");
      out.write("// 요청이 유지되는 동안에만 사용가능함 - 시간설정은 불가함\r\n");
      out.write("request.setAttribute(\"s_name\", \"이성계\");\r\n");
      out.write("-->\r\n");

	String s_name = (String)session.getAttribute("s_name"); // session에 담긴 이름
//	s_name ="강감찬";

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");

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
      out.write("<script>\r\n");
      out.write("	function login(){\r\n");
      out.write("		location.href=\"loginAction.jsp\";\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	function logout(){\r\n");
      out.write("		location.href=\"logout.jsp\"; // 모델1 방식 >>> MVC패턴이 아님\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 세션값이 null일 때 -->\r\n");

	if(s_name == null ){

      out.write("\r\n");
      out.write("	<form id=\"f_login\">\r\n");
      out.write("		<input class=\"easyui-textbox\" label=\"아이디\" name=\"mem_id\" data-options=\"iconCls:'icon-man'\" style=\"width:200px\">\r\n");
      out.write("		<br>\r\n");
      out.write("		<input class=\"easyui-textbox\" label=\"비밀번호\" name=\"mem_pw\" data-options=\"iconCls:'icon-lock'\" style=\"width:200px\">\r\n");
      out.write("		<a id=\"btn_login\" href=\"javascript:login()\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\">로그인</a>\r\n");
      out.write("	</form>\r\n");

	} // end of if
	else{

      out.write("\r\n");
      out.write("<!-- 세션값이 존재할 때 -->\r\n");
      out.write("	");
      out.print(s_name );
      out.write("님 환영합니다.\r\n");
      out.write("	<a id=\"btn_logout\" href=\"javascript:logout()\" class=\"easyui-linkbutton\">로그아웃</a>\r\n");

	} // end of else

      out.write("\r\n");
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
