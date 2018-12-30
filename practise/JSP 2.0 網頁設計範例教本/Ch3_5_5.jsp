<!-- JavaScript Document -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>Ch3_5_5.jsp</title>
 </head>
 <body>
  <%
   int counter=1;
   int total,counter1;
   while(counter<=10)
   {
    total=0;
	counter1=0;
	do
	{
	 total+=counter1; 	
	 counter1++;
	}while(counter1<=counter);
	out.print("­pºâ1 ¥[¨ì "+counter+" = "+total+"<br>");
    counter++;	   
   }
  %>
 </body>
</html> 