<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html> 
 <head>
  <title>Ch7_1.jsp�{��</title>
 </head>
 <body>
  <b><h2>URL �Ѽƶǻ����d��</h2></b><hr />
  <c:set var="type" value="${param.type}" />
  <c:if test="${not empty type}" >
   <c:choose>
    <c:when test="${type==1}">
	 <a href="Ch7_1next.jsp?Username=�x�ŧ�&amp;Password=6779">�n�J�ۤv</a>
	</c:when>
	<c:when test="${type==2}">
	 <jsp:include page="Ch7_1next.jsp" flush="true">
	  <jsp:param name="Username" value="�ۥѤH" />
	  <jsp:param name="Password" value="6779" />
	 </jsp:include>
	</c:when>
	<c:when test="${type==3}">
	 <jsp:forward page="Ch7_1next.jsp">
	  <jsp:param name="Username" value="�[���" />
	  <jsp:param name="Password" value="6779" />
	 </jsp:forward>
	</c:when>
	<c:when test="${type==4}">
	 <c:redirect url="Ch7_1next.jsp">
	  <c:param name="Username" value="�z��" />
	  <c:param name="Password" value="6779" />
	 </c:redirect>
	</c:when>
	<c:otherwise>
	 type�n�b1-4�d��....<br>
	</c:otherwise>
   </c:choose>
  </c:if>
 </body>
</html>