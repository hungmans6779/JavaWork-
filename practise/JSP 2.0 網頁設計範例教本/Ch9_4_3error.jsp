<!-- JSP�{���GCh9_4_3error.jsp -->
<%@ page contentType="text/html; charset=MS950"
         isErrorPage="true"%>
<html>
<head><title>Ch9_4_3error.jsp</title></head>
<body>
<h2>NullPointerException�����~�B�z����</h2><hr>
<b>���A�X :</b>
${requestScope["javax.servlet.error.status_code"]}<br>
<b>URL���}:</b><code>
${requestScope["javax.servlet.error.request_uri"]}
</code><br>
<b>���~�T��: </b>
${requestScope["javax.servlet.error.message"]}<br>
<b>Servlet�W��: </b>
[${requestScope["javax.servlet.error.servlet_name"]}]<br>
<%
Throwable e;
e = (Throwable) request.getAttribute("javax.servlet.error.exception");
%>
<b>Exception����:  </b><%= e.toString() %><br>
<b>�ҥ~�T��: </b><%=e.getMessage() %><br>
<b>���|���l�ܰT��: </b><br><small>
<%
// ��ܰ��|���l�ܰT��
e.printStackTrace(response.getWriter());
%>
</small>
</body>
</html>