<!-- JSP�{���GCh4_3_4.jsp -->
<html>
<head>
<title>Ch4_3_4.jsp</title>
</head>
<body>
<p><h1>�bJSP�{�����JJava Applet</h1></p>
<jsp:plugin type="applet" code="TestApplet.class"
            width="300" height="160">
   <jsp:params>
      <jsp:param name="Inc" value="20"/>
      <jsp:param name="Offset" value="25"/>
   </jsp:params>
   <jsp:fallback>���JJava Applet����....</jsp:fallback>
</jsp:plugin>
</body>
</html>