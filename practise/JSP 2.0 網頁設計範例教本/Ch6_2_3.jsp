<!-- JSP程式：Ch6_2_3.jsp -->
<%@ page contentType="text/html; charset=MS950"%>
<%@ include file="JSTL.jsp" %>
<html>
<head><title>Ch6_2_3.jsp</title></head>
<body>
<b><c:out value="<c:remove>標籤範例"/></b>
<hr>
<c:set var="var1" value="var1-request" scope="request"/>
<c:set var="var1" value="var1-session" scope="session"/>
<c:set var="var1" value="var1-application" scope="application"/>
<c:set var="var2" value="var2-page"/>
<c:set var="var2" value="var2-application" scope="application"/>
var1 = [<c:out value="${var1}"/>]<br>
var2 = [<c:out value="${var2}"/>]<br>
<b>var屬性沒有scope屬性: 刪除var2</b><br>
<c:remove var="var2"/>
var1 = [<c:out value="${var1}"/>]<br>
var2 = [<c:out value="${var2}"/>]<br>
<b>scope屬性: 刪除Request範圍的var1</b><br>
<c:remove var="var1" scope="request"/>
var1 = [<c:out value="${var1}"/>]<br>
var2 = [<c:out value="${var2}"/>]<br>
</body>
</html>