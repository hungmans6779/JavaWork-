<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch8_2_1.jsp程式</title>
 </head>
 <body>
  <b><h2>存取application的變數</h2></b><hr />
  <%
   int count=0;
   if(application.getAttribute("HitCount")!=null)
   {
	count=(Integer)application.getAttribute("HitCount");   
   }
   count++;
   application.setAttribute("HitCount",count);
  %>
  <font color="blue">目前網站的計數為：<font color="green"><%=count%></font><br>
  <c:if test="${empty applicationScope.WebName}" >
   <c:set var="WebName" value="我的JSP網站" scope="application" />
  </c:if>
   網站名稱：<font color="red"><c:out value="${applicationScope.WebName}" /></font></font>
 </body>
</html>