<!-- JSP程式：Ch9_4_2error.jsp -->
<%@ page contentType="text/html; charset=MS950"
         isErrorPage="true"%>
<html>
<head><title>Ch9_4_2error.jsp</title></head>
<body>
<h2>HTTP狀態碼404的錯誤處理網頁</h2><hr>
<b>狀態碼 :</b>
${requestScope["javax.servlet.error.status_code"]}
<br>
<b>URL網址:</b>
<code>${requestScope["javax.servlet.error.request_uri"]}</code>
<b>找不到!</b><br>
<%
String msg, name;
// 取得錯誤訊息
msg = (String) request.getAttribute("javax.servlet.error.message");
name= (String) request.getAttribute("javax.servlet.error.servlet_name");
%>
<b>錯誤訊息: </b><%=msg %><br>
<b>Servlet名稱: </b><%=name %><br>
</body>
</html>