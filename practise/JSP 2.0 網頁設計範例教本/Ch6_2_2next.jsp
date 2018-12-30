<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch6_2_2next.jsp程式</title>
 </head>
 <body>
  <b>檢視變數範圍</b><br>
  <hr>
  Page範圍變數msg1:<c:out value="${msg1}" default="不存在" /><br>
  Session範圍變數msg2:<c:out value="${msg2}" default="不存在" /><br>
  <a href="ch6_2_2.jsp">返回</a><br>
  <a href="http://hungmans6779.homeip.net:1978">連結到私人http下載伺服器</a>
 </body>
</html>