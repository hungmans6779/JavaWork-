<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_3_6.jsp�{��</title>
 </head>
 <body>
  <b><h2>���o�U�Ԧ��M��������</h2></b><hr />
  <%
   out.print("<b>request��getParameter��k</b><br>");
   int ship=Integer.parseInt(request.getParameter("ship"));
   switch(ship)
   {
	case 1: out.print("�ϥΪ̶l�H<br>"); break;
	case 2: out.print("�ϥ�UPS<br>"); break;
	case 3: out.print("�ϥΪ̦ۨ�<br>"); break;
	default: out.print("���i��o�ͪ�");break;
   }
  %>
  <b>JSTL��param���t����</b><br />
  <c:set var="ship" value="${param.ship}" />
  <c:choose>
   <c:when test="${ship==1}">
    �ϥΪ̶l�H<br />
   </c:when>
   <c:when test="${ship==2}">
    �ϥ�UPS<br />
   </c:when>
   <c:when test="${ship==3}">
    �ϥΪ̦ۨ�<br />
   </c:when>
  </c:choose>
 </body>
</html>