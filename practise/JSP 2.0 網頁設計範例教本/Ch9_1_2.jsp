<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch9_1_2.jsp程式</title>
 </head>
 <body>
  <%
   try
   {
    int result=0;
	int s=Integer.parseInt(request.getParameter("type"));
    for(int i=2;i>-1;i--)
    {
  	 result=6/i;
	 out.print("其值為："+result+"<br>");
    }
   }
   catch(ArithmeticException e)
   {
	out.print("例外原因："+e.toString()+"<br>");   
   }
   catch(NumberFormatException ne)
   {
	out.print("例外原因："+ne.toString()+"<br>");
   }
   finally
   {
	out.print("例外處理結束");   
   }
  %>
 </body>
</html>