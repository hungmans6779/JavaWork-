<%@page contentType="text/html;charset=MS950" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch8_3_2_1.jsp�{��</title>
 </head>
 <body>
  <%
   if(request.getParameter("Login")!=null) //�P�_�O�_�����n�J�s
   {
    if(session.getAttribute("Username")==null)
	{
	 String name=request.getParameter("Username");
	 session.setAttribute("Username",name);
	}
   %>
   <c:if test="${empty (sessionScope.Pasword)}" >
    <c:set var="Password" value="${param.Password}" scope="session" />
   </c:if>	
  <%	
   response.sendRedirect("http://hungmans6779.homeip.net/jsp/Ch8_3_2_1first.jsp");
   } //�P�_�O�_�����n�J�s
  %>
  <b><h2>�п�J�z���b���M�K�X</h2></b><hr>
  <form method="get" action="http://hungmans6779.homeip.net/jsp/Ch8_3_2_1.jsp">
   �m�W�G<input type="TEXT" name="Username" size="10"><br>
   �K�X�G<input type="PASSWORD" name="Password" size="10"><br>
   <input type="SUBMIT" name="Login" value="�n�J">
  </form>
 </body>
</html>