<!-- JavaScript Document -->
<%-- 這個程式是Ch3_3_2.asp --%>
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>Ch3-3-2.jsp</title>
 </head>
 <body>
  <%
   int score,i,j,k;
   final double PI=3.1415962;
   score=85;
   i=20;
   j=20;
   k=20;
   //顯示變數值
   out.print("成績:"+score+"<br>");
   out.print("變數i="+i+"<br>");
   out.print("變數j="+j+"<br>");
   out.print("變數k="+k+"<br>");
   out.print("半徑10的面積:"+PI*10*10+"<br>");
  %>
 </body>
</html> 