<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch8_4_2.jsp程式</title>
 </head>
 <body>
  <b><h2>將HTTP的請求轉到其它的JSP程式</h2></b><hr />
  <%
   int i=Integer.parseInt(request.getParameter("type"));
   if(i==1)
    pageContext.forward("Ch8_3_3.jsp");
   else
    pageContext.include("Ch8_3_3.jsp");
  %>
 
 </body>
</html>