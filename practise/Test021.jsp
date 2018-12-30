<?xml version="1.0" encoding="Big5" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" 
          xmlns:c="http://java.sun.com/jstl/core" version="1.2" >
<jsp:directive.page contentType="text/html;charset=MS950" />
<html>
 <head>
  <title>Test021.jsp</title>
 </head>
 <jsp:declaration>
  int pageCount=0;
 </jsp:declaration>
 <body>
  <c:set var="message" value="建立JSP2.0文件" />
  <c:out value="${message}" /><br/>
  <jsp:expression>pageContent.findAttribute("message")</jsp:expression><br/>
  <jsp:useBean id="today" class="java.util.Date" />
  <c:out value="${today}"/><br/>
  <jsp:scriptlet>
   int count=0;
   pageCount++;
   count++;
  </jsp:scriptlet>
  <p>存取JSP程式計數器<jsp:expression>pageCount</jsp:expression></p>
  <p>存取區域變數<jsp:expression>count</jsp:expression></p>
 </body>
</html>          
</jsp:root>