<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head> 
  <title>Ch8_3_3d.jsp程式</title>
 </head>
 <body>
  <%
   if(request.getParameter("Login")!=null)  //判斷是否有按下登入鈕
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
	 response.sendRedirect("http://hungmans6779.homeip.net/jsp/Ch8_3_3.jsp");
   
   } //判斷是否有按下登入鈕
  %>
  <b><h2>請輸入登入資料</h2></b><hr>
  <form method="post" action="Ch8_3_3d.jsp">
   帳號：<input type="TEXT" name="Username" size="10"><br>
   密碼：<input type="PASSWORD" name="Password" size="10"><br>
   <input type="SUBMIT" name="Login" value="登入">
  </form>
 </body>
</html>