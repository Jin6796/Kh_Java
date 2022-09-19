/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-08-24 03:29:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.onLineTest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class q3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write('\r');
      out.write('\n');

	String test2 = request.getParameter("htest2");
	out.print("2번문제 답안지: " + test2);
	// 쿠키 생성하기 - insert here
	Cookie ctest2 = new Cookie("test2", test2);
	ctest2.setPath("/onLineTest");
	ctest2.setMaxAge(30*60);
	response.addCookie(ctest2);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>문제 3</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	function test(pcb) {\r\n");
      out.write("		console.log(pcb); // pcb는 checkbox에 대한 index 값이다. 그래서 0부터.. (배열)\r\n");
      out.write("		for(let i=0; i<document.f_test1.cb.length; i++){\r\n");
      out.write("			if(pcb==i){\r\n");
      out.write("				document.f_test1.cb[i].checked = 1;\r\n");
      out.write("			} else {\r\n");
      out.write("				document.f_test1.cb[i].checked = 0;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("	function prev(){\r\n");
      out.write("		location.href = \"q2.jsp\";\r\n");
      out.write("	}\r\n");
      out.write("	function next() {\r\n");
      out.write("		console.log('next');\r\n");
      out.write("		let temp = 1;\r\n");
      out.write("		for(let i = 0; i<document.f_test1.cb.length; i++){\r\n");
      out.write("			if(document.f_test1.cb[i].checked == 1){\r\n");
      out.write("				document.f_test1.htest3.value = temp;\r\n");
      out.write("			}else{\r\n");
      out.write("				temp = temp + 1;\r\n");
      out.write("			}\r\n");
      out.write("		}/// end of for\r\n");
      out.write("		document.f_test1.submit();\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<form name=\"f_test1\" method=\"get\" action=\"q4.jsp\">\r\n");
      out.write("		<input type=\"hidden\" name=\"htest3\">\r\n");
      out.write("		문제3. 다음 중 DCL구문으로 맞는 것을 고르시오.<br>\r\n");
      out.write("		<input type=\"checkbox\" name=\"cb\" onChange=\"test(0)\">grant<br>\r\n");
      out.write("		<input type=\"checkbox\" name=\"cb\" onChange=\"test(1)\">drop<br>\r\n");
      out.write("		<input type=\"checkbox\" name=\"cb\" onChange=\"test(2)\">alter<br>\r\n");
      out.write("		<input type=\"checkbox\" name=\"cb\" onChange=\"test(3)\">delete<br>\r\n");
      out.write("		<br>\r\n");
      out.write("		<input type=\"button\" value=\"이전문제\" onClick=\"prev()\">\r\n");
      out.write("		<input type=\"button\" value=\"다음문제\" onClick=\"next()\">\r\n");
      out.write("	</form>\r\n");
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
