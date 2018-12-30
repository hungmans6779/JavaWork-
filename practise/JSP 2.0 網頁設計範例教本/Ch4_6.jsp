<%@ page contentType="text/html;charset=Big5" %>
<%@ page buffer="16kb" autoFlush="true" %>
<html>
 <head>
  <title>Ch4_6.jsp 程式</title>
 </head>
 <body>
  <p><font color="blue"><h2>out物件的輸出與緩衝區處理</h2></font></p>
  <hr>
  <font color="red">目前緩衝區資訊...<br>
  <b>緩衝區尺寸:</b><%= out.getBufferSize() %><br>
  <b>緩衝區剩餘:</b><%= out.getRemaining() %><br>
  </font>
  <font color="green">輸出1-20的奇數:<br>
  <%
   out.flush();
   for(int i=1;i<=20;i++)
   {
	out.print(i+" ");   
	if(i%2==1)
	 out.flush();
	else
	 out.clearBuffer();
   }
  %>
 </body>
</html>