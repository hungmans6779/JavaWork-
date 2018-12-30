<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>Ch4_5_2.jsp 程式 </title>
 </head>
 <body>
  <font color="blue">Servlet名稱:<font color="red"><%= config.getServletName() %></font><br>
  Servlet參數title:<font color="red"><%= (String)config.getInitParameter("title") %></font></font><br>
 </body>
</html>