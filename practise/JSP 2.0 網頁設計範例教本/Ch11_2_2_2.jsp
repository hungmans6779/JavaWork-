<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_2_2_2.jsp程式</title>
 </head>
 <body>
  <b><h2>建立JDBC資料庫連結</h2></b><hr />
  <%
   String sDriver="com.mysql.jdbc.Driver";
   Class.forName(sDriver);
   //建立Connection物件
   String sCon="jdbc:mysql://localhost:3306/school";
   Connection dbCon=null;
   dbCon=DriverManager.getConnection(sCon,"root","12345");
   if(dbCon!=null)
    out.print("資料庫連結建立成功！！！<br>");
   //建立Statement物件
   try
   {
	Statement stmt=null;
	stmt=dbCon.createStatement();
	if(stmt!=null)
	 out.print("Statement物件建立成功！！！<br>");
   }
   catch(SQLException e)
   {
	out.print(e);   
   }
  %>
 </body>
</html>