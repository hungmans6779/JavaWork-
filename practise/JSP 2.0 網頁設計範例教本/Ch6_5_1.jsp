<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch6_5_1.jsp �{��</title>
 </head>
 <body>
  <b><h2><c:out value="<c:url>���ҽd��" /></h2></b>
  <hr />
  <b><c:out value="value�ݩ�:" /></b><br />
  <a href="<c:url value="Ch6_2_1.jsp" />">Ch6_2_1.jsp</a><br />
  <b><c:out value="var�Mscope�ݩ�" /></b><br />
  <c:url var="homepage" value="http://www.hinet.net" scope="session" />
  <a href="<c:out value="${homepage}" />">���عq�H</a><br />
  <b><c:out value="<c:param>����:" /></b><br />
  <a href="
   <c:url value="/Ch4_2_1.jsp" context="/Ch04">
    <c:param name="name" value="joe" />
	<c:param name="email" value="hungmans6779@yahoo.com.tw" />
   </c:url>">�ǻ�name�Pemail�Ѽ�</a>
 </body>
</html>