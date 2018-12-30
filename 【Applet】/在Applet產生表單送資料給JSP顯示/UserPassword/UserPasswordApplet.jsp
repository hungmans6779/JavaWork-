<%@ page contentType="text/html;charset=Big5" %>
<%@ page import="java.util" %>
<html>
 <head>
  <title>顯示資料</title>
 </head>
 <body>
  <center><font color=blue size=7 >資料內容為</font></center><hr><br>
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