<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch8_2_2.jsp�{��</title>
 </head>
 <body>
  <b><h2>���oapplication�ܼƪ���l��</h2></b><hr />
  <font color="blue">��l�p�ƪ��ѼƭȬO:<font color="red">
  <%=application.getInitParameter("Counter") %><br /></font>
  JSTL���X����l�ѼƭȬ��G<font color="green">${initParam.Counter}</font></font>
 </body>
</html>