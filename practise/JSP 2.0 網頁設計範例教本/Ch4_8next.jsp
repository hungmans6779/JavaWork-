<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch4_8next.jsp �{��</title>
 </head>
 <body>
  <%
   response.setDateHeader("Expires",0);
  %>
  �bCh4_8next.jsp��ܽd���ܼƭ�:<br>
  Application�d��:<%= application.getAttribute("name") %><br />
  Session�d��:<%= session.getAttribute("name") %><br />
  Request�d��:<%= request.getAttribute("name") %><br />
  Page�d��:<%= pageContext.getAttribute("name") %><br />
 </body>
</html>