<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch8_2_4.jsp�{��</title>
 </head>
 <body>
  <b><h2>���o�e���B�ɮ׻P���|��T</h2></b><hr>
  <b>���o�e����������T</b><br>
  Servlet�D�����G<%=application.getMajorVersion()%><br>
  Servlet�������G<%=application.getMinorVersion()%><br>
  SERVER_SOFTWARE:<%=application.getServerInfo()%><br>
  <b>���o�ɮ׻P���|��T</b><br>
  �ɮסG<%=application.getMimeType("Ch6_5_3.txt")%><br>
  ���|�G<%=application.getRealPath("/")%><br>
 </body>
</html>