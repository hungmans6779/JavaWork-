<!-- JSP�{���GCh5_2_1.jsp -->
<%@ page contentType="text/html; charset=MS950"%>
<html>
<head>
<title>Ch5_2_1.jsp</title>
</head>
<body>
<% // JSP��Scriptlet
// �x�s��EL��page�d���ܼ�
pageContext.setAttribute("message", "���|�w");
pageContext.setAttribute("amount", 2);
pageContext.setAttribute("quantity", 1);
pageContext.setAttribute("price", 55.45);
%>
${ message }<br>
${ amount + 5 }<br>
${ 1 + 1 == 2 }<br>
${ 1 / 3 }<br>
${ quantity * price < 100.0 && amount == 2 }<br>
${ not empty param.name }<br>
${ pageContext.request.requestedSessionId }<br>
</font>
</body>
</html>