<%@page contentType="text/html;charset=MS950" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch8_3_2_1three.jsp程式</title>
 </head>
 <body>
  <b><h2>取得Session的變數-Ch8_3_2_1three.jsp程式</h2></b><hr>
  <%
   String name=(String)session.getAttribute("Username");
  %>
  <font color="blue">姓名：<font color="green">[<%=name%>]</font><br>
  密碼：<font color="red">${sessionScope.Password}</font></font><br>
  <a href="http://hungmans6779.homeip.net/jsp/Ch8_3_2_1four.jsp">下一頁</a>
 </body>
</html>