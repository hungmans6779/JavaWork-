<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch5_4_2.jsp 程式</title>
 </head>
 <body>
  <font color="red">
   地址:[<c:out value="${address}" />]<br />
   電話:[<c:out value="${param.tel}" />]<br />
  </font>
  <font color="blue">
   param.amount=${amount}<br />
   amount+5=${amount+5}<br />
  </font>
 </body>
</html>