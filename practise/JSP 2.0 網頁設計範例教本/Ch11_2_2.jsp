<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_2_2.jsp�{��</title>
 </head>
 <body>
  <b><h2>�إ�JDBC��Ʈw�s��</h2></b><hr />
  <%
   try
   {
	String sDriver="com.mysql.jdbc.Driver";
	Class.forName(sDriver);
	String sCon="jdbc:mysql://localhost:3306/school?user=root&password=67790420";
	Connection dbCon=DriverManager.getConnection(sCon);
	if(dbCon!=null)
	 out.print("�إ߸�ƨӷ��s�����\�I<br>");
	Statement stmt=dbCon.createStatement();
	if(stmt!=null)
	 out.print("�إ�Statement���󦨥\�I�I�I");
   }
   catch(SQLException e)
   {
	out.print(e.getMessage());   
   }
  %>
 </body>
</html>