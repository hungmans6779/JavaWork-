<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="Jstl.jsp" %>
<html>
 <head>
  <title>Ch6_2_1.jsp�{��</title>
 </head>
 <body>
  <%
   String str="<title>JSP2.0�����]�p</title>�d�ұЧ�";
   pageContext.setAttribute("message",str);
  %>
  <b><c:out value="<c:out>���ҽd��" /></b>
  <hr>
  <b>escapeXML�ݩ�: 1. ��true�A2. ��false</b><br>
  1: <c:out value="${message}" escapeXml="true"/><br>
  2: <c:out value="${message}" escapeXml="false"/><br>
  <b>defautl�ݩʫ��w�w�]�Ȭ�"�����]�p":</b><br>
  3:JSP<c:out value="${param.name}" default="�����]�p" /> <br>
  4:<c:out value="${myName}">
    ���|�w
	</c:out><br>
 </body>
</html>