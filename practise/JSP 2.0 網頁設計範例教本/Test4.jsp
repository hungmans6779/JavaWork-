<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Test4.jsp</title>
 </head>
 <body>
 <%
  int array[]={1,2,3,4};
  pageContext.setAttribute("array",array);
  java.util.ArrayList list=new java.util.ArrayList();
  list.add("4");
  list.add("3");
  list.add("56");
  list.add("1");
  pageContext.setAttribute("list",list);
 %>
  <c:forEach var="item" items="${array}" begin="0" end="2" step="1">
   <c:out value="${item}" /><br />
  </c:forEach>
  <hr />
  <c:forEach var="item1" items="${list}">
   <c:out value="${item1}-" />
  </c:forEach>
  <hr />
  <c:forEach var="current" begin="1" end="9" step="1">
   <c:out value="${current}" /><br />
  </c:forEach>
 </body>
</html>