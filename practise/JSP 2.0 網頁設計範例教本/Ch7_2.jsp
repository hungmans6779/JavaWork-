<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_2.jsp�{��</title>
 </head>
 <body>
  <b><h2>URL�Ѽƶǻ��d��</h2></b><hr />
  <c:set var="type" value="${param.type}" />
  <c:if test="${not empty type}" >
   <c:choose>
    <c:when test="${type==1}" >
	 <a href="Ch7_2next.jsp?Username=���|�w&amp;Password=1234">�n�J</a><br />
	</c:when>
	<c:when test="${type==2}" >
	 <jsp:include page="Ch7_2next.jsp" flush="true">
	  <jsp:param name="Username" value="���p��" />
	  <jsp:param name="Password" value="5678" />
	 </jsp:include><br />
	</c:when>
	<c:when test="${type==3}">
	 <jsp:forward page="Ch7_2next.jsp">
	  <jsp:param name="Username" value="�i�L��" />
	  <jsp:param name="Password" value="9012" />
	 </jsp:forward><br />
	</c:when>
	<c:when test="${type==4}">
	 <c:redirect url="Ch7_2next.jsp">
	  <c:param name="Username" value="�ۥѤH" />
	  <c:param name="Password" value="6779" />
	 </c:redirect><br />
	</c:when>
	<c:otherwise>
	 type �ѼƬ�1��4��������!<br />
	</c:otherwise>
   </c:choose>
  </c:if>
 </body>
</html>