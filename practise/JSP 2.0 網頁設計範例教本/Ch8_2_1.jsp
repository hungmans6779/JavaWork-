<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch8_2_1.jsp�{��</title>
 </head>
 <body>
  <b><h2>�s��application���ܼ�</h2></b><hr />
  <%
   int count=0;
   if(application.getAttribute("HitCount")!=null)
   {
	count=(Integer)application.getAttribute("HitCount");   
   }
   count++;
   application.setAttribute("HitCount",count);
  %>
  <font color="blue">�ثe�������p�Ƭ��G<font color="green"><%=count%></font><br>
  <c:if test="${empty applicationScope.WebName}" >
   <c:set var="WebName" value="�ڪ�JSP����" scope="application" />
  </c:if>
   �����W�١G<font color="red"><c:out value="${applicationScope.WebName}" /></font></font>
 </body>
</html>