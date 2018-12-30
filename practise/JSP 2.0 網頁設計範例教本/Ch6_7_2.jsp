<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
 <head>
  <title>Ch6_7_2.jsp程式</title>
 </head>
 <body>
  <jsp:useBean id="now" class="java.util.Date" />
  <c:set var="total" value="3.1415926" />
  <b><h2><c:out value="<fmt:setLocale>標籤範例" /></h2></b><hr>
  <b>英文:</b>
  <fmt:setLocale value="en" /><br>
  <fmt:formatDate value="${now}" type="both" /><br>
  <fmt:formatNumber value="${total}" /><br>
  <b>英文(美國):</b>
  <fmt:setLocale value="en_US" /><br>
  <fmt:formatDate value="${now}" type="both" /><br>
  <fmt:formatNumber value="${total}" /><br>
  <b>西班牙文:</b>
  <fmt:setLocale value="es" /><br>
  <fmt:formatDate value="${now}" type="both" /><br>
  <fmt:formatNumber value="${total}" /><br>
  <b>法文:</b>
  <fmt:setLocale value="fr" /><br>
  <fmt:formatDate value="${now}" type="both" /><br>
  <fmt:formatNumber value="${total}" /><br>
  <b>日文:</b>
  <fmt:setLocale value="ja_JP" /><br>
  <fmt:formatDate value="${now}" type="both" /><br>
  <fmt:formatNumber value="${total}" /><br>
  <b>台灣:</b>
  <fmt:setLocale value="zh_TW" /><br>
  <fmt:formatDate value="${now}" type="both" /><br>
  <fmt:formatNumber value="${total}" /><br>
  <b>中國:</b>
  <fmt:setLocale value="zh_CN" /><br>
  <fmt:formatDate value="${now}" type="both" /><br>
  <fmt:formatNumber value="${total}" /><br>
 </body>
</html>