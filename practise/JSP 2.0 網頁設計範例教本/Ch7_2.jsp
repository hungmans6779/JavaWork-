<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_2.jsp程式</title>
 </head>
 <body>
  <b><h2>URL參數傳遞範例</h2></b><hr />
  <c:set var="type" value="${param.type}" />
  <c:if test="${not empty type}" >
   <c:choose>
    <c:when test="${type==1}" >
	 <a href="Ch7_2next.jsp?Username=陳會安&amp;Password=1234">登入</a><br />
	</c:when>
	<c:when test="${type==2}" >
	 <jsp:include page="Ch7_2next.jsp" flush="true">
	  <jsp:param name="Username" value="江小魚" />
	  <jsp:param name="Password" value="5678" />
	 </jsp:include><br />
	</c:when>
	<c:when test="${type==3}">
	 <jsp:forward page="Ch7_2next.jsp">
	  <jsp:param name="Username" value="張無忌" />
	  <jsp:param name="Password" value="9012" />
	 </jsp:forward><br />
	</c:when>
	<c:when test="${type==4}">
	 <c:redirect url="Ch7_2next.jsp">
	  <c:param name="Username" value="自由人" />
	  <c:param name="Password" value="6779" />
	 </c:redirect><br />
	</c:when>
	<c:otherwise>
	 type 參數為1到4之間的值!<br />
	</c:otherwise>
   </c:choose>
  </c:if>
 </body>
</html>