<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" isErrorPage="true" %>
<html>
 <head>
  <title>Ch11_2_2_1.jsp程式</title>
 </head>
 <body>
  <b><h2>建立JDBC資料庫連結</h2></b><hr />
  <%
   try
   {
    //載入JDBC驅動程式
    String sDriver="com.mysql.jdbc.Driver";
    Class.forName(sDriver);
    //建立Connection物件
    String sCon="jdbc:mysql://localhost:3306/school?user=root&password=12345";
    Connection dbCon=null;
    dbCon=DriverManager.getConnection(sCon);
    if(dbCon!=null)
     out.print("建立資料來源成功！！！<br>");
	 //建立JDBC的Statement物件
	Statement stmt=null;
	stmt=dbCon.createStatement();
	if(stmt!=null)
	 out.print("建立Statement物件成功！！！");
   }
   catch(SQLException e)
   {
    out.print(e);
   }
  %>
 </body>
</html>