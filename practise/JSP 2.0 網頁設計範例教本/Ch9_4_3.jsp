<!-- JSP�{���GCh9_4_3.jsp -->
<%@ page contentType="text/html; charset=MS950"%>
<html>
<head><title>Ch9_4_3.jsp</title></head>
<body>
<h2>���w�ҥ~���󪺿��~�B�z</h2><hr>
<%
String str = request.getParameter("type");
if ( str == null )
   throw new NullPointerException("����null��!");
%>
</body>
</html>