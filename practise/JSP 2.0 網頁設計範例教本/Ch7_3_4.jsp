<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
   <title>Ch7_3_4.jsp�{��</title>
  </head>
  <body>
   <b><h2>���o��r�ϰ�����</h2></b><hr>
   <%
    String address=request.getParameter("Address");
	if(address!=null)
	{
	 out.print("<b>JSP��request���󪺤�k:</b><br>");
	 out.print("�a�}<br>");
	 out.print(address.replaceAll("\r\n","<br>")+"<br>");
	}
   %>
  <b>JSTL��param���t����</b><br>
  �a�}:<br>
  <c:out value="${param.Address}" default="�L���" />
  </body>
</html>