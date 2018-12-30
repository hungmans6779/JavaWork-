<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head> 
  <title>Ch8_3_2first.jsp程式</title>
 </head>
 <body>
  <b><h2>取得Session變數值-Ch8_3_2first.jsp程式</h2></b><hr>
  <%
   String name=session.getAttribute("Username").toString();
  %>
  <font color="blue">歡迎使用者：<font color="green">[<%=name%>]</font>進入網站</font><br>
  密碼：<font color="red">${sessionScope.Password}</font></font><br>
  <a href="http://hungmans6779.homeip.net/jsp/Ch8_3_2second.jsp">下一頁</a>
 
 </body>
</html>