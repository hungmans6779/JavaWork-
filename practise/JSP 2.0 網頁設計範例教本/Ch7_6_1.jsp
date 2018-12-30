<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.util.*" %>
<html>
 <head>
  <title>Ch7_6_1.jspµ{¦¡</title>
 </head>
 <body>
  <%
   Enumeration e=request.getHeaderNames();
   while(e.hasMoreElements())
   {
	String name=(String)e.nextElement();   
	out.print(name+" = "+request.getHeader(name)+"<br>");
   }
  %>
  <hr />
  HOST:<%=request.getHeader("Host")%>
 </body>
</html>