<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title> Ch5_2_3.jsp µ{¦¡</title>
 </head>
 <body>
  <c:set var="var1" value="var1-page" scope="page" />
  <c:set var="var1" value="var1-request" scope="request" />
  <c:set var="var1" value="var1-session" scope="session" />
  <c:set var="var1" value="var1-application" scope="application" />
  <c:set var="var2" value="var2-request" scope="request" />
  <c:set var="var2" value="var2-session" scope="session" />
  <c:set var="var2" value="var2-application" scope="application" />
  <c:set var="var3" value="var3-session" scope="session" />
  <c:set var="var3" value="var3-application" scope="application" />
  <c:set var="var4" value="var4-application" scope="application" />
  
  var1=[<c:out value="${var1}" />]<br />
  var2=[<c:out value="${var2}" />]<br />
  var3=[<c:out value="${var3}" />]<br />
  var4=[<c:out value="${var4}" />]<br />
  
  <%= pageContext.findAttribute("var1") %> -> <%= pageContext.findAttribute("var2") %> -> 
  <%= pageContext.findAttribute("var3") %> -> <%= pageContext.findAttribute("var4") %>;
 
 </body>
</html>