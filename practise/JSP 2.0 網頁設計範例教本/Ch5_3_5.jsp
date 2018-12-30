<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>CH5_3_5.jsp 程式</title>
 </head>
 <body>
  <%
   pageContext.setAttribute("username","Joe");
   pageContext.setAttribute("hour",19);
  %>
  param.name=${empty param.name}<br>
  username=${empty username}<br>
  12小時制:${hour}<br>
  24小時制:${(hour>=12)?hour-12:hour}<br>
 </body>
</html>