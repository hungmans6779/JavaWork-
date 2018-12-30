<b<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title> Ch6_3_3.jsp 程式</title>
 </head>
 <body>
  <c:out value="<c:if>、<c:choose>、<c:when>、<c:otherwise>的標準範例"/><br>
  <hr>
  <c:set var="age" value="29" />
  您的年齡：<c:out value="${age} 歲" /><br />
  <c:if test="${age>1 && age<100}">
   <c:choose>
    <c:when test="${age<18}">
	 <c:out value="兒童票:12元" />
	</c:when>
	<c:when test="${age>=18 && age<65}">
	 <c:out value="普通票:15元" />
	</c:when>
	<c:otherwise>
	 <c:out value="敬老票:8元" />
	</c:otherwise>
   </c:choose>
  </c:if>
 </body>
</html>