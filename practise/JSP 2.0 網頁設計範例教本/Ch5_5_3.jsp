<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch5_5_3.jsp �{��</title>
 </head>
 <body>
  <%
   response.setHeader("Cache-Control","no-cache");
  %>
  <font color="red"><h2>EL��pageContext���ݩ�</h2></font>
  request:${pageContext.request}<br>
  response:${pageContext.response}<br>
  servletConfig:${pageContext.servletConfig}<br>
  servletContext:${pageContext.servletContext}<br>
  session:${pageContext.session}<br>
  <hr>
  <font color="blue"><h3>pageContext.request�������ݩ�</h3></font>
  characterEncoding:${pageContext.request.characterEncoding}<br>
  locale:${pageContext.request.locale}<br>
  method:${pageContext.request.method}<br>
  protocol:${pageContext.request.protocol}<br>
  remoteAddr:${pageContext.request.remoteAddr}<br>
  remoteHost:${pageContext.request.remoteHost}<br>
  serverName:${pageContext.request.serverName}<br>
  serverPort:${pageContext.request.serverPort}<br>
  secure:${pageContext.request.secure}<br>
  <hr>
  
  <font color="yellow"><h3>pageContext.response�������ݩ�</h3></font>
  characterEncoding:${pageContext.response.characterEncoding}<br>
  locale:${pageContext.response.locale}<br>
  bufferSize:${pageContext.response.bufferSize}<br>
  committed:${pageContext.response.committed}<br>
  <hr>
  
  <font color="#990000"><h3>pageContext.servletContext�������ݩ�</h3></font>
  majorVersion:${pageContext.servletContext.majorVersion}<br>
  minorVersion:${pageContext.servletContext.minorVersion}<br>
  serverInfo:${pageContext.servletContext.serverInfo}<br>
  <hr>
  
  <font color="#66FF66"><h3>pageContext.session�������ݩ�</h3></font>
  new:${pageContext.session.new}<br>
  id:${pageContext.session.id}<br>
  <hr>
 </body>
</html>