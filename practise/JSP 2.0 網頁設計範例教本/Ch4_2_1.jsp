<%@ page contentType="text/html;charset=Big5" %>
<%@ page language="java" import="java.util.*" %>
<html>
 <head>
  <title>Ch4_2_1.jsp�{��</title>
 </head>
 <body>
  <font color="blue">
  <%
   Date today=new Date();
   out.print("���Ѫ����/�ɶ�:"+new Date()+"<br>");
   out.print("���Ѫ����:"+(today.getYear()+1900)+"/"+(today.getMonth()+1)+"/"+today.getDate()+"<br>");
   out.print("���ѬO�P��:"+today.getDay()+"<br>");
  %>
  </font>
  <font color="red">
  ���Ѫ����/�ɶ�:<%= new Date() %><br />
 </body>
</html>