<!--JavaScript Document -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>Ch3_5_3.jsp</title>
 </head>
 <body>
  <%
   int hour=19;
   out.print("24�p�ɨ�O:"+hour+"<br>");
   hour=(hour>=12)?hour-12:hour;
   out.print("12�p�ɨ�O:"+hour+"<br>");
  %>
 </body>
</html>