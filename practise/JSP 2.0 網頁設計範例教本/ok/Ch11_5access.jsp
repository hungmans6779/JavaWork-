<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_5access.jsp�{��</title>
 </head>
 <body>
  <b><h2><center>���Access��Ʈwstudents��ƪ��e</center></h2></b><hr /><br />
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
   //�إ߼��D�C
   out.print("<tr>");
   for(int i=1;i<=columnCount;i++)
   {
	out.print("<td>");
	out.print(rsmd.getColumnLabel(i));
	out.print("</td>");
   }
   out.print("</tr>");
   //�إ߸�ƪ��U����
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
   //�W�@��
   if(pageNo>1)
    out.print("<a href='http://hungmans6779.homeip.net/jsp/ok/Ch11_5access.jsp?Sql="+sql+"&Page="+(pageNo-1)+"'>�W�@��</a>");
   //�U�@��
   if(pageNo<totalPages)
    out.print("<a href='http://hungmans6779.homeip.net/jsp/ok/Ch11_5access.jsp?Sql="+sql+"&Page="+(pageNo+1)+"'>�U�@��</a>");
   out.print("("+pageNo+"/"+totalPages+")");
   out.print("</center>");
  %>
 </body>
</html>