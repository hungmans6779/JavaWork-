<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch6_2_2.jsp �{��</title>
 </head>
 <body>
  <b><c:out value="<c:set> �зǽd��" /></b><br>
  <hr>
  <b>var�Pvalue���ݩ�:</b><br>
  <c:set var="code" value="02" />
  <c:set var="number" value="12345678" />
  <c:set var="phone" value="(${code})-${number}" />
  �q�ܸ��X1:<c:out value="${phone}" /><br>
  <c:set var="number">
   02-22222222
  </c:set>
  �q�ܸ��X2:<c:out value="${number}" /><br>
  <b>scope�ݩ�</b><br>
  <c:set var="msg1" value="JSP 2.0" />
  <c:set var="msg2" scope="session">
   <b>�����]�p������s����</b>
  </c:set>
  Page�d���ܼ�msg1:<c:out value="${msg1}"/><br>
  Session�d���ܼ�msg2:<c:out value="${msg2}" /><br>
  <a href="Ch6_2_2next.jsp">�˵��ܼƽd��JSP�{��</a><br>
  <b>target�Pproperty�ݩ�</b><br>
  <jsp:useBean id="list" class="java.util.TreeMap" />
  <c:set target="${list}" property="Joe" value="���|�w" />
  <c:set target="${list}" property="Tom" value="�i�L��" />
  Joe���m�W:<c:out value="${list['Joe']}" /><br>
  Tom���m�W:<c:out value="${list['Tom']}" /><br>
 </body>
</html>