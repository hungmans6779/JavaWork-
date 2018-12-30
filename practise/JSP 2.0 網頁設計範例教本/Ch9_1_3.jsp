<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch9_1_3.jsp程式</title>
 </head>
 <body>
  <%
   String str=request.getParameter("type");
   try
   {
    if(str==null)
     throw new ArithmeticException("值為0");
   }
   catch(ArithmeticException ae)
   {
	out.print("例外原因："+ae.toString()+"<br>");   
   }
   finally
   {
	out.print("例外處理結束");   
   }
  %>
 </body>
</html>