<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch6_5_1.jsp 程式</title>
 </head>
 <body>
  <b><h2><c:out value="<c:url>標籤範例" /></h2></b>
  <hr />
  <b><c:out value="value屬性:" /></b><br />
  <a href="<c:url value="Ch6_2_1.jsp" />">Ch6_2_1.jsp</a><br />
  <b><c:out value="var和scope屬性" /></b><br />
  <c:url var="homepage" value="http://www.hinet.net" scope="session" />
  <a href="<c:out value="${homepage}" />">中華電信</a><br />
  <b><c:out value="<c:param>標籤:" /></b><br />
  <a href="
   <c:url value="/Ch4_2_1.jsp" context="/Ch04">
    <c:param name="name" value="joe" />
	<c:param name="email" value="hungmans6779@yahoo.com.tw" />
   </c:url>">傳遞name與email參數</a>
 </body>
</html>