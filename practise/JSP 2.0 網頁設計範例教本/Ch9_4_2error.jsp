<!-- JSP�{���GCh9_4_2error.jsp -->
<%@ page contentType="text/html; charset=MS950"
         isErrorPage="true"%>
<html>
<head><title>Ch9_4_2error.jsp</title></head>
<body>
<h2>HTTP���A�X404�����~�B�z����</h2><hr>
<b>���A�X :</b>
${requestScope["javax.servlet.error.status_code"]}
<br>
<b>URL���}:</b>
<code>${requestScope["javax.servlet.error.request_uri"]}</code>
<b>�䤣��!</b><br>
<%
String msg, name;
// ���o���~�T��
msg = (String) request.getAttribute("javax.servlet.error.message");
name= (String) request.getAttribute("javax.servlet.error.servlet_name");
%>
<b>���~�T��: </b><%=msg %><br>
<b>Servlet�W��: </b><%=name %><br>
</body>
</html>