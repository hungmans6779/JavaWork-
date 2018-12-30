<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_5_2.jsp程式</title>
 </head>
 <body>
  <b><h2>Cookie值</h2></b><hr />
  <%
   out.print("<b>request物件的getCookies方法</b><br>");
   Cookie cookies[]=request.getCookies();
   for(int i=0;i<cookies.length;i++)
   {
	Cookie myCookie=cookies[i];
	String name=myCookie.getName();
	String value=myCookie.getValue();
	if(name.equals("name"))
	 value=java.net.URLDecoder.decode(value);
	out.print("Cookies名稱："+name+"/"+"值："+value+"<br>");
   }
  %>
  <b>JSTL的cookie隱含物件：</b><br>
  <c:forEach var="item" items="${cookie}">
   <c:out value="Cookie名稱：${item.key} / 值：${item.value.value}" /><br>
  </c:forEach>
  
  <b>JSTL 取出指定的Cookie：</b><br>
  Cookie物件：${cookie["user.username"]}/${cookie["user.pass"]}<br>
  Cookie的名稱：${cookie["user.username"].name}/${cookie["user.pass"].name}<br>
  Cookie的值：${cookie["user.username"].value}/${cookie["user.pass"].value}<br>
 </body>
</html>