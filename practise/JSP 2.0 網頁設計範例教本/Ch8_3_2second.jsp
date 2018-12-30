<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head> 
  <title>Ch8_3_2second.jsp程式</title>
 </head>
 <body>
  <b><h2>取得session變數值-Ch3_2second.jsp程式</h2></b><hr />
  <font color="blue">帳號：<font color="green">${sessionScope.Username}</font><br>
  密碼：<font color="red">${sessionScope.Password}</font></font>
 </body>
</html>