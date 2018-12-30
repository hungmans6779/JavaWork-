<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch9_1_4.jsp程式</title>
 </head>
 <body>
  <%!
   void test(double c) throws IllegalArgumentException
   {
	if(c==0)
	 throw new IllegalArgumentException("參數c不能為0");
   }
  %>
  <%
   try
   {
	test(0);   
   }
   catch(IllegalArgumentException e)
   {
	out.print("例外的原因是："+e.toString()+"<br>");   
   }
   finally
   {
	out.print("例外處理結束.....");   
   }
  %>
 </body>
</html>