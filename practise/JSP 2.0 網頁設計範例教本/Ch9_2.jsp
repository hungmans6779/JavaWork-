<!-- JSP�{���GCh9_2.jsp -->
<%@ page contentType="text/html; charset=MS950"%>
<%@ include file="JSTL.jsp" %>
<html>
<head><title>Ch9_2.jsp</title></head>
<body>
<h2>JSTL���ҥ~�B�z����</h2><hr>
<!-- JSTL�����~�B�z����<c:catch> -->
<c:catch var="e">
<!-- ���H�r�ꪺ�ҥ~ -->
<c:set var="x" value="5"/>
<c:set var="y" value="This is a book."/>
x/y = <c:out value="${x/y}"/><br>
</c:catch>
<!-- �ˬd�O�_���ҥ~ -->
<c:if test="${ e != null }">
   <!-- ���ҥ~ -->
   �ҥ~��]: <c:out value="${e}"/><br>
</c:if>
<c:if test="${ e == null }">
   <!-- �S���ҥ~ -->
   JSP�{���èS�����ͨҥ~<br>
</c:if>
</body>
</html>