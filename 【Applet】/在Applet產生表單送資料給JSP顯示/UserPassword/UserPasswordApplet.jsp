<%@ page contentType="text/html;charset=Big5" %>
<%@ page import="java.util" %>
<html>
 <head>
  <title>��ܸ��</title>
 </head>
 <body>
  <center><font color=blue size=7 >��Ƥ��e��</font></center><hr><br>
  <%
   Enumeration e=request.getParameterNames();
   out.print("<center><table border=1>");
   while(e.hasMoreElements())
   {
    String name=(String)e.nextElement();
    String value=request.getParameter(name);
    out.print("<tr>");
    out.print("<td bgcolor=yellow>"+name+"</td>");
    out.print("<td>"+value+"</td>");
    out.print("</tr>");
   }
  out.print("</table></center>");
  %>
 </body>
</html> 