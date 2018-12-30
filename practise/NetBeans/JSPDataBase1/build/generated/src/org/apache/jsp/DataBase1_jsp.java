package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class DataBase1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    Connection dbCon=null;
    Statement stmt=null;
    ResultSet rs=null;
    ResultSetMetaData rsmd=null;
    
    int pageSize=2; //記錄目前每頁所要顯示的資料筆數
    int totalRow=0; //記錄目前資料的總比數
    int totalPage=0; //記錄目前的資料的總頁數
    int count=1; //目前資料是在第?頁
    
    
    public void jspInit()
    {
     try
     {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      String url = "jdbc:sqlserver://localhost:1433;databaseName=MyDB;user=sa;password=123;";
     dbCon = DriverManager.getConnection(url);
     stmt=dbCon.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
     rs=stmt.executeQuery("select * from student");
     rsmd=rs.getMetaData();
     rs.last();
     totalRow=rs.getRow();
     totalPage=totalRow%pageSize==0?totalRow/pageSize:totalRow/pageSize+1;
     rs.first();
    
   
    }
     catch(Exception e)
     {
       e.printStackTrace();
     }   
     
    }
    public void jspDestory()
    {
     try
     {
      rs.close();
      stmt.close();
      dbCon.close();
     }
     catch(SQLException e)
     {
       e.printStackTrace();
     }    
    }
   
   
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>DataBase1.jsp</title>\n");
      out.write("    </head>\n");
      out.write("   ");
      out.write("\n");
      out.write("    <body>\n");
      out.write("     ");

       out.print("目前是在"+count+" / "+totalPage+"頁<hr>"); 
        
        out.println("<table border=1 align=center>");
        out.print("<tr bgcolor=yellow>");
        for(int i=1;i<=rsmd.getColumnCount();out.print("<td>"+rsmd.getColumnLabel(i)),i++);
        out.print("</tr>");
        rs.first();
        while(rs.next())
        {
         out.print("<tr>");   
         for(int i=1;i<=rsmd.getColumnCount(); out.print("<td>"+rs.getString(i)+"</td>"),i++);
         out.print("</tr>");    
        }
        out.print("</table>");
     
      out.write("\n");
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
