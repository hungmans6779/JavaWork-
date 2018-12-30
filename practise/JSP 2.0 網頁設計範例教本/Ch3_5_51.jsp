<!-- JavaScript Document -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>Ch3_5_51.jsp</title>
 </head>
 <body>
  <%
   out.print("另一種寫法<br>");
   int total=0;
   for(int i=1;i<=10;i++)
   {
	for(int j=1;j<=i;j++)
	{
	 total+=j;	
	}
	out.print("計算1 加到 "+i+" = "+total+"<br>");
	total=0;
   }
  %>
 </body>
</html> 