<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_5_2.jsp�{��</title>
 </head>
 <body>
  <b><h2>Cookie��</h2></b><hr />
  <%
   out.print("<b>request����getCookies��k</b><br>");
   Cookie cookies[]=request.getCookies();
   for(int i=0;i<cookies.length;i++)
   {
	Cookie myCookie=cookies[i];
	String name=myCookie.getName();
	String value=myCookie.getValue();
	if(name.equals("name"))
	 value=java.net.URLDecoder.decode(value);
	out.print("Cookies�W�١G"+name+"/"+"�ȡG"+value+"<br>");
   }
  %>
  <b>JSTL��cookie���t����G</b><br>
  <c:forEach var="item" items="${cookie}">
   <c:out value="Cookie�W�١G${item.key} / �ȡG${item.value.value}" /><br>
  </c:forEach>
  
  <b>JSTL ���X���w��Cookie�G</b><br>
  Cookie����G${cookie["user.username"]}/${cookie["user.pass"]}<br>
  Cookie���W�١G${cookie["user.username"].name}/${cookie["user.pass"].name}<br>
  Cookie���ȡG${cookie["user.username"].value}/${cookie["user.pass"].value}<br>
 </body>
</html>