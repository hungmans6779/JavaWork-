<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch4_8.jsp µ{¶°</title>
 </head>
 <body>
  <%
   response.setDateHeader("Expires",0);
   application.setAttribute("name","¨xπ≈ßª");
   session.setAttribute("name","¨xπ≈ßª");
   request.setAttribute("name","¨xπ≈ßª");
   pageContext.setAttribute("name","¨xπ≈ßª");
  %>
  <jsp:include page="Ch4_8next.jsp" /><hr>
  ¶bCh4_8.jsp≈„•‹Ωd≥Ú≈‹º∆≠»:<br>
  ApplicationΩd≥Ú:<%= application.getAttribute("name") %><br>
  SessionΩd≥Ú:<%= session.getAttribute("name") %><br>
  RequestΩd≥Ú:<%= request.getAttribute("name") %><br>
  PageΩd≥Ú:<%= pageContext.getAttribute("name") %><br>
 </body>
</html>