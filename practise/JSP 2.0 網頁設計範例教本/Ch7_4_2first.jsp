<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_4_2first.jsp�{��</title>
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
  <b><h2>�ШϥΪ̿�J�z�����</h2></b>
  <font color="red"><%= error %></font>
  </center>
  <hr />
  <form action="http://hungmans6779.homeip.net/jsp/Ch7_4_2next.jsp" method="post">
    �m�W�G<input type="TEXT" name="Name" size="10" value="<%=name%>"><br>
	<font color="red">*</font>�b���G<input type="TEXT" name="Username" size="10" value="<%=username%>"><br>
	<font color="red">*</font>�п�J�K�X�G<input type="PASSWORD" name="Password1" size="10"><br>
	<font color="red">*</font>�ЦA��J�@���K�X:<input type="PASSWORD" name="Password2" size="10" /><br />
	<input type="SUBMIT" name="Register" value="���U�s�ϥΪ�" />
  </form>
 </body>
</html>