<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html> 
 <head>
  <title>Ch6_4_2.jsp 程式</title>
 </head>
 <body>
  <b><h2><c:out value="<c:forTokens>標籤範例" /></h2></b><hr />
  <c:set var="str" value="1,2,3:4:5,6#7,8" />
  <b>原始字串:</b>
  <c:out value="${str}" /><br />
  <hr />
  <b><c:out value="使用空字串分隔:" /></b><br />
  <c:forTokens var="item" items="${str}" delims="">
   [<c:out value="${item}" />]
  </c:forTokens>
  <hr />
 
  <b>使用','分隔</b><br />
  <c:forTokens var="token" items="${str}" delims=",">
   [<c:out value="${token}" />]
  </c:forTokens>
  <hr />
  <b>使用",:#"分隔</b><br />
  <c:forTokens var="token" items="${str}" delims=",:#">
   [<c:out value="${token}" />]
  </c:forTokens>
  <hr />
  <b>分割指定範圍的元素1-3:</b><br />
  <c:forTokens var="token" items="${str}" delims="," begin="1" end="3" step="1">
   [<c:out value="${token}"/>]
  </c:forTokens>
 </body>
</html>