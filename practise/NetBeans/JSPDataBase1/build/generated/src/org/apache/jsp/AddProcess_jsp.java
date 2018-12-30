package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class AddProcess_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("  <title>AddProcess.jsp</title>\r\n");
      out.write(" </head>\r\n");
      out.write(" <body>\r\n");
      out.write(" ");

  request.setCharacterEncoding("UTF-8");
  
   String studno=request.getParameter("studno");
   String name=request.getParameter("name");
   String examno=request.getParameter("examno");
   String chi=request.getParameter("chi");
   String eng=request.getParameter("eng");
   String math=request.getParameter("math");
   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   Connection dbCon=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=MyDB;user=sa;password=123;");
   Statement stmt=dbCon.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
   String sqlStr="insert into score values('"+studno+"','"+name+"','"+examno+"','"+chi+"','"+eng+"','"+math+"')";
   int rec=stmt.executeUpdate(sqlStr);
   out.print("新增 "+rec+" 筆記錄成功！<br>");
 
  
   
 
      out.write("\r\n");
      out.write("\r\n");
      out.write(" </body>\r\n");
      out.write("</html>\r\n");
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
