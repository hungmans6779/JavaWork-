<%@page contentType="text/html;charset=MS950" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch8_3_2_1.jsp程式</title>
 </head>
 <body>
  <%
   if(request.getParameter("Login")!=null) //判斷是否有按登入鈕
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
   } //判斷是否有按登入鈕
  %>
  <b><h2>請輸入您的帳號和密碼</h2></b><hr>
  <form method="get" action="http://hungmans6779.homeip.net/jsp/Ch8_3_2_1.jsp">
   姓名：<input type="TEXT" name="Username" size="10"><br>
   密碼：<input type="PASSWORD" name="Password" size="10"><br>
   <input type="SUBMIT" name="Login" value="登入">
  </form>
 </body>
</html>