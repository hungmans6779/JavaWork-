<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch7_5_3.jsp�{��</title>
 </head>
 <body>
  <%
   Cookie cookies[]=request.getCookies();
   for(int i=0;i<cookies.length;i++)
   {
	Cookie myCookie=cookies[i];
	myCookie.setMaxAge(0);
	response.addCookie(myCookie);
	out.print("�R���F"+myCookie.getName()+"��Cookie��....<br>");
	   
   }
  %>
 </body>
</html>