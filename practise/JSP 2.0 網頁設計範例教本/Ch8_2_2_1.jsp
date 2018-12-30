<%@ page contentType="text/html;charset=MS950" %>
<%@ page import="java.util.*" %>
<html>
 <head>
  <title>Ch8_2_2_1.jsp程式</title>
 </head>
 <body>
  <b><h2>取得application變數的初始值</h2></b><hr />
  <%
   Enumeration e=application.getInitParameterNames();
   while(e.hasMoreElements())
   {
	String data=(String)e.nextElement();
	out.print(data+"<br>");
   }
  %>
 </body>
</html>