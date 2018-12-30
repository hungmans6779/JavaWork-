<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_4_2next.jsp程式</title>
 </head>
 <body>
  <%
   String error="",msg="";
   String name=request.getParameter("Name");
   String username=request.getParameter("Username");
   String pass1=request.getParameter("Password1");
   String pass2=request.getParameter("Password2");
 
   if(username.length()==0)
   {
    error="帳號不得為空白<br>";
  %>
   <jsp:forward page="Ch7_4_2first.jsp">
     <jsp:param name="Error" value="<%=error%>"/>
     <jsp:param name="Name" value="<%=name%>"/>
     <jsp:param name="UserName" value="<%=username%>"/>
    </jsp:forward>
  <%
   }
   else
   {
    if(pass1.length()==0 || pass2.length()==0)
	{
	 error="密碼欄位不能為空白<br>";
	%>
	 <jsp:forward page="Ch7_4_2first.jsp">
      <jsp:param name="Error" value="<%=error%>" />
	  <jsp:param name="Name" value="<%=name%>" />
	  <jsp:param name="Username" value="<%=username%>" />
     </jsp:forward>
	<%
	}
	else
	{
	 if(!pass1.equals(pass2))
	 {
	  error="密碼不相同";
	 %>
	  <jsp:forward page="Ch7_4_2first.jsp">
       <jsp:param name="Error" value="<%=error%>" />
	   <jsp:param name="Name" value="<%=name%>" />
	   <jsp:param name="Username" value="<%=username%>" />
      </jsp:forward>
	 <%
	 }
	 else
	 {
	   // 表單處理, 顯示欄位輸入的資料
        msg += "姓名: " + name + "<br>";
        msg += "帳號: " + username + "<br>";
        msg += "密碼: " + pass1 + "<br>";	 
	 }
	}
   }
   // 顯示表單處理結果
   out.print(msg + "<br>");
  %> 
 </body>
</html>