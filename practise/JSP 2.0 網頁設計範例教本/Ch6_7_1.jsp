<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
 <head>
  <title>Ch6_7_1.jsp�{��</title>
 </head>
 <body>
  <b><h2><c:out value="<fmt:setTimeZone>�P<fmt:timeZone>���ҽd��>" /></h2></b><hr />
  <jsp:useBean id="now" class="java.util.Date" />
  �{�b���ɶ�:<c:out value="${now}" /><br />
  <b><c:out value="<fmt:formatDate>���Ҫ�" />timeZoen�ݩ�</b><br />
  <c:set var="zone" value="EST" scope="session" />
  <c:out value="${zone}" />:
  <fmt:formatDate value="${now}" timeZone="${zone}" type="time" />
  <fmt:formatDate value="${now}" timeZone="${zone}" type="date" /><br />
  
  <b><c:out value="<fmt:setTimeZone>���ҽd��" /></b><br />
  CST:
  <fmt:setTimeZone value="CST" />
  <fmt:formatDate value="${now}" type="time" />
  <fmt:formatDate value="${now}" type="date" /><br />
  
  
  <b><c:out value="<fmt:timeZone>���ҽd��" /></b><br />
  MST:
  <fmt:timeZone value="MST">
   <fmt:formatDate value="${now}" type="time" />
   <fmt:formatDate value="${now}" type="date" /><br />
  </fmt:timeZone>
  PST:
  <fmt:timeZone value="PST">
   <fmt:formatDate value="${now}" type="time" />
   <fmt:formatDate value="${now}" type="date" /><br />
  </fmt:timeZone>
 </body>
</html>