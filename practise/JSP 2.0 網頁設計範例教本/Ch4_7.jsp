<%@ page contentType="text/html;charset=Big5" %>
<%@ page session="true" %>
<html>
 <head>
  <title>Ch4_7.jsp 程式</title>
 </head>
 <body>
  <%
   session.putValue("name","洪嘉宏");
   String url=response.encodeURL("Ch4_7next.jsp");
   out.print("url為:"+url+"<br>");
   String redirectUrl=response.encodeRedirectURL("Ch4_7next.jsp");
   out.print("redirectUrl為:"+redirectUrl+"<br>");
  %>
  <a href="<%= url%>">Ch4_7next.jsp</a>
 </body>
</html>