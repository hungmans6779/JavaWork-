<!--JavaScript Document-->
<html>
 <head>
  <title> �{��Ch3_5_1.jsp</title>
 </head>
 <body>
  <%
   int score=80;
   out.print("JSP�����s�@���Z: "+score+"<br>");
   if(score>=60)
	out.print("JSP�����s�@������s-�ή�<br>");   
   else
    out.print("JSP�����s�@������s-���ή�<br>");

   score=59;
   out.print("�����s�@���Z: "+score+"<br>");
   if(score>=60)
    out.print("�����s�@���Z-�ή�<br>");
   else
    out.print("�����s�@���Z-���ή�<br>");
   
  %> 
 </body> 
</html> 