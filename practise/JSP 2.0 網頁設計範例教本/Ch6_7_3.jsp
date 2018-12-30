<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
 <head>
  <title>Ch6_7_3.jsp程式</title>
 </head>
 <body>
  <b><h2><c:out value="<fmt:bundle>與<fmt:message>標準範例" /></h2></b><hr>
  <b>中文訊息</b><br>
  <jsp:useBean id="now" class="java.util.Date" />
  <fmt:setLocale value="zh_TW" />
  <fmt:setBundle basename="Ch6_7_2" scope="session" />
  <fmt:message key="hello" /><br>
  <fmt:message key="name" /><br>
  <fmt:message key="today" ><br>
   <fmt:param value="${now}" />
  </fmt:message><br>
  <b>英文訊息</b><br>
  <fmt:setLocale value="en"/>
  <fmt:bundle basename="Ch6_7_2">
   <fmt:message key="hello" /><br>
   <fmt:message key="name" /><br>
   <fmt:message key="today"><br>
    <fmt:param value="${now}" />
   </fmt:message>
  </fmt:bundle>
 
 </body>
</html>