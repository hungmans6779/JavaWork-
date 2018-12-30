<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Test6.jspµ{¦¡</title>
 </head>
 <body>
  <%
   String value[]={"JSP","ASP","PHP"};
   pageContext.setAttribute("value",value);
  %>
  <c:forEach var="item" items="${value}">
   <c:out value="${item}" /><br>
  </c:forEach>
 
 </body>
</html>