<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_3_6.jsp程式</title>
 </head>
 <body>
  <b><h2>取得下拉式清單方塊欄位值</h2></b><hr />
  <%
   out.print("<b>request的getParameter方法</b><br>");
   int ship=Integer.parseInt(request.getParameter("ship"));
   switch(ship)
   {
	case 1: out.print("使用者郵寄<br>"); break;
	case 2: out.print("使用UPS<br>"); break;
	case 3: out.print("使用者自取<br>"); break;
	default: out.print("不可能發生的");break;
   }
  %>
  <b>JSTL的param隱含物件</b><br />
  <c:set var="ship" value="${param.ship}" />
  <c:choose>
   <c:when test="${ship==1}">
    使用者郵寄<br />
   </c:when>
   <c:when test="${ship==2}">
    使用UPS<br />
   </c:when>
   <c:when test="${ship==3}">
    使用者自取<br />
   </c:when>
  </c:choose>
 </body>
</html>