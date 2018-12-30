<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_4_2_1.jsp程式</title>
 </head>
 <body>
  <%
   String error="",msg=" ",name="",username="";
   boolean showForm=true; //true表示表單有錯誤，false則顯示無錯誤的畫面
   //判斷表單是否有被送回
   if(request.getParameter("Register")!=null)
   {
	name=request.getParameter("Name");
	username=request.getParameter("Username");
	String pass1=request.getParameter("Password1");
	String pass2=request.getParameter("Password2");
	if(name.length()==0)
	{
	 error="姓名空白!";
	}
	else
	{
	 if(username.length()==0)
	 {
	  error="帳號空白！";	
	 }
	 else
	 {
      if(pass1.length()==0 && pass2.length()==0)
	  {
	   error="密碼欄位空白!"; 
	  }
	  else
	  {
	   if(pass1.equals(pass2))
	   {
	    showForm=false;
	    msg+="姓名："+name+"<br>";
	    msg+="帳號："+username+"<br>";
	    msg+="密碼："+pass1+"<br>";
	   }
	   else
	   {
	    error="請重新輸入一次密碼!!!";  
	   }
	  }
	 }
    }
   }
   
   if(showForm)
   {
  %>
  <center>
  <b><h2>請使用者輸入資料</h2></b>
  <font color="red"><%=error %></font>
  </center>
  <hr>
  <form method="get" action="http://hungmans6779.homeip.net/jsp/Ch7_4_2_1.jsp">
   <font color="red">*</font>姓名：<input type="TEXT" name="Name" size="10" value="<%= name %>"><br>
   <font color="red">*</font>帳號：<input type="TEXT" name="Username" size="10" value="<%= username %>"><br>
   <font color="red">*</font>請輸入密碼：<input type="PASSWORD" name="Password1" size="10"><br>
   <font color="red">*</font>再輸入一次密碼：<input type="PASSWORD" name="Password2" size="10"><br>
   <input type="SUBMIT" name="Register" value="註冊新帳號">
  </form>
  <%
   }
   else
   {
	out.print("<b><h2>恭禧註冊成功</h2></b><hr>"); 
	out.print(msg+"<br>");   
   }
  %> 
 </body>
</html>