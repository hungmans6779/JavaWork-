<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html> 
 <head>
  <title> Ch6_4_1.jsp �{�� </title>
 </head>
 <body>
  <b><h2><c:out value="<c:forEach>�зǽd��" /></h2></b>
  <hr />
  <b><c:out value="���X�Ҧ����X���󪺤���" /></b><br />
  <jsp:useBean id="list" class="java.util.TreeMap">
   <c:set target="${list}" property="Joe" value="���|�w" />
   <c:set target="${list}" property="Jane" value="���p��" />
   <c:set target="${list}" property="Tom" value="�i�L��" />
  </jsp:useBean>
  <c:forEach var="item" items="${list}">
   [<c:out value="${item.key}" />]
   (<c:out value="${list[item.key]}" />)
  </c:forEach>
  <hr />
  <b><c:out value="���X�}�C����" /></b><br />
  <%
   String data[]={"ASP","PHP","JSP","ASP.Net"};
   pageContext.setAttribute("array",data);
  %>
  <c:forEach var="item" items="${array}" begin="0" end="1" step="1">
   [<c:out value="${item}" />]
  </c:forEach>
  <hr />
  <b><c:out value="�p�ưj��" /></b><br />
  <c:forEach var="item" begin="1" end="5" step="1">
   [<c:out value="${item}" />]
  </c:forEach>
 </body>
</html>