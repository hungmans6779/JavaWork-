<%@ page contentType="text/html;charset=Big5" %>
<%@ page buffer="16kb" autoFlush="true" %>
<html>
 <head>
  <title>Ch4_61.jsp �{��</title>
 </head>
 <body>
  <p><font color="blue"><h2>out���󪺿�X�P�w�İϳB�z</h2></font></p>
  <hr>
  <font color="red">�ثe�w�İϸ�T...<br>
  <b>�w�İϤؤo:</b><%= out.getBufferSize() %><br>
  <b>�w�İϳѾl:</b><%= out.getRemaining() %><br>
  </font>
  <font color="green">��X1-20���_��:<br>
  <%
   out.flush();
   for(int i=1;i<=20;i++)
   {
	if(i%2==1)
	 out.print(i+" ");
	else
     continue;
   }
  %>
 </body>
</html>