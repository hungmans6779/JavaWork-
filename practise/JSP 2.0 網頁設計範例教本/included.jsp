<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title> included.jsp�{��</title>
 </head>
 <body>
  <%
  int row=Integer.parseInt(request.getParameter("rows"));
  int col=Integer.parseInt(request.getParameter("cols"));
  for(int i=1;i<=row;i++)
  {
   for(int j=1;j<=col;j++)
   {
	out.print(i*j+" ");   
   }
   out.print("<br>");
  }
   out.print("���յ���<br>");
  %>
 </body>
</html> 