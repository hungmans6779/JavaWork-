<!--這是一個jsp的程式 -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>這是ch3_2_1.jsp</title>
 </head>
 <body>
 <%! int from,to; %>
 <%
  //給定變數from和to的初始值
  from=1;
  to=7;
  for(int i=from;i<=to;i++)
  { %>
  <font size=<%= i%>>
  <p>這是一個jsp的程式</p>
  <%-- 這是用來顯示日期和時間的方法 --%>
  現在的日期/時間:<%=new java.util.Date() %>
  <hr> 
 <%}%>
 </body>
</html>  