<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head> 
  <title>Ch8_3_2.jsp�{��</title>
 </head>
 <body>
  <%
   if(request.getParameter("Login")!=null)  //�P�_�O�_�����U�n�J�s
   {
    String name=request.getParameter("Username");
    if(session.getAttribute("Username")==null)
	{
	 session.setAttribute("Username",name);
	}
    %>
	<c:if test="${empty (sessionScope.Password)}">
	 <c:set var="Password" value="${param.Password}" scope="session" />
	</c:if>
	<%
	 response.sendRedirect("Ch8_3_2first.jsp");
   
   } //�P�_�O�_�����U�n�J�s
  %>
  <b><h2>�п�J�n�J���</h2></b><hr>
  <form method="post" action="Ch8_3_2.jsp">
   �b���G<input type="TEXT" name="Username" size="10"><br>
   �K�X�G<input type="PASSWORD" name="Password" size="10"><br>
   <input type="SUBMIT" name="Login" value="�n�J">
  </form>
 </body>
</html>