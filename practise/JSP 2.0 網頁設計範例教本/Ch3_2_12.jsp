<!--�o�O�@��jsp���{�� -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>�o�Och3_2_1.jsp</title>
 </head>
 <body>
 <%! int from,to; %>
 <%
  //���w�ܼ�from�Mto����l��
  from=1;
  to=7;
  for(int i=from;i<=to;i++)
  { %>
  <font size=<%= i%>>
  <p>�o�O�@��jsp���{��</p>
  <%-- �o�O�Ψ���ܤ���M�ɶ�����k --%>
  �{�b�����/�ɶ�:<%=new java.util.Date() %>
  <hr> 
 <%}%>
 </body>
</html>  