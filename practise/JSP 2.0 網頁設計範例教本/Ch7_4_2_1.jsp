<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_4_2_1.jsp�{��</title>
 </head>
 <body>
  <%
   String error="",msg=" ",name="",username="";
   boolean showForm=true; //true��ܪ�榳���~�Afalse�h��ܵL���~���e��
   //�P�_���O�_���Q�e�^
   if(request.getParameter("Register")!=null)
   {
	name=request.getParameter("Name");
	username=request.getParameter("Username");
	String pass1=request.getParameter("Password1");
	String pass2=request.getParameter("Password2");
	if(name.length()==0)
	{
	 error="�m�W�ť�!";
	}
	else
	{
	 if(username.length()==0)
	 {
	  error="�b���ťաI";	
	 }
	 else
	 {
      if(pass1.length()==0 && pass2.length()==0)
	  {
	   error="�K�X���ť�!"; 
	  }
	  else
	  {
	   if(pass1.equals(pass2))
	   {
	    showForm=false;
	    msg+="�m�W�G"+name+"<br>";
	    msg+="�b���G"+username+"<br>";
	    msg+="�K�X�G"+pass1+"<br>";
	   }
	   else
	   {
	    error="�Э��s��J�@���K�X!!!";  
	   }
	  }
	 }
    }
   }
   
   if(showForm)
   {
  %>
  <center>
  <b><h2>�ШϥΪ̿�J���</h2></b>
  <font color="red"><%=error %></font>
  </center>
  <hr>
  <form method="get" action="http://hungmans6779.homeip.net/jsp/Ch7_4_2_1.jsp">
   <font color="red">*</font>�m�W�G<input type="TEXT" name="Name" size="10" value="<%= name %>"><br>
   <font color="red">*</font>�b���G<input type="TEXT" name="Username" size="10" value="<%= username %>"><br>
   <font color="red">*</font>�п�J�K�X�G<input type="PASSWORD" name="Password1" size="10"><br>
   <font color="red">*</font>�A��J�@���K�X�G<input type="PASSWORD" name="Password2" size="10"><br>
   <input type="SUBMIT" name="Register" value="���U�s�b��">
  </form>
  <%
   }
   else
   {
	out.print("<b><h2>���H���U���\</h2></b><hr>"); 
	out.print(msg+"<br>");   
   }
  %> 
 </body>
</html>