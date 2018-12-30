<!-- JSP程式：Ch4_3_4.jsp -->
<html>
<head>
<title>Ch4_3_4.jsp</title>
</head>
<body>
<p><h1>在JSP程式插入Java Applet</h1></p>
<jsp:plugin type="applet" code="TestApplet.class"
            width="300" height="160">
   <jsp:params>
      <jsp:param name="Inc" value="20"/>
      <jsp:param name="Offset" value="25"/>
   </jsp:params>
   <jsp:fallback>載入Java Applet失敗....</jsp:fallback>
</jsp:plugin>
</body>
</html>