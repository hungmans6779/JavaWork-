<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_3_8.jsp�{��</title>
 </head>
 <body>
  <b><h2>���o��������</h2></b><hr />
  <%
   String name=request.getParameter("Name");
   String order=request.getParameter("Order");
   if(name!=null && order!=null)
   {
	out.print("<b>request��getParameter��k</b><br>");   
	out.print("�m    �W:"+name+"<br>");
	out.print("�q��s��:"+order+"<br>");
   }
  %>
  <b>JSTL��param���t����</b><br />
  �m    �W�G<c:out value="${param.Name}" default="�L�m�W" /><br />
  �q��s���G<c:out value="${param.Order}" default="�L�s��" /><br />
 </body>
</html>