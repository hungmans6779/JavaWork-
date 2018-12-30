<%@page contentType="text/html;charset=MS950" %>
<%@page import="java.sql.*" import="java.util.*" %>
<html>
 <head>
  <title>Ch11_4_2_1access.jsp</title>
 </head>
 <body>
  <b><h2>從Access資料庫內取得資料表的記錄值</h2></b><hr />
  <%!
   String typeName[]={"TINYINT","INTEGER","BIGINT","SMALLINT","REAL","DOUBLE","BIT","VARCHAR","DATE","OTHER"};
  %>
  <%
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   Connection dbCon=null;
   dbCon=DriverManager.getConnection("jdbc:odbc:school_db");
   if(dbCon!=null)
    out.print("Connection物件建立成功.....<br>");
   Statement stmt=null;
   try
   {
	stmt=dbCon.createStatement();
	if(stmt!=null)
	 out.print("Statement物件建立成功.....<br>");
	if(stmt.execute("SELECT * FROM students"))
	 out.print("MySQL資料表連結成功.....<hr>");
   }
   catch(SQLException e)
   {
	out.print(e);   
   }
   ResultSet rs1=stmt.getResultSet();
   ResultSetMetaData md=rs1.getMetaData();
   int count=md.getColumnCount();
   ResultSet rs2=stmt.executeQuery("SELECT * FROM students");
   out.print("<table border=1>");
   while(rs2.next())
   {
	out.print("<tr>");   
	out.print("<td>"+rs2.getString(1)+"</td>");
	out.print("<td>"+rs2.getString(2)+"</td>");
	out.print("<td>"+rs2.getString(3)+"</td>");
	out.print("<td>"+rs2.getDate(4)+"</td>");
	out.print("<td>"+rs2.getInt(5)+"</td>");
	out.print("</tr>");   
   }
   out.print("</table>");
  
  %>
 </body>
</html>