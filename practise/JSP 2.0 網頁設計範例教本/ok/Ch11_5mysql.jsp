<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_5mysql.jsp�{��</title>
  <body>
   <b><h2><center>���MySQL��Ʈwstudents��ƪ�d�ߵ��G</center></h2></b><hr /><br />
   <%!
    public String toUnicode(String s)
	{
	 if(s==null || s.length()==0)
	  return null;
	 int i,j;
	 byte buffer[]=new byte[s.length()*2];
	 for(i=0,j=0;i<s.length();i++)
	 {
	  if(s.charAt(i)>=0x100)
	  {
	   char c=(char)s.charAt(i);
	   byte buf[]=(""+c).getBytes();
	   buffer[j++]=buf[0];
	   buffer[j++]=buf[1];
	  }
	  else
	  {
		buffer[j++]=(byte)s.charAt(i);  
	  }	 
	 }
	 return new String(buffer,0,j);
	}
	Connection dbCon=null;
	Statement stmt=null;
   %>
   <%
    //request.setCharacterEncoding("MS950"); //�����n������
	String sql=request.getParameter("Sql");
	
	
    Class.forName("com.mysql.jdbc.Driver");
	String sCon="jdbc:mysql://localhost:3306/school?user=root&password=12345&useUnicode=true";
	//�إ�Connection����
	dbCon=DriverManager.getConnection(sCon);
	
	try
	{
	 //�إ�Statement����
	 stmt=dbCon.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);	
	}
	catch(SQLException e)
	{
	 out.print(e);	
	}
	//�إ�ResultSet��ResultSetMetaData����
	ResultSet rs=stmt.executeQuery(sql); 
	ResultSetMetaData rsmd=rs.getMetaData();
	
	//�إ߼��D�C
	out.print("<center><table border=1>");
	int columnCount=rsmd.getColumnCount();
	out.print("<tr>");
	for(int i=1;i<=columnCount;i++)
	{
	 out.print("<td>");
	  out.print(rsmd.getColumnLabel(i));
	 out.print("</td>");
	}
	out.print("</tr>");
	
	//�إ߸�ƪ�����
	int pageNo=Integer.parseInt(request.getParameter("Page"));
	int pageSize=3,totalPages=1;
	rs.last();
	int totalRecorders=rs.getRow();
	if(totalRecorders>0)
	{
	 totalPages=totalRecorders/pageSize;
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
	   out.print("<td>"+toUnicode(rs.getString(i))+"</td>");
	  }
	  out.print("</tr>");
	 }while(rs.next() && count< pageSize);
	 out.print("</table>");
	 if(pageNo>1)
	  out.print("|<a href='http://hungmans6779.homeip.net/jsp/ok/Ch11_5mysql.jsp?Sql="+sql+"&Page="+(pageNo-1)+"'>�W�@��</a>|");
	 if(pageNo<totalPages)
	  out.print("|<a href='http://hungmans6779.homeip.net/jsp/ok/Ch11_5mysql.jsp?Sql="+sql+"&Page="+(pageNo+1)+"'>�U�@��</a>|");
     out.print("("+pageNo+"/"+totalPages+")");
	 out.print("</table>");
	}
	else
	{
	 out.print("�Ӹ�ƪ��S������O��.....");
	}
	stmt.close();
	dbCon.close();
   %>
  </body>
 </head>
</html>