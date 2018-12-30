<%@page contentType="text/html;charset=MS950" %>
<%@page import="java.sql.*" import="java.util.*" %>
<html>
 <head>
  <title>Ch11_4_2_2access.jsp</title>
 </head>
 <body>
  <b><h2>從Access資料庫內取得資料表的記錄值</h2></b><hr />
  <%!
   String typeName[]={"TINYINT","INTEGER","BIGINT","SMALLINT","REAL","DOUBLE","BIT","VARCHAR","DATE","OTHER"};
  %>
  <%
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   Connection dbCon=null;
   dbCon=DriverManager.getConnection("jdbc:odbc:school_db");
   if(dbCon!=null)
    out.print("Connection物件建立成功.....<br>");
   Statement stmt=null;
   try
   {
	stmt=dbCon.createStatement();
	if(stmt!=null)
	 out.print("Statement物件建立成功.....<br>");
	if(stmt.execute("SELECT * FROM students"))
	 out.print("MySQL資料表連結成功.....<hr>");
   }
   catch(SQLException e)
   {
	out.print(e);   
   }
  ResultSet rs=stmt.executeQuery("SELECT * FROM students");
   
   
   ResultSet rs1=stmt.getResultSet();
   ResultSetMetaData md=rs1.getMetaData();
   int count=md.getColumnCount();
	
   HashMap map=new HashMap();
    //{"TINYINT","INTEGER","BIGINT","SMALLINT","REAL","DOUBLE","BIT","VARCHAR","DATE","OTHER"};
   for(int i=0;i<typeName.length;i++)
   {  map.put(typeName[i],i);  }
   
   out.print("<table border=1>");
   while(rs.next())
   {
	out.print("<tr>");   
    for(int i=1;i<=count;i++)
    {
     String typeName=md.getColumnTypeName(i);
	 int type=(Integer)map.get(typeName);
	 switch(type)
	 {
	  case 0: out.print("<td>"+rs.getByte(i)+"</td>"); break;	
	  case 1: out.print("<td>"+rs.getInt(i)+"</td>");break;
	  case 2: out.print("<td>"+rs.getLong(i)+"</td>"); break;
	  case 3: out.print("<td>"+rs.getShort(i)+"</td>"); break;
	  case 4: out.print("<td>"+rs.getFloat(i)+"</td>"); break;
	  case 5: out.print("<td>"+rs.getDouble(i)+"</td>"); break;
	  case 6: out.print("<td>"+rs.getBoolean(i)+"</td>"); break;
	  case 7: out.print("<td>"+rs.getString(i)+"</td>"); break;
	  case 8: out.print("<td>"+rs.getDate(i)+"</td>"); break;
	  case 9: out.print("<td>"+rs.getObject(i)+"</td>"); break;
	  default: out.print("<td>未定義</td>"); break;
	 }   
    }
	out.print("</tr>");
   }
   out.print("</table>");
   rs.close();
   rs1.close();
   stmt.close();
   dbCon.close();
  %>
 </body>
</html>