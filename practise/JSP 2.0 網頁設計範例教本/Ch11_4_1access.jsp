<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_4_1access.jsp�{��</title>
 </head>
 <body>
  <b><h2>�s��Access��Ʈw���o��ƪ���T</h2></b><hr />
  <%
   //���J�X�ʵ{��
   String sDriver="sun.jdbc.odbc.JdbcOdbcDriver";
   Class.forName(sDriver);
   //�إ�Connection����
   String sCon="jdbc:odbc:school_db";
   Connection dbCon=null;
   dbCon=DriverManager.getConnection(sCon);
   
   if(dbCon!=null)
    out.print("���\�إ߸�Ʈw�s���I�I�I<br>");
   Statement stmt=null;
   try
   {
	//�إ�Statement����   
	stmt=dbCon.createStatement();
	if(stmt!=null)
	 out.print("���\�إ�Statement����I�I�I<br>");
   }
   catch(SQLException e)
   {
	out.print(e);   
   }
   if(stmt.execute("SELECT * FROM students"))
   {
	out.print("��ƪ������o���\<br>");  
	ResultSet rs=stmt.getResultSet(); //���oResultSet����
	ResultSetMetaData md=rs.getMetaData(); //���oResultSetMetaData����
	String label=null,type=null;
	int size=0,count=0;
	count=md.getColumnCount();
	out.print("��ƪ����@:"+count+"��<br>");
	for(int i=1;i<=count;i++)
	{
	 out.print(i+"�W�١G"+md.getColumnLabel(i)+" �ؤo�G"+md.getColumnDisplaySize(i)+" �����G"+md.getColumnTypeName(i)+"<br>");
	}
   }
   else
   {
	out.print("��ƪ�L�k���o�I�I�I <br>");   
   }
   stmt.close();
   dbCon.close();

  %>
 </body>
</html>