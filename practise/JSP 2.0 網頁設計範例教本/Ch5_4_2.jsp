<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch5_4_2.jsp �{��</title>
 </head>
 <body>
  <font color="red">
   �a�}:[<c:out value="${address}" />]<br />
   �q��:[<c:out value="${param.tel}" />]<br />
  </font>
  <font color="blue">
   param.amount=${amount}<br />
   amount+5=${amount+5}<br />
  </font>
 </body>
</html>