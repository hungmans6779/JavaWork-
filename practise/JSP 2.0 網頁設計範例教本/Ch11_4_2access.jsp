<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_4_2access.jsp</title>
 </head>
 <body>
  <b><h2>從Access資料庫內顯示資料表的記錄資料</h2></b><hr />
  <%
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   //Class.forName("mysql.jdbc.Driver"); 是連結到MySql資料庫
   Connection dbCon=null;
   dbCon=DriverManager.getConnection("jdbc:odbc:school_db");
   //dbCon=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","12345"); 是連結到MySQL資料庫
   if(dbCon!=null) 
    out.print("Connection連結成功......<br>");
   Statement stmt=null;
   try
   {
	stmt=dbCon.createStatement();
	if(stmt!=null)
	 out.print("Statement物件建立成功.....<br>");
	if(stmt.execute("SELECT * FROM students"))
	 out.print("資料表連結成功.....<br>");
   }
   catch(SQLException e)
   {
	out.print(e);   
   }
   ResultSet rs=stmt.executeQuery("SELECT * FROM students");
   out.print("<table border>"); 
   while(rs.next())
   {
  
	out.print("<tr>");
	/*
	out.print("<td>"+rs.getString("stdno")+"</td>");
	out.print("<td>"+rs.getString("name")+"</tr>");
	out.print("<td>"+rs.getString("address")+"</td>");
	out.print("<td>"+rs.getDate("birthday")+"</td>");
	out.print("<td>"+rs.getInt("totalCredit")+"</td>");
	*/
	out.print("<td>"+rs.getString(1)+"</td>");
	out.print("<td>"+rs.getString(2)+"</tr>");
	out.print("<td>"+rs.getString(3)+"</td>");
	out.print("<td>"+rs.getDate(4)+"</td>");
	out.print("<td>"+rs.getInt(5)+"</td>");
	out.print("</tr>");
   }
   out.print("</table>");
   rs.close();
   stmt.close();
   dbCon.close();
  %>
  
 </body>
</html>