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
  �s��JSP���{���p��:<%= pageCount %><br />
  �ϰ��ܼƪ��p��:<%= count %>
 </body>
</html>