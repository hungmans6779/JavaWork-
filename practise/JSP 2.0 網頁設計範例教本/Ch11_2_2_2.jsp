<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_2_2_2.jsp�{��</title>
 </head>
 <body>
  <b><h2>�إ�JDBC��Ʈw�s��</h2></b><hr />
  <%
   String sDriver="com.mysql.jdbc.Driver";
   Class.forName(sDriver);
   //�إ�Connection����
   String sCon="jdbc:mysql://localhost:3306/school";
   Connection dbCon=null;
   dbCon=DriverManager.getConnection(sCon,"root","12345");
   if(dbCon!=null)
    out.print("��Ʈw�s���إߦ��\�I�I�I<br>");
   //�إ�Statement����
   try
   {
	Statement stmt=null;
	stmt=dbCon.createStatement();
	if(stmt!=null)
	 out.print("Statement����إߦ��\�I�I�I<br>");
   }
   catch(SQLException e)
   {
	out.print(e);   
   }
  %>
 </body>
</html>