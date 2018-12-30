<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_6_2.jspµ{¦¡</title>
 </head>
 <body>
  AUTO_TYPE=<%=request.getAuthType()%><br />
  CONTENT_LENGTH=<%=request.getContentLength()%><br />
  CONTENT_TYPE=<%=request.getContentType()%><br />
  PATH_INFO=<%=request.getPathInfo()%><br />
  PATH_TRANSLATED=<%=request.getPathTranslated()%><br />
  QUERY_STRING=<%=request.getQueryString()%><br />
  REMOTE_ADDR=<%=request.getRemoteAddr()%><br />
  REMOTE_HOST=<%=request.getRemoteHost()%><br />
  REQUEST_METHOD=<%=request.getMethod()%><br />
  SERVLET_PATH=<%=request.getServletPath()%><br />
  SERVER_NAME=<%=request.getServerName()%><br />
  SERVER_PORT=<%=request.getServerPort()%><br />
  SERVER_PROTOCOL=<%=request.getProtocol()%><br />
  <hr />
  Encoding=<%=request.getCharacterEncoding()%><br />
  REQUESTEDSESSIONID=<%=request.getRequestedSessionId()%><br />
  REQUESTURI=<%=request.getRequestURI()%>
 </body>
</html>