<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_4_1_1mysql.jsp程式</title>
 </head>
 <body>
  <b><h2>從MySQL取得資料表的欄位值</h2></b><hr />
  <%
   Class.forName("com.mysql.jdbc.Driver");
   //載入Access的驅動程式sun.jdbc.odbc.JdbcOdbcDriver
   Connection dbCon=null;
   dbCon=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","12345");
   //從Access取得連結是jdbc:odbc:school_db
   if(dbCon!=null)
    out.print("資料庫連結成功.....<br>");
   Statement stmt=null;
   try
   {
	stmt=dbCon.createStatement();
	if(stmt!=null)
	 out.print("Statement物件建立成功.....<br>");
   }
   catch(SQLException e)
   {
	out.print(e);   
   }
   if(stmt.execute("SELECT * FROM students"))
   {
	out.print("資料表欄位取得成功.....<hr>");
	ResultSet rs=stmt.getResultSet();
	ResultSetMetaData md=rs.getMetaData();
	int count=md.getColumnCount();
	out.print("資料表欄位："+count+"欄<br>");
	for(int i=1;i<=count;i++)
	{
	 out.print(i+"名稱："+md.getColumnLabel(i)+" 尺寸："+md.getColumnDisplaySize(i)+" 類型："+md.getColumnTypeName(i)+"<br>");	
	}
	   
   }
  %>
 </body>
</html>