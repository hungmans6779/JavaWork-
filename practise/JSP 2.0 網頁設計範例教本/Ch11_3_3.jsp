<%@ page contentType="text/html;charset=MS950" %>
<%@page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_3_3.jsp�{��</title>
 </head>
 <body>
 <b><h2>�إ�JDBC-ODBC��Ʈw�s��</h2></b><hr>
 <%
  //���J�X�ʵ{��
  String sDriver="sun.jdbc.odbc.JdbcOdbcDriver";
  Class.forName(sDriver);
  //�إ�Connection����
  String sCon="jdbc:odbc:school_db";
  Connection dbCon=null;
  dbCon=DriverManager.getConnection(sCon);
  if(dbCon!=null)
   out.print("�إ߸�ƨӷ��s�����\�I�I�I<br>");
  try
  {
   Statement stmt=null;
   stmt=dbCon.createStatement();
   if(stmt!=null)
    out.print("�إ�Statement���󦨥\�I�I�I<br>");
  }
  catch(SQLException e)
  {
   out.print(e);	  
  }
 %>
 
 </body>
</html>