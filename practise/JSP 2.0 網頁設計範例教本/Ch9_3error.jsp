<%@ page contentType="text/html;charset=MS950" isErrorPage="true"%>
<html>
 <head>
  <title>Ch9_3error.jsp�{��</title>
 </head>
 <body>
  <b><h2>JSP�����~�B�z����</h2></b><hr />
  <b>Exeption����G</b><%=exception%><br>
  <b>�ҥ~�T���G</b><%=exception.getMessage()%><br>
  <b>���|���l�ܰT���G</b><br>
  <small>
   <%
    exception.printStackTrace(response.getWriter());
   %>
  </small>
 </body>
</html>