<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_3_9.jsp程式</title>
 </head>
 <body>
 <b><h2>取得同名與複選值</h2></b><hr />
 <%
  String gifts[]=request.getParameterValues("Gifts");
  out.print("<b>request的getParameterValue方法</b><br>");
  out.print("語言：");
  for(int i=0;i<gifts.length;i++)
   out.print("["+gifts[i]+"]");	  
  out.print("<br>");
  String lang[]=request.getParameterValues("Languages");
  out.print("贈品：");
  for(int i=0;i<lang.length;i++)
   out.print("["+lang[i]+"]");
  out.print("<br>"); 
 %>
 <hr />
 語言：
 <c:forEach var="gifts" items="${paramValues.Gifts}">
  [<c:out value="${gifts}" />]
 </c:forEach> 
 <br>
 贈品：
 <c:forEach var="langs" items="${paramValues.Languages}">
  [<c:out value="${langs}" />]
 </c:forEach>
 </body>
</html>