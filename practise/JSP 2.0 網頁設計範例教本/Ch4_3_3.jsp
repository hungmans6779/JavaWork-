<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>Ch4_3_3.jsp�{��</title>
 </head>
 <body>
  <font color="red"><p>���}���included.jsp�F</p></font>
  <jsp:forward page="included.jsp">
   <jsp:param name="rows" value="4" />
   <jsp:param name="cols" value="6" />
  </jsp:forward>
  <font color="green">�{�b�����/�ɶ�:<%= new java.util.Date() %> </font>
 </body>
</html>