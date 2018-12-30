<!--JavaScript Document -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>這是九九乘法表</title>
 </head>
 <body>
  <%
   for(int i=1;i<=9;i++)
   {
	for(int j=1;j<=9;j++)
	{
	 out.print(i+" * "+j+" = "+(i*j)+"     ");	
	}
	out.print("<br>");
   }
  %>
 </body>
</html>
 