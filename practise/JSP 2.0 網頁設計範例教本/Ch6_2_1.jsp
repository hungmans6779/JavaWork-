<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="Jstl.jsp" %>
<html>
 <head>
  <title>Ch6_2_1.jsp程式</title>
 </head>
 <body>
  <%
   String str="<title>JSP2.0網頁設計</title>範例教材";
   pageContext.setAttribute("message",str);
  %>
  <b><c:out value="<c:out>標籤範例" /></b>
  <hr>
  <b>escapeXML屬性: 1. 為true，2. 為false</b><br>
  1: <c:out value="${message}" escapeXml="true"/><br>
  2: <c:out value="${message}" escapeXml="false"/><br>
  <b>defautl屬性指定預設值為"網頁設計":</b><br>
  3:JSP<c:out value="${param.name}" default="網頁設計" /> <br>
  4:<c:out value="${myName}">
    陳會安
	</c:out><br>
 </body>
</html>