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
   out.print("<br>���Z�`�M��: "+total+"<br>");
   out.print("�������Z��: "+total/score.length+"<br>");
   out.print("�W��   �K�X<br>");
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