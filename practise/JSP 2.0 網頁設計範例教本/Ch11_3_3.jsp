<%@ page contentType="text/html;charset=MS950" %>
<%@page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_3_3.jsp程式</title>
 </head>
 <body>
 <b><h2>建立JDBC-ODBC資料庫連結</h2></b><hr>
 <%
  //載入驅動程式
  String sDriver="sun.jdbc.odbc.JdbcOdbcDriver";
  Class.forName(sDriver);
  //建立Connection物件
  String sCon="jdbc:odbc:school_db";
  Connection dbCon=null;
  dbCon=DriverManager.getConnection(sCon);
  if(dbCon!=null)
   out.print("建立資料來源連結成功！！！<br>");
  try
  {
   Statement stmt=null;
   stmt=dbCon.createStatement();
   if(stmt!=null)
    out.print("建立Statement物件成功！！！<br>");
  }
  catch(SQLException e)
  {
   out.print(e);	  
  }
 %>
 
 </body>
</html>