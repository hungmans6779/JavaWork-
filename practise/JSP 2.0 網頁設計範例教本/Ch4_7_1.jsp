<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch4_7_1.jsp</title>
 </head>
 <body>
  <%
   response.setIntHeader("Refresh",3);
  %>
  <font color="red">1-500之間的亂數值:<%= (int)(Math.random()*500+1)%></font>
 </body>
</html>