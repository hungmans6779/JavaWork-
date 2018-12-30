<%@ page contentType="text/html;charset=MS950" %>
<!-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> -->
<html> 
 <head> 
  <title> Ch5_1_1.jsp 程式 </title>
 </head>
 <body>
  <% 
   String str=" 第一個JSTL標籤的JSP程式";
   pageContext.setAttribute("title",str);
  %>
  <h1><c:out value="${title}" /></h1><hr>
  <c:set var="message" value="Hello World!" scope="page" />
  <font color="red"><c:out value="${message}" /></font><br>
  <font color="blue">${message}</font>
 </body>
</html>