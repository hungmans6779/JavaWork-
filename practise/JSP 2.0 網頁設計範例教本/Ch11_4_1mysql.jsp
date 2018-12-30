<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_4_1mysql.jsp�{��</title>
 </head>
 <body>
  <b><h2>�qMySQL��Ʈw���o��ƪ���T</h2></b><hr />
  <%
   String sDriver="com.mysql.jdbc.Driver";
   Class.forName(sDriver);
   //�إ�Connection�s�u
   String sCon="jdbc:mysql://localhost:3306/school";
   Connection dbCon=null;
   dbCon=DriverManager.getConnection(sCon,"root","12345");
   if(dbCon!=null)
    out.print("�s�u�إߦ��\.....<br>");
   //�إ�Statement����
   Statement stmt=null;
   try
   {
    stmt=dbCon.createStatement();
	out.print("Statement����إߦ��\.....<br>");
   }
   catch(SQLException e)
   {
	out.print(e);   
   }
   if(stmt.execute("SELECT * FROM students"))
   {
	 out.print("��ƪ�s�����\.....<br>"); 
	 ResultSet rs=stmt.getResultSet();
	 ResultSetMetaData md=rs.getMetaData();
	 int count=0;
	 count=md.getColumnCount();
	 out.print("��ƪ����@�G"+count+"��<br>");
	 for(int i=1;i<=count;i++)
	 {
	  out.print(i+"�W�١G"+md.getColumnLabel(i)+" �ؤo�G"+md.getColumnDisplaySize(i)+" �����G"+md.getColumnTypeName(i)+"<br>");	 
	 }
   }
   else
   {
	 out.print("��ƪ�s������.....<br>");   
   }
   stmt.close();
   dbCon.close();
  %>
 </body>
</html>