<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch6_3_2.jsp程式</title>
 </head>
 <body>
  <b><c:out value="<c:choose>、<c:when>、<c:otherwise>的標準範例" /></b><br />
  <hr />
  <c:set var="grade" value='B' />
  學生的成績:<c:out value="${grade}" /><br />
  <c:choose>
   <c:when test="${grade=='A'}">
    學生的成績超過80分
   </c:when>
   <c:when test="${grade=='B'}">
    學生的成績70分至79分
   </c:when>
   <c:when test="${grade=='C'}">
    學生的成績60分至69分
   </c:when>
   <c:otherwise>
    學生的成績低於60分
   </c:otherwise>
  </c:choose>
 </body>
</html>