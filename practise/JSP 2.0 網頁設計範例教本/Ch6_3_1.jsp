<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
 <head>
  <title> Ch6_3_1.jsp�{��</title>
 </head>
 <body>
  <b><c:out value="<c:if>���ҽd��" /></b><br />
  <hr />
  <c:set var="scope" value="78" scope="page" />
  �ǥͦ��Z:<c:out value="${scope}" /><br>
  <c:if test="${scope>=60}">
   JSP �����s�@������s�ή�!
  </c:if><br />
  <b><c:out value="var�ݩʩMscope�ݩ�" /></b>
  <c:if test="${scope>=60}" var="result" scope="page"/>
  <c:out value="${result}"/>
 </body>
</html>