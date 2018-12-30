<%@page contentType="text/html;charset=MS950" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch8_3_2_1second.jsp程式</title>
 </head>
 <body>
  <b><h2>取得Session的變數-Ch8_3_2_1second.jsp程式</h2></b><hr>
  <font color="blue">姓名：<font color="green">[${sessionScope.Username}]</font><br>
  密碼：<font color="red">${sessionScope.Password}</font><br>
  <a href="http://hungmans6779.homeip.net/jsp/Ch8_3_2_1three.jsp">下一頁</a>
 </body>
</html>