<!--JavaScript Document -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>Ch3_5_4.jsp</title>
 </head>
 <body>
  <%
   int total=0;
   for(int i=1;i<=10;i++)
   {
    total+=i;
	out.print("¼Æ­È:"+i+"<br>");
   }
   out.print("1¥[¨ì10="+total);
  %>
 </body>
</html>