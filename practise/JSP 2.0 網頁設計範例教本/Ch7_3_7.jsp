<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_3_7.jsp程式</title>
 </head>
 <body>
  <b><h2>取得選擇鈕的欄位值</h2></b><hr />
  <%
   out.print("<b>request的getParameter方法</b><br>");
   String payment=request.getParameter("Payment");
   out.print("付款方式:"+payment+"<br>");
  %>
  <b>JSTL的param的隱含物件</b><br />
  付款方式:<c:out value="${param.Payment}" /><br />
 </body>
</html>
 