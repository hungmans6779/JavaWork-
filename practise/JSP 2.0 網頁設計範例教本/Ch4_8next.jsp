<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch4_8next.jsp 程式</title>
 </head>
 <body>
  <%
   response.setDateHeader("Expires",0);
  %>
  在Ch4_8next.jsp顯示範圍變數值:<br>
  Application範圍:<%= application.getAttribute("name") %><br />
  Session範圍:<%= session.getAttribute("name") %><br />
  Request範圍:<%= request.getAttribute("name") %><br />
  Page範圍:<%= pageContext.getAttribute("name") %><br />
 </body>
</html>