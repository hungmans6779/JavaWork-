<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch9_1_3.jsp�{��</title>
 </head>
 <body>
  <%
   String str=request.getParameter("type");
   try
   {
    if(str==null)
     throw new ArithmeticException("�Ȭ�0");
   }
   catch(ArithmeticException ae)
   {
	out.print("�ҥ~��]�G"+ae.toString()+"<br>");   
   }
   finally
   {
	out.print("�ҥ~�B�z����");   
   }
  %>
 </body>
</html>