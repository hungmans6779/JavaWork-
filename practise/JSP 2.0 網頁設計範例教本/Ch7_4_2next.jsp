<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_4_2next.jsp�{��</title>
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
    error="�b�����o���ť�<br>";
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
	 error="�K�X��줣�ର�ť�<br>";
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
	  error="�K�X���ۦP";
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
	   // ���B�z, �������J�����
        msg += "�m�W: " + name + "<br>";
        msg += "�b��: " + username + "<br>";
        msg += "�K�X: " + pass1 + "<br>";	 
	 }
	}
   }
   // ��ܪ��B�z���G
   out.print(msg + "<br>");
  %> 
 </body>
</html>