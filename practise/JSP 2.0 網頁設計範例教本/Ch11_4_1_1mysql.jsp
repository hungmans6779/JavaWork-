<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_4_1_1mysql.jsp�{��</title>
 </head>
 <body>
  <b><h2>�qMySQL���o��ƪ�����</h2></b><hr />
  <%
   Class.forName("com.mysql.jdbc.Driver");
   //���JAccess���X�ʵ{��sun.jdbc.odbc.JdbcOdbcDriver
   Connection dbCon=null;
   dbCon=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","12345");
   //�qAccess���o�s���Ojdbc:odbc:school_db
   if(dbCon!=null)
    out.print("��Ʈw�s�����\.....<br>");
   Statement stmt=null;
   try
   {
	stmt=dbCon.createStatement();
	if(stmt!=null)
	 out.print("Statement����إߦ��\.....<br>");
   }
   catch(SQLException e)
   {
	out.print(e);   
   }
   if(stmt.execute("SELECT * FROM students"))
   {
	out.print("��ƪ������o���\.....<hr>");
	ResultSet rs=stmt.getResultSet();
	ResultSetMetaData md=rs.getMetaData();
	int count=md.getColumnCount();
	out.print("��ƪ����G"+count+"��<br>");
	for(int i=1;i<=count;i++)
	{
	 out.print(i+"�W�١G"+md.getColumnLabel(i)+" �ؤo�G"+md.getColumnDisplaySize(i)+" �����G"+md.getColumnTypeName(i)+"<br>");	
	}
	   
   }
  %>
 </body>
</html>