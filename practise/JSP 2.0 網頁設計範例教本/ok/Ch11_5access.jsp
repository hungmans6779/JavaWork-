<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_5access.jsp程式</title>
 </head>
 <body>
  <b><h2><center>顯示Access資料庫students資料表內容</center></h2></b><hr /><br />
  <%!
   Connection dbCon=null;
   Statement stmt=null;
  %>
  <%
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   dbCon=DriverManager.getConnection("jdbc:odbc:school_db");
   try
   {
	stmt=dbCon.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
   }
   catch(SQLException e)
   {
	out.print(e);   
   }
   String sql=request.getParameter("Sql");
   ResultSet rs=stmt.executeQuery(sql);
   ResultSetMetaData rsmd=rs.getMetaData();
   int columnCount=rsmd.getColumnCount();
   out.print("<center><table border=1>");
   //建立標題列
   out.print("<tr>");
   for(int i=1;i<=columnCount;i++)
   {
	out.print("<td>");
	out.print(rsmd.getColumnLabel(i));
	out.print("</td>");
   }
   out.print("</tr>");
   //建立資料表的各欄位值
   int pageNo=Integer.parseInt(request.getParameter("Page"));
   int pageSize=3;
   rs.last();
   int totalRecorders=rs.getRow();
   int totalPages=totalRecorders/pageSize;
   if(totalRecorders%pageSize!=0)
    totalPages++;
   rs.absolute((pageNo-1)*pageSize+1);
   int count=0;
   do
   {
	count++;
	out.print("<tr>");
	for(int i=1;i<=columnCount;i++)
	{
	 out.print("<td>"+rs.getString(i)+"</td>");	
	}
	out.print("</tr>");
   }while(rs.next() && count<pageSize);
   out.print("</table>");
   //上一頁
   if(pageNo>1)
    out.print("<a href='http://hungmans6779.homeip.net/jsp/ok/Ch11_5access.jsp?Sql="+sql+"&Page="+(pageNo-1)+"'>上一頁</a>");
   //下一頁
   if(pageNo<totalPages)
    out.print("<a href='http://hungmans6779.homeip.net/jsp/ok/Ch11_5access.jsp?Sql="+sql+"&Page="+(pageNo+1)+"'>下一頁</a>");
   out.print("("+pageNo+"/"+totalPages+")");
   out.print("</center>");
  %>
 </body>
</html>