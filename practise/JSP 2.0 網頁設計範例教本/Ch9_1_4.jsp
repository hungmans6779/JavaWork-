<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch9_1_4.jsp�{��</title>
 </head>
 <body>
  <%!
   void test(double c) throws IllegalArgumentException
   {
	if(c==0)
	 throw new IllegalArgumentException("�Ѽ�c���ର0");
   }
  %>
  <%
   try
   {
	test(0);   
   }
   catch(IllegalArgumentException e)
   {
	out.print("�ҥ~����]�O�G"+e.toString()+"<br>");   
   }
   finally
   {
	out.print("�ҥ~�B�z����.....");   
   }
  %>
 </body>
</html>