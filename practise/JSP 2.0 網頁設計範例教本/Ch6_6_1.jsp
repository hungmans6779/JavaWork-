<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch6_6_1.jsp程式</title>
 </head>
 <body>
  <b><h2><c:out value="<fmt:formatDate>與<fmt:parseDate>標籤的範例" /></h2></b><hr />
  <jsp:useBean id="now" class="java.util.Date" />
  <b><c:out value="<fmt:formatDate>標籤範例" /></b><hr />
  <fmt:formatDate value="${now}" type="date" /><br />
  <fmt:formatDate value="${now}" type="time" /><br />
  <fmt:formatDate value="${now}" type="both" /><br />
  <b><c:out value="<fmt:formatDate>的dateStype及timeStyle應用" /></b><br />
  <fmt:formatDate value="${now}" type="date" dateStyle="full" /><br />
  <fmt:formatDate value="${now}" type="date" dateStyle="long" /><br />
  <fmt:formatDate value="${now}" type="date" dateStyle="medium" /><br />
  <fmt:formatDate value="${now}" type="date" dateStyle="short" /><br />
  <fmt:formatDate value="${now}" type="time" timeStyle="full" /><br />
  <fmt:formatDate value="${now}" type="time" timeStyle="long" /><br />
  <fmt:formatDate value="${now}" type="time" timeStyle="medium" /><br />
  <fmt:formatDate value="${now}" type="time" timeStyle="short" /><br />
  <b><c:out value="<fmt:formatDate>的pattern屬性" /></b><br />
  <fmt:formatDate value="${now}" pattern="MM" /><br />
  <fmt:formatDate value="${now}" pattern="MMM" /><br />
  <fmt:formatDate value="${now}" pattern="E-MM/dd/yy" /><br />
  <fmt:formatDate value="${now}" pattern="E-MM/dd/yyyy" /><br />
  <fmt:formatDate value="${now}" pattern="D/M/y HH:mm:ss a" /><br />
  <fmt:formatDate value="${now}" pattern="EEE d MMM yyyy hh 'o''clock' a,zzzz" />
  <fmt:formatDate value="${now}" pattern="yy.MM.dd G'at' hh:mm z" /><br />
  <hr />
  <b><c:out value="<fmt:parseDate>標籤範例" /></b><br />
  <c:set var="current" value="11/01/2004" />
  <fmt:parseDate var="pubDate" value="${current}" pattern="MM/dd/yy" />
  <c:out value="${pubDate}" /><br />
  
  
 </body>
</html>