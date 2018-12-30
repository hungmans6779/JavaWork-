<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>Ch4_3_3.jsp程式</title>
 </head>
 <body>
  <font color="red"><p>網址轉到included.jsp了</p></font>
  <jsp:forward page="included.jsp">
   <jsp:param name="rows" value="4" />
   <jsp:param name="cols" value="6" />
  </jsp:forward>
  <font color="green">現在的日期/時間:<%= new java.util.Date() %> </font>
 </body>
</html>