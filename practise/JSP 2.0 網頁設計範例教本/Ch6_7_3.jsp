<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
 <head>
  <title>Ch6_7_3.jsp�{��</title>
 </head>
 <body>
  <b><h2><c:out value="<fmt:bundle>�P<fmt:message>�зǽd��" /></h2></b><hr>
  <b>����T��</b><br>
  <jsp:useBean id="now" class="java.util.Date" />
  <fmt:setLocale value="zh_TW" />
  <fmt:setBundle basename="Ch6_7_2" scope="session" />
  <fmt:message key="hello" /><br>
  <fmt:message key="name" /><br>
  <fmt:message key="today" ><br>
   <fmt:param value="${now}" />
  </fmt:message><br>
  <b>�^��T��</b><br>
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