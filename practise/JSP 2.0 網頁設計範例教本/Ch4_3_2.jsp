<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>Ch4_3_2.jsp�{��</title>
 </head>
 <body>
  <p><h1>����include�ʧ@����</h1></p>
  <%! String file="copyright.jsp"; %>
  <%
   out.print("����include ���Jincluded.jsp....<br>");
  %>
  <jsp:include page="included.jsp" flush="true">
   <jsp:param name="rows" value="4" />
   <jsp:param name="cols" value="6" />
  </jsp:include>
  <jsp:include page="<%=file %>" flush="true"/>
 </body>
</html>