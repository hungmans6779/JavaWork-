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
  JSP祘Α璸计:<%= pageCount %><br />
  跋办跑计璸计:<%= count %>
 </body>
</html>