<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch8_2_4.jsp程式</title>
 </head>
 <body>
  <b><h2>取得容器、檔案與路徑資訊</h2></b><hr>
  <b>取得容器的相關資訊</b><br>
  Servlet主版本：<%=application.getMajorVersion()%><br>
  Servlet次版本：<%=application.getMinorVersion()%><br>
  SERVER_SOFTWARE:<%=application.getServerInfo()%><br>
  <b>取得檔案與路徑資訊</b><br>
  檔案：<%=application.getMimeType("Ch6_5_3.txt")%><br>
  路徑：<%=application.getRealPath("/")%><br>
 </body>
</html>