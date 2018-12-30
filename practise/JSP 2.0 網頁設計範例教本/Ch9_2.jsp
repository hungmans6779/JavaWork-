<!-- JSP程式：Ch9_2.jsp -->
<%@ page contentType="text/html; charset=MS950"%>
<%@ include file="JSTL.jsp" %>
<html>
<head><title>Ch9_2.jsp</title></head>
<body>
<h2>JSTL的例外處理標籤</h2><hr>
<!-- JSTL的錯誤處理標籤<c:catch> -->
<c:catch var="e">
<!-- 除以字串的例外 -->
<c:set var="x" value="5"/>
<c:set var="y" value="This is a book."/>
x/y = <c:out value="${x/y}"/><br>
</c:catch>
<!-- 檢查是否有例外 -->
<c:if test="${ e != null }">
   <!-- 有例外 -->
   例外原因: <c:out value="${e}"/><br>
</c:if>
<c:if test="${ e == null }">
   <!-- 沒有例外 -->
   JSP程式並沒有產生例外<br>
</c:if>
</body>
</html>