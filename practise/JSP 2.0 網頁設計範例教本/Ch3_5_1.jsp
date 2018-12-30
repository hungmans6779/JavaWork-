<!--JavaScript Document-->
<html>
 <head>
  <title> 程式Ch3_5_1.jsp</title>
 </head>
 <body>
  <%
   int score=80;
   out.print("JSP網頁製作成績: "+score+"<br>");
   if(score>=60)
	out.print("JSP網頁製作徹底研究-及格<br>");   
   else
    out.print("JSP網頁製作徹底研究-不及格<br>");

   score=59;
   out.print("網頁製作成績: "+score+"<br>");
   if(score>=60)
    out.print("網頁製作成績-及格<br>");
   else
    out.print("網頁製作成績-不及格<br>");
   
  %> 
 </body> 
</html> 