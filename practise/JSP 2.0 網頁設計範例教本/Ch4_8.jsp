<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch4_8.jsp �{��</title>
 </head>
 <body>
  <%
   response.setDateHeader("Expires",0);
   application.setAttribute("name","�x�ŧ�");
   session.setAttribute("name","�x�ŧ�");
   request.setAttribute("name","�x�ŧ�");
   pageContext.setAttribute("name","�x�ŧ�");
  %>
  <jsp:include page="Ch4_8next.jsp" /><hr>
  �bCh4_8.jsp��ܽd���ܼƭ�:<br>
  Application�d��:<%= application.getAttribute("name") %><br>
  Session�d��:<%= session.getAttribute("name") %><br>
  Request�d��:<%= request.getAttribute("name") %><br>
  Page�d��:<%= pageContext.getAttribute("name") %><br>
 </body>
</html>