<%@ page contentType="text/html;charset=Big5" %>
<%@ page language="java" import="java.util.*" %>
<html>
 <head>
  <title>Ch4_2_1.jsp程式</title>
 </head>
 <body>
  <font color="blue">
  <%
   Date today=new Date();
   out.print("今天的日期/時間:"+new Date()+"<br>");
   out.print("今天的日期:"+(today.getYear()+1900)+"/"+(today.getMonth()+1)+"/"+today.getDate()+"<br>");
   out.print("今天是星期:"+today.getDay()+"<br>");
  %>
  </font>
  <font color="red">
  今天的日期/時間:<%= new Date() %><br />
 </body>
</html>