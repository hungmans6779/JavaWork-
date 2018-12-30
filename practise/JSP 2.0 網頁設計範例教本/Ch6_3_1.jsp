<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
 <head>
  <title> Ch6_3_1.jsp程式</title>
 </head>
 <body>
  <b><c:out value="<c:if>標籤範例" /></b><br />
  <hr />
  <c:set var="scope" value="78" scope="page" />
  學生成績:<c:out value="${scope}" /><br>
  <c:if test="${scope>=60}">
   JSP 網頁製作徹底研究及格!
  </c:if><br />
  <b><c:out value="var屬性和scope屬性" /></b>
  <c:if test="${scope>=60}" var="result" scope="page"/>
  <c:out value="${result}"/>
 </body>
</html>