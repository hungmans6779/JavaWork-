package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      javaBean.LogonFormBean LogonForm = null;
      synchronized (_jspx_page_context) {
        LogonForm = (javaBean.LogonFormBean) _jspx_page_context.getAttribute("LogonForm", PageContext.PAGE_SCOPE);
        if (LogonForm == null){
          LogonForm = new javaBean.LogonFormBean();
          _jspx_page_context.setAttribute("LogonForm", LogonForm, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("LogonForm"), request);
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("            <font size=3 color=blue>登入畫面</font><br>\n");
      out.write("            <form name=\"form1\" action=\"login.jsp\" method=\"post\" >\n");
      out.write("                <table border=1>            \n");
      out.write("                    <tr>\n");
      out.write("                        <td>使用者名稱：</td>\n");
      out.write("                        <td> <input type=\"text\" name=\"name\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>使用者密碼：</td>\n");
      out.write("                        <td><input type=\"text\" name=\"password\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td colspan=\"2\" align=center><input type=\"submit\" value=\"登入\" /></td></tr>\n");
      out.write("                </table>\n");
      out.write("            </form>   \n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
