<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head> 
  <title>Ch7_3_3.jsp�{��</title>
 </head>
 <body>
  <b><h2>���o��r����M�K�X����</h2></b><hr />
  <%
   String username=request.getParameter("Username");
   String password=request.getParameter("Password");
   if(username!=null && password!=null)
   {
	out.print("<b>request��getParameter��k</b><br>");
	out.print("�ϥΪ̦W��:"+username+"<br>");
	out.print("�ϥΪ̱K�X:"+password+"<br>");
   }
  %>
  <b>JSTL��param���t����</b><br />
  �ϥΪ̦W��:<c:out value="${param.Username}" default="�L�W��" /><br />
  �ϥΪ̱K�X:<c:out value="${param.Password}" default="�L�K�X" /><br />
 </body>
</html>