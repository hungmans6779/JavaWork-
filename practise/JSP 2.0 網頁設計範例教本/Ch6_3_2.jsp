<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch6_3_2.jsp�{��</title>
 </head>
 <body>
  <b><c:out value="<c:choose>�B<c:when>�B<c:otherwise>���зǽd��" /></b><br />
  <hr />
  <c:set var="grade" value='B' />
  �ǥͪ����Z:<c:out value="${grade}" /><br />
  <c:choose>
   <c:when test="${grade=='A'}">
    �ǥͪ����Z�W�L80��
   </c:when>
   <c:when test="${grade=='B'}">
    �ǥͪ����Z70����79��
   </c:when>
   <c:when test="${grade=='C'}">
    �ǥͪ����Z60����69��
   </c:when>
   <c:otherwise>
    �ǥͪ����Z�C��60��
   </c:otherwise>
  </c:choose>
 </body>
</html>