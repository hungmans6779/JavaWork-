<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch6_5_2.jspµ{¦¡</title>
 </head>
 <body>
  <b><h2><c:out value="<c:redirect>¼ÐÅÒ½d¨Ò" /></h2></b><br />
  <hr />
   <c:set var="type" value="${param.type}" />
   <c:if test="${type==1}">
    <c:redirect url="http://www.hinet.net" />
   </c:if>
   <c:if test="${type==2}">
    <c:redirect url="Ch4_2_1.jsp" />
   </c:if>
   <c:if test="${type==3}">
    <c:redirect url="Ch6_5_2.jsp">
	 <c:param name="type" value="2" />
	</c:redirect>
   </c:if>
 </body>
</html>