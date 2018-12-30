<!-- JSP程式：Ch9_4_3error.jsp -->
<%@ page contentType="text/html; charset=MS950"
         isErrorPage="true"%>
<html>
<head><title>Ch9_4_3error.jsp</title></head>
<body>
<h2>NullPointerException的錯誤處理網頁</h2><hr>
<b>狀態碼 :</b>
${requestScope["javax.servlet.error.status_code"]}<br>
<b>URL網址:</b><code>
${requestScope["javax.servlet.error.request_uri"]}
</code><br>
<b>錯誤訊息: </b>
${requestScope["javax.servlet.error.message"]}<br>
<b>Servlet名稱: </b>
[${requestScope["javax.servlet.error.servlet_name"]}]<br>
<%
Throwable e;
e = (Throwable) request.getAttribute("javax.servlet.error.exception");
%>
<b>Exception物件:  </b><%= e.toString() %><br>
<b>例外訊息: </b><%=e.getMessage() %><br>
<b>堆疊的追蹤訊息: </b><br><small>
<%
// 顯示堆疊的追蹤訊息
e.printStackTrace(response.getWriter());
%>
</small>
</body>
</html>