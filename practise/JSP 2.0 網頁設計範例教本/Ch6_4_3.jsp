<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title> Ch6_4_3.jsp 程式</title>
 </head>
 <body>
  <jsp:useBean id="list" class="java.util.TreeMap">
   <c:set target="${list}" property="Jane" value="江小魚" />
   <c:set target="${list}" property="Joe" value="陳會安" />
   <c:set target="${list}" property="Tom" value="張無忌" />
  </jsp:useBean>
  <c:forEach var="item" items="${list}" varStatus="status">
   [<c:out value="${item.key}" />]
   (<c:out value="${list[item.key]}" />)<br />
   <b>index:</b><c:out value="${status.index}" />
   <b>count:</b><c:out value="${status.count}" />
   <b>first:</b><c:out value="${status.first}" />
   <b>last:</b><c:out value="${status.last}" />
   <hr />
  </c:forEach>
 </body>
</html>