<!-- JavaScript Document -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>Ch4_1_2.jsp</title>
 </head>
 <body>
  <%! int pageCount=0; %>
  <% int count=0; %>
  <%
   //int count=0;
   count++;
   pageCount++;
  %>
  存取JSP的程式計數:<%= pageCount %><br />
  區域變數的計數:<%= count %>
 </body>
</html>