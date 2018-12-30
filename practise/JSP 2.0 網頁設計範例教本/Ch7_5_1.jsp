<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_5_1.jsp程式</title>
 </head>
 <body>
 <b><h2>建立Cookis</h2></b><hr />
  <%
   String value=java.net.URLEncoder.encode("洪嘉宏");
   Cookie newcookie=new Cookie("name",value);
   newcookie.setMaxAge(3000);
   response.addCookie(newcookie);
   out.print("新增名為:"+newcookie.getName()+"的Cookis,其值為中文<br>");
   String cookieName[]={"user.username","user.pass","user.lastdate"};
   String cookieValue[]={"hueyan","1234","2005/9/15"};
   java.util.Date today=new java.util.Date();
   cookieValue[2]=(today.getYear()+1900)+"/"+(today.getMonth()+1)+"/"+(today.getDate());
   for(int i=0;i<cookieName.length;i++)
   {
	newcookie=new Cookie(cookieName[i],cookieValue[i]);
	newcookie.setMaxAge(3000);
	response.addCookie(newcookie);
	out.print("新增名為:"+cookieName[i]+"的Cookie<br>");
   }
   out.print("user.lastdate的值是日期資料");
  %>
 </body>
</html>