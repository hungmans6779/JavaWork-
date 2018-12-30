<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>copyright.jsp程式</title>
 </head>
 <body>
  <%! int count=0; %>
  <%
   count++;
   out.print("JSP程式的訪客計數:"+count+"<br>");
  %>
  <%@ include file="Ch4_2_2.inc" %>
 </body>
</html>