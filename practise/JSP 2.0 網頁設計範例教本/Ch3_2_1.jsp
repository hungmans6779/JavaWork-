<!--�o�O�@��jsp���{�� -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>�o�Och3_2_1.jsp</title>
 </head>
 <body>
 <%! int from,to; %>
 <%
  from=1;
  to=7;
  for(int i=from;i<=to;i++)
  { %>
  <font size=<%= i%>>
  <p>�o�O�@��jsp���{��</p>
 <%}%>
 </body>
</html>  