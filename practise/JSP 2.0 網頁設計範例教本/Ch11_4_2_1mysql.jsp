<%@page contentType="text/html;charset=MS950" %>
<%@page import="java.sql.*" import="java.util.*" %>
<html>
 <head>
  <title>Ch11_4_2_1mysql.jsp</title>
 </head>
 <body>
  <b><h2>從MySQL資料庫內取得資料表的記錄值</h2></b><hr />
  <%!
   String typeName[]={"TINYINT","INTEGER","BIGINT","SMALLINT","REAL","DOUBLE","BIT","VARCHAR","DATE","OTHER"};
  %>
  <%!
   String toUnicode(String s) { 
   if (s == null || s.length() == 0) 
   { 
    return null;  // 空字串
   } 
   byte[] buffer = new byte[s.length()];
   int i, j;
   // 字元轉換的迴圈
   for (i = 0, j = 0; i < s.length(); i++)
   { 
    if ( s.charAt(i) >= 0x100 ) 
	{ 
     char c = (char) s.charAt(i); 
     byte[] buf = (""+c).getBytes(); 
     buffer[j++] = (byte) buf[0]; 
     buffer[j++] = (byte) buf[1]; 
    } 
    else 
     buffer[j++] = (byte) s.charAt(i); 
    } 
    return new String(buffer,0,j); 
   }
  %>
  <%
    Class.forName("com.mysql.jdbc.Driver");
    Connection dbCon=null;
    String sCon = "jdbc:mysql://localhost:3306/school?user=root&password=12345&useUnicode=true";
    dbCon=DriverManager.getConnection(sCon); //是連結到MySQL資料庫
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
    HashMap<String,Integer> map=new HashMap<String,Integer>();
    for(int i=0;i<typeName.length;i++)
    {  map.put(typeName[i],i);  }
   
   out.print("<table border=1>");
   

   while(rs.next())
   {
	out.print("<tr>");   
    for(int i=1;i<=count;i++)
    {
     String Name=md.getColumnTypeName(i);
	 int type=(Integer)map.get(Name);
	 switch(type)
	 {
	  case 0: out.print("<td>"+rs.getByte(i)+"</td>"); break;	
	  case 1: out.print("<td>"+rs.getInt(i)+"</td>");break;
	  case 2: out.print("<td>"+rs.getLong(i)+"</td>"); break;
	  case 3: out.print("<td>"+rs.getShort(i)+"</td>"); break;
	  case 4: out.print("<td>"+rs.getFloat(i)+"</td>"); break;
	  case 5: out.print("<td>"+rs.getDouble(i)+"</td>"); break;
	  case 6: out.print("<td>"+rs.getBoolean(i)+"</td>"); break;
	  case 7: out.print("<td>"+toUnicode(rs.getString(i))+"</td>"); break;
	  case 8: out.print("<td>"+rs.getDate(i)+"</td>"); break;
	  case 9: out.print("<td>"+rs.getObject(i)+"</td>"); break;
	  default: out.print("<td>未定義</td>"); break;
	 }   
    }
	out.print("</tr>");
   }
   
   out.print("</table>");
   stmt.close();
   dbCon.close();
  %>
 </body>
</html>