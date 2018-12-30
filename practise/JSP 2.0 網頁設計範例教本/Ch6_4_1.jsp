<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html> 
 <head>
  <title> Ch6_4_1.jsp 程式 </title>
 </head>
 <body>
  <b><h2><c:out value="<c:forEach>標準範例" /></h2></b>
  <hr />
  <b><c:out value="取出所有集合物件的元素" /></b><br />
  <jsp:useBean id="list" class="java.util.TreeMap">
   <c:set target="${list}" property="Joe" value="陳會安" />
   <c:set target="${list}" property="Jane" value="江小魚" />
   <c:set target="${list}" property="Tom" value="張無忌" />
  </jsp:useBean>
  <c:forEach var="item" items="${list}">
   [<c:out value="${item.key}" />]
   (<c:out value="${list[item.key]}" />)
  </c:forEach>
  <hr />
  <b><c:out value="取出陣列元素" /></b><br />
  <%
   String data[]={"ASP","PHP","JSP","ASP.Net"};
   pageContext.setAttribute("array",data);
  %>
  <c:forEach var="item" items="${array}" begin="0" end="1" step="1">
   [<c:out value="${item}" />]
  </c:forEach>
  <hr />
  <b><c:out value="計數迴圈" /></b><br />
  <c:forEach var="item" begin="1" end="5" step="1">
   [<c:out value="${item}" />]
  </c:forEach>
 </body>
</html>