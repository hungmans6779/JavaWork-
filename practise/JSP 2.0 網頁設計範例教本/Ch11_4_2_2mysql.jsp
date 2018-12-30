<%@ page contentType="text/html; charset=MS950" import="java.sql.*"%>
<html>
<head><title>Ch11_4_2_2mysql.jsp</title></head>
<body>
<h2>��ܸ�ƪ��O�����</h2><hr>
<%! 
 public String toUnicode(String s)
 {
  if(s==null || s.length()==0)
   return null;
  byte buffer[]=new byte[s.length()*2];
  int i,j;
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
<table border="1">
<%
Connection dbCon = null;  // �ŧi�����ܼ�
Statement stmt = null;
ResultSet rs = null;
// JDBC�X�ʵ{���Ѽ�
String sDriver = "com.mysql.jdbc.Driver";
String sCon = "jdbc:mysql://localhost:3306/school?user=root&password=12345&useUnicode=true";
try {
   // ���J JDBC driver 
   Class.forName(sDriver);
   // �إ߸�Ƴs���MStatement����
   dbCon = DriverManager.getConnection(sCon);
   stmt = dbCon.createStatement();
   // �إ�SQL���O
   String sSQL = "SELECT * FROM students";
   rs = stmt.executeQuery(sSQL);
   while ( rs.next() ) { // �ϥΰj����ܰO����� 
      out.print("<tr>");
      out.print("<td>"+rs.getString("stdno")+"</td>");
      out.print("<td>"+toUnicode(rs.getString("name"))+"</td>");
      out.print("<td>"+toUnicode(rs.getString("address"))+"</td>");
      out.print("<td>"+rs.getDate("birthday")+"</td>");
      out.print("<td>"+rs.getInt("totalcredit")+"</td>");      
      out.print("</tr>");
   }
   stmt.close();   // ����Statement����
   dbCon.close();  // �����s��
}
catch(SQLException e) {
   out.print(e);   
}
%>
</table>
</body>
</html>