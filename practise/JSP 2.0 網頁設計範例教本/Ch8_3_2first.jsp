<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head> 
  <title>Ch8_3_2first.jsp�{��</title>
 </head>
 <body>
  <b><h2>���oSession�ܼƭ�-Ch8_3_2first.jsp�{��</h2></b><hr>
  <%
   String name=session.getAttribute("Username").toString();
  %>
  <font color="blue">�w��ϥΪ̡G<font color="green">[<%=name%>]</font>�i�J����</font><br>
  �K�X�G<font color="red">${sessionScope.Password}</font></font><br>
  <a href="http://hungmans6779.homeip.net/jsp/Ch8_3_2second.jsp">�U�@��</a>
 
 </body>
</html>