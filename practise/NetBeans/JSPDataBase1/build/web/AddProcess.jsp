<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.sql.*" %>
<%@ page pageEncoding="UTF-8" %>
<html>
 <head>
  <title>AddProcess.jsp</title>
 </head>
 <body>
 <%
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
 
  
   
 %>

 </body>
</html>
