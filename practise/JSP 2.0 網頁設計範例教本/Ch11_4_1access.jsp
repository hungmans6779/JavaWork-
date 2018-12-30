<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_4_1access.jsp程式</title>
 </head>
 <body>
  <b><h2>連結Access資料庫取得資料表的資訊</h2></b><hr />
  <%
   //載入驅動程式
   String sDriver="sun.jdbc.odbc.JdbcOdbcDriver";
   Class.forName(sDriver);
   //建立Connection物件
   String sCon="jdbc:odbc:school_db";
   Connection dbCon=null;
   dbCon=DriverManager.getConnection(sCon);
   
   if(dbCon!=null)
    out.print("成功建立資料庫連結！！！<br>");
   Statement stmt=null;
   try
   {
	//建立Statement物件   
	stmt=dbCon.createStatement();
	if(stmt!=null)
	 out.print("成功建立Statement物件！！！<br>");
   }
   catch(SQLException e)
   {
	out.print(e);   
   }
   if(stmt.execute("SELECT * FROM students"))
   {
	out.print("資料表欄位取得成功<br>");  
	ResultSet rs=stmt.getResultSet(); //取得ResultSet物件
	ResultSetMetaData md=rs.getMetaData(); //取得ResultSetMetaData物件
	String label=null,type=null;
	int size=0,count=0;
	count=md.getColumnCount();
	out.print("資料表欄位共:"+count+"欄<br>");
	for(int i=1;i<=count;i++)
	{
	 out.print(i+"名稱："+md.getColumnLabel(i)+" 尺寸："+md.getColumnDisplaySize(i)+" 類型："+md.getColumnTypeName(i)+"<br>");
	}
   }
   else
   {
	out.print("資料表無法取得！！！ <br>");   
   }
   stmt.close();
   dbCon.close();

  %>
 </body>
</html>