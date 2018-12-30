<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_2_2.jsp程式</title>
 </head>
 <body>
  <b><h2>建立JDBC資料庫連結</h2></b><hr />
  <%
   try
   {
	String sDriver="com.mysql.jdbc.Driver";
	Class.forName(sDriver);
	String sCon="jdbc:mysql://localhost:3306/school?user=root&password=67790420";
	Connection dbCon=DriverManager.getConnection(sCon);
	if(dbCon!=null)
	 out.print("建立資料來源連結成功！<br>");
	Statement stmt=dbCon.createStatement();
	if(stmt!=null)
	 out.print("建立Statement物件成功！！！");
   }
   catch(SQLException e)
   {
	out.print(e.getMessage());   
   }
  %>
 </body>
</html>