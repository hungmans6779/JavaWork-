<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch6_5_3.jspµ{¦¡</title>
 </head>
 <body>
  <b><h2><c:out value="<c:import>¼ÐÅÒ½d¨Ò" /></h2></b><br>
  <hr>
   <c:set var="type" value="${param.type}" />
   <c:if test="${type==1}">
    <c:import url="Ch6_3_1.jsp" />
   </c:if>
   <c:if test="${type==2}">
    <c:import url="Ch6_5_3.jsp">
	 <c:param name="type" value="3" />
	</c:import>
   </c:if>
   <c:if test="${type==3}">
    <c:import var="homepage" url="Ch6_3_2.jsp" />
	<c:out value="${homepage}" escapeXml="false" />
   </c:if>
   <c:if test="${type==4}">
    <c:import url="/Ch4_2_1.jsp" context="/Ch04" />
   </c:if>
   <c:if test="${type==5}" >
    <c:import url="Ch6_5_3.txt" charEncoding="MS950" />
   </c:if>
 </body>
</html>