<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>CH5_3_5.jsp �{��</title>
 </head>
 <body>
  <%
   pageContext.setAttribute("username","Joe");
   pageContext.setAttribute("hour",19);
  %>
  param.name=${empty param.name}<br>
  username=${empty username}<br>
  12�p�ɨ�:${hour}<br>
  24�p�ɨ�:${(hour>=12)?hour-12:hour}<br>
 </body>
</html>