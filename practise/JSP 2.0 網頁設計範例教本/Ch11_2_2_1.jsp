<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" isErrorPage="true" %>
<html>
 <head>
  <title>Ch11_2_2_1.jsp�{��</title>
 </head>
 <body>
  <b><h2>�إ�JDBC��Ʈw�s��</h2></b><hr />
  <%
   try
   {
    //���JJDBC�X�ʵ{��
    String sDriver="com.mysql.jdbc.Driver";
    Class.forName(sDriver);
    //�إ�Connection����
    String sCon="jdbc:mysql://localhost:3306/school?user=root&password=12345";
    Connection dbCon=null;
    dbCon=DriverManager.getConnection(sCon);
    if(dbCon!=null)
     out.print("�إ߸�ƨӷ����\�I�I�I<br>");
	 //�إ�JDBC��Statement����
	Statement stmt=null;
	stmt=dbCon.createStatement();
	if(stmt!=null)
	 out.print("�إ�Statement���󦨥\�I�I�I");
   }
   catch(SQLException e)
   {
    out.print(e);
   }
  %>
 </body>
</html>