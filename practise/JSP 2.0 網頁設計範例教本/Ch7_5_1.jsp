<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_5_1.jsp�{��</title>
 </head>
 <body>
 <b><h2>�إ�Cookis</h2></b><hr />
  <%
   String value=java.net.URLEncoder.encode("�x�ŧ�");
   Cookie newcookie=new Cookie("name",value);
   newcookie.setMaxAge(3000);
   response.addCookie(newcookie);
   out.print("�s�W�W��:"+newcookie.getName()+"��Cookis,��Ȭ�����<br>");
   String cookieName[]={"user.username","user.pass","user.lastdate"};
   String cookieValue[]={"hueyan","1234","2005/9/15"};
   java.util.Date today=new java.util.Date();
   cookieValue[2]=(today.getYear()+1900)+"/"+(today.getMonth()+1)+"/"+(today.getDate());
   for(int i=0;i<cookieName.length;i++)
   {
	newcookie=new Cookie(cookieName[i],cookieValue[i]);
	newcookie.setMaxAge(3000);
	response.addCookie(newcookie);
	out.print("�s�W�W��:"+cookieName[i]+"��Cookie<br>");
   }
   out.print("user.lastdate���ȬO������");
  %>
 </body>
</html>