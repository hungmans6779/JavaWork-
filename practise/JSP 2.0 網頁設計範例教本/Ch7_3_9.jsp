<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_3_9.jsp�{��</title>
 </head>
 <body>
 <b><h2>���o�P�W�P�ƿ��</h2></b><hr />
 <%
  String gifts[]=request.getParameterValues("Gifts");
  out.print("<b>request��getParameterValue��k</b><br>");
  out.print("�y���G");
  for(int i=0;i<gifts.length;i++)
   out.print("["+gifts[i]+"]");	  
  out.print("<br>");
  String lang[]=request.getParameterValues("Languages");
  out.print("�ث~�G");
  for(int i=0;i<lang.length;i++)
   out.print("["+lang[i]+"]");
  out.print("<br>"); 
 %>
 <hr />
 �y���G
 <c:forEach var="gifts" items="${paramValues.Gifts}">
  [<c:out value="${gifts}" />]
 </c:forEach> 
 <br>
 �ث~�G
 <c:forEach var="langs" items="${paramValues.Languages}">
  [<c:out value="${langs}" />]
 </c:forEach>
 </body>
</html>