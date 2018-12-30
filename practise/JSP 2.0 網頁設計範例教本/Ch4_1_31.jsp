<!-- JavaScript Document -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>Ch4_1_31.jsp程式</title>
 </head>
 <body>
  <%!
   double convert(double c)
   {
	double f;
	f=(9.0*c)/5.0+32;
	return f;
   }
  %>
  <%
   double c=35.0;
   double f=convert(c);
  %>
  攝氏溫度:<%= c %><br>
  華氏溫度:<%= f %><br>
 </body>
</html> 