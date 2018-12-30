<!-- JavaScript Document -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>Ch3_6_11.jsp</title>
 </head>
 <body>
  <%
   double [] score={66.5,78.9,97.3,86.3,45.8,64.5};
   double total=0.0;
   for(int i=0;i<score.length;i++)
   {
	total+=score[i];
    out.print(score[i]+"/");
   }
   out.print("<br>成績總和為: "+total+"<br>");
   out.print("平均成績為: "+total/score.length+"<br>");
   out.print("名稱   密碼<br>");
   String [][] data={{"Joe","1234"},{"Jane","5678"},{"Tom","9876"}};
   for(String data1[]:data)
   {
    for(String value:data1)
	{
	 out.print(value+"\t");	
	}
	out.print("<br>");
   }
  %>
 </body>
</html>