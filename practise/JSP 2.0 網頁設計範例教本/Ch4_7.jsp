<%@ page contentType="text/html;charset=Big5" %>
<%@ page session="true" %>
<html>
 <head>
  <title>Ch4_7.jsp �{��</title>
 </head>
 <body>
  <%
   session.putValue("name","�x�ŧ�");
   String url=response.encodeURL("Ch4_7next.jsp");
   out.print("url��:"+url+"<br>");
   String redirectUrl=response.encodeRedirectURL("Ch4_7next.jsp");
   out.print("redirectUrl��:"+redirectUrl+"<br>");
  %>
  <a href="<%= url%>">Ch4_7next.jsp</a>
 </body>
</html>