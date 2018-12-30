<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.sql.*" %>
<html>
 <head>
  <title>Ch11_4_2mysql.jsp</title>
 </head>
 <body>
  <b><h2>�qMySQL��Ʈw����ܸ�ƪ��O�����</h2></b><hr />
  <%!
   public String toUnicode(String s)
   {
    if(s==null || s.length()==0)
	{
	 return null;
	}
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
  
  %>
  <%
   Class.forName("com.mysql.jdbc.Driver"); //�O�s����MySql��Ʈw
   Connection dbCon=null;
   String sCon="jdbc:mysql://localhost:3306/school?user=root&password=12345&useUnicode=true";
   dbCon=DriverManager.getConnection(sCon); //�O�s����MySQL��Ʈw
   if(dbCon!=null) 
    out.print("Connection�s�����\......<br>");
   Statement stmt=null;
   try
   {
	stmt=dbCon.createStatement();
	if(stmt!=null)
	 out.print("Statement����إߦ��\.....<br>");
	if(stmt.execute("SELECT * FROM students"))
	 out.print("��ƪ�s�����\.....<br>");
   }
   catch(SQLException e)
   {
	out.print(e);   
   }
   ResultSet rs=stmt.executeQuery("SELECT * FROM students");
   out.print("<table border>"); 
   while(rs.next())
   {
	out.print("<tr>");
	out.print("<td>"+toUnicode(rs.getString("stdno"))+"</td>");
	out.print("<td>"+toUnicode(rs.getString("name"))+"</tr>");
	out.print("<td>"+toUnicode(rs.getString("address"))+"</td>");
	out.print("<td>"+rs.getDate("birthday")+"</td>");
	out.print("<td>"+rs.getInt("totalCredit")+"</td>");
	out.print("</tr>");
   }
   out.print("</table>");
   rs.close();
   stmt.close();
   dbCon.close();
  %>
  
 </body>
</html>