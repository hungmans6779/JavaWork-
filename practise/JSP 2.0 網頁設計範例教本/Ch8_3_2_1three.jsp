<%@page contentType="text/html;charset=MS950" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch8_3_2_1three.jsp�{��</title>
 </head>
 <body>
  <b><h2>���oSession���ܼ�-Ch8_3_2_1three.jsp�{��</h2></b><hr>
  <%
   String name=(String)session.getAttribute("Username");
  %>
  <font color="blue">�m�W�G<font color="green">[<%=name%>]</font><br>
  �K�X�G<font color="red">${sessionScope.Password}</font></font><br>
  <a href="http://hungmans6779.homeip.net/jsp/Ch8_3_2_1four.jsp">�U�@��</a>
 </body>
</html>