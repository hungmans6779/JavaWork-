<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_4_1mysql.jsp程式</title>
 </head>
 <body>
  <b><h2>從MySQL資料庫取得資料表的資訊</h2></b><hr />
  <%
   String sDriver="com.mysql.jdbc.Driver";
   Class.forName(sDriver);
   //建立Connection連線
   String sCon="jdbc:mysql://localhost:3306/school";
   Connection dbCon=null;
   dbCon=DriverManager.getConnection(sCon,"root","12345");
   if(dbCon!=null)
    out.print("連線建立成功.....<br>");
   //建立Statement物件
   Statement stmt=null;
   try
   {
    stmt=dbCon.createStatement();
	out.print("Statement物件建立成功.....<br>");
   }
   catch(SQLException e)
   {
	out.print(e);   
   }
   if(stmt.execute("SELECT * FROM students"))
   {
	 out.print("資料表連結成功.....<br>"); 
	 ResultSet rs=stmt.getResultSet();
	 ResultSetMetaData md=rs.getMetaData();
	 int count=0;
	 count=md.getColumnCount();
	 out.print("資料表欄位共："+count+"欄<br>");
	 for(int i=1;i<=count;i++)
	 {
	  out.print(i+"名稱："+md.getColumnLabel(i)+" 尺寸："+md.getColumnDisplaySize(i)+" 類型："+md.getColumnTypeName(i)+"<br>");	 
	 }
   }
   else
   {
	 out.print("資料表連結失敗.....<br>");   
   }
   stmt.close();
   dbCon.close();
  %>
 </body>
</html>