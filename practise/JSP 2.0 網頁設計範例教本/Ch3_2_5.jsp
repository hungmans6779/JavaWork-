<!-- JavaScript Document -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>這是程式Ch3_2_5.jsp</title>
 </head>
 <body>
 <!-- <%=new java.util.Date() %> -->
 <%-- JSP的註解 --%>
 <%
  out.print("目前的日期和時間:");
  out.println("目前的日期和時間:");
  out.println("<br>");
  out.print("目前的日期和時間:<br>");
  out.println("目前的日期和時間:<br>");
  out.println(new java.util.Date());
 %>
 <br><%= new java.util.Date() %>
 
 </body>
</html> 