<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_4_2access.jsp</title>
 </head>
 <body>
  <b><h2>�qAccess��Ʈw����ܸ�ƪ��O�����</h2></b><hr />
  <%
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   //Class.forName("mysql.jdbc.Driver"); �O�s����MySql��Ʈw
   Connection dbCon=null;
   dbCon=DriverManager.getConnection("jdbc:odbc:school_db");
   //dbCon=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","12345"); �O�s����MySQL��Ʈw
   if(dbCon!=null) 
    out.print("Connection�s�����\......<br>");
   Statement stmt=null;
   try
   {
	stmt=dbCon.createStatement();
	if(stmt!=null)
	 out.print("Statement����إߦ��\.....<br>");
	if(stmt.execute("SELECT * FROM students"))
	 out.print("��ƪ�s�����\.....<br>");
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