<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_4_2first.jsp程式</title>
 </head>
 <body>
  <%
   String error="",name="",username="";
   if(request.getParameter("Error")!=null)
    error=request.getParameter("Error");
   if(request.getParameter("Name")!=null)
    name=request.getParameter("Name");
   if(request.getParameter("Username")!=null)
    username=request.getParameter("Username");
  %>
  <center>
  <b><h2>請使用者輸入您的資料</h2></b>
  <font color="red"><%= error %></font>
  </center>
  <hr />
  <form action="http://hungmans6779.homeip.net/jsp/Ch7_4_2next.jsp" method="post">
    姓名：<input type="TEXT" name="Name" size="10" value="<%=name%>"><br>
	<font color="red">*</font>帳號：<input type="TEXT" name="Username" size="10" value="<%=username%>"><br>
	<font color="red">*</font>請輸入密碼：<input type="PASSWORD" name="Password1" size="10"><br>
	<font color="red">*</font>請再輸入一次密碼:<input type="PASSWORD" name="Password2" size="10" /><br />
	<input type="SUBMIT" name="Register" value="註冊新使用者" />
  </form>
 </body>
</html>