<%@ page contentType="text/html;charset=Big5" %>
<%@ page session="true" %>
<html>
 <head>
  <title>Ch4_7next.jsp</title>
 </head>
 <body>
  <font color="blue">
  <%
   String name=(String)session.getValue("name");
   out.print("Session���ܼƭ�name:"+name+"<br>");
  %>
  </font>
 </body>
</html>