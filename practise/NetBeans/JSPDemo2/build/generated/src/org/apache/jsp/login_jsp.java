package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javaBean.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write('\n');
      out.write('\n');
  request.setCharacterEncoding("UTF-8");    
      out.write('\n');

 String e1="";
 String e2="";
if(request.getParameter("sendData")!=null) {
    if(LogonForm.validate()) {
        DBUtil db=DBUtil.getInstance();
        UserBean user=db.getUser(LogonForm.getName());
        if(user==null) {
            LogonForm.setMsg("user","User not Found");
        } else {
            if(!user.validatePassword(LogonForm.getPassword())) {
                LogonForm.setMsg("password","Password is error！！！");
            } else {
                response.sendRedirect("loginSuccess.jsp");
            }
            
        }
        
    }
    else
        {
         response.sendRedirect("login.jsp");
        /*
         e1=LogonForm.getMsg("user");
   
         e2=LogonForm.getMsg("password");
         out.println(e1+"<br>");
          out.println(e2+"<br>");
          */
        }
        
    
   

    //response.sendRedirect("login.jsp");
} else {

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <center>\n");
      out.write("            <font size=3 color=blue>登入畫面</font><br>\n");
      out.write("            <form name=\"form1\" action=\"login.jsp\" method=\"post\" >\n");
      out.write("                <table border=1>            \n");
      out.write("                    <tr>\n");
      out.write("                        <td>使用者名稱：</td>\n");
      out.write("                        <td> <input type=\"text\" name=\"name\" value=\"");
      out.print( LogonForm.getName() );
      out.write("\" />");
      out.print( LogonForm.getMsg("user") );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>使用者密碼：</td>\n");
      out.write("                        <td><input type=\"text\" name=\"password\" value=\"");
      out.print( LogonForm.getPassword() );
      out.write("\" />");
      out.print( LogonForm.getMsg("password") );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td colspan=\"2\" align=center><input type=\"submit\" value=\"登入\" name=\"sendData\" /></td></tr>\n");
      out.write("                </table>\n");
      out.write("            </form>   \n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");

}

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
