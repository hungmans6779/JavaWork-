<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch9_2_1.jsp程式</title>
 </head>
 <body>
  <c:catch var="e">
   <c:set var="x" value="5"  />
   <c:set var="y" value="This is a book" />
   x/y=<c:out value="${x/y}" /><br />
  </c:catch>
  <c:if test="${e!=null}">
    例外原因: <c:out value="${e}"/><br>
  </c:if>
  <c:if test="${e==null}">
   <c:out value="沒有產生例外" />
  </c:if>
 </body>
</html>