<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch9_1_2.jsp�{��</title>
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
	 out.print("��Ȭ��G"+result+"<br>");
    }
   }
   catch(ArithmeticException e)
   {
	out.print("�ҥ~��]�G"+e.toString()+"<br>");   
   }
   catch(NumberFormatException ne)
   {
	out.print("�ҥ~��]�G"+ne.toString()+"<br>");
   }
   finally
   {
	out.print("�ҥ~�B�z����");   
   }
  %>
 </body>
</html>