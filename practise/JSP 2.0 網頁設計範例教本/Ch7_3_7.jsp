<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_3_7.jsp�{��</title>
 </head>
 <body>
  <b><h2>���o��ܶs������</h2></b><hr />
  <%
   out.print("<b>request��getParameter��k</b><br>");
   String payment=request.getParameter("Payment");
   out.print("�I�ڤ覡:"+payment+"<br>");
  %>
  <b>JSTL��param�����t����</b><br />
  �I�ڤ覡:<c:out value="${param.Payment}" /><br />
 </body>
</html>
 