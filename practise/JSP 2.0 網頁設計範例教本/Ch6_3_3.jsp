<b<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title> Ch6_3_3.jsp �{��</title>
 </head>
 <body>
  <c:out value="<c:if>�B<c:choose>�B<c:when>�B<c:otherwise>���зǽd��"/><br>
  <hr>
  <c:set var="age" value="29" />
  �z���~�֡G<c:out value="${age} ��" /><br />
  <c:if test="${age>1 && age<100}">
   <c:choose>
    <c:when test="${age<18}">
	 <c:out value="�ൣ��:12��" />
	</c:when>
	<c:when test="${age>=18 && age<65}">
	 <c:out value="���q��:15��" />
	</c:when>
	<c:otherwise>
	 <c:out value="�q�Ѳ�:8��" />
	</c:otherwise>
   </c:choose>
  </c:if>
 </body>
</html>