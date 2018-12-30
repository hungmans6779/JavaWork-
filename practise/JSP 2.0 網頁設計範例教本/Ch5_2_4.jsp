<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html> 
 <head>
  <title> Ch5_2_4.jsp µ{¦¡</title>
 </head>
 <body>
  true:[<c:out value="${true}" />]<br />
  8899:[<c:out value="${8899}" />]<br />
  -2:[<c:out value="${-2}" />]<br />
  +4:[<c:out value="${+4}" />]<br />
  2435:[<c:out value="${2435}" />]<br />
  1.54:[c:out value="${1.54}" />]<br />
  3.1415926:[<c:out value="${3.1415926}" />]<br />
  2.34e9:[<c:out value="${2.34e9}" />]<br />
  -2.0e-3:[<c:out value="${-2.0e-3}" />]<br /> 
  'Hello World':[<c:out value="${'Hello World'}" />]<br>
  "Hello World":[<c:out value='${"Hello World"}' />]<br>
  "Joe\'s notes":[<c:out value='${"Joe\'s notes"}' />]<br />
  null:[<c:out value="${null}" />]<br />
 </body>
</html>