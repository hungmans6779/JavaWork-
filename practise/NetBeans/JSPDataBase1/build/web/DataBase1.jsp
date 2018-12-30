<%@page contentType="text/html;charset=UTF-8"%>
<%@page  import="java.sql.*" %>

<html>
    <head>
        <title>DataBase1.jsp</title>
    </head>
   <%!
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
   
   %>
    <body>
     <%
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
     %>
    </body>
</html>
