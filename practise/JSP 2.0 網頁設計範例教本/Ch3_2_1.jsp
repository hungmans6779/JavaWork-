<!--這是一個jsp的程式 -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>這是ch3_2_1.jsp</title>
 </head>
 <body>
 <%! int from,to; %>
 <%
  from=1;
  to=7;
  for(int i=from;i<=to;i++)
  { %>
  <font size=<%= i%>>
  <p>這是一個jsp的程式</p>
 <%}%>
 </body>
</html>  