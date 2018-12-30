<%@ page contentType="text/html;charset=MS950" isErrorPage="true"%>
<html>
 <head>
  <title>Ch9_3error.jsp程式</title>
 </head>
 <body>
  <b><h2>JSP的錯誤處理網頁</h2></b><hr />
  <b>Exeption物件：</b><%=exception%><br>
  <b>例外訊息：</b><%=exception.getMessage()%><br>
  <b>堆疊的追蹤訊息：</b><br>
  <small>
   <%
    exception.printStackTrace(response.getWriter());
   %>
  </small>
 </body>
</html>