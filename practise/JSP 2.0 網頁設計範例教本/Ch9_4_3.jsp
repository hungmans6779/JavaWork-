<!-- JSP程式：Ch9_4_3.jsp -->
<%@ page contentType="text/html; charset=MS950"%>
<html>
<head><title>Ch9_4_3.jsp</title></head>
<body>
<h2>指定例外物件的錯誤處理</h2><hr>
<%
String str = request.getParameter("type");
if ( str == null )
   throw new NullPointerException("物件為null值!");
%>
</body>
</html>