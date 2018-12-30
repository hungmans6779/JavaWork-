<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch9_1_1.jsp程式</title>
 </head>
 <body>
  <%
   int result=0;
   for(int i=2;i>-1;i--)
   {
	result=6/i;
	out.print("其值為："+result+"<br>");
   }
  %>
 </body>
</html>