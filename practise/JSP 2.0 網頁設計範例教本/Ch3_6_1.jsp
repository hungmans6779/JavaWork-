<!-- JavaScript Document -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>Ch3_6_1.jsp</title>
 </head>
 <body>
  <%
   double [] score=new double[]{66.5,78.9,97.3,86.3,45.8,64.5};
   double total=0.0;
   for(int i=0;i<score.length;i++)
   {
	total+=score[i];
    out.print(score[i]+"/");
   }
   out.print("<br>���Z�`�M��: "+total+"<br>");
   out.print("�������Z��: "+total/score.length+"<br>");
   out.print("�W��   �K�X<br>");
   String [][] data=new String[3][];
   for(int i=0;i<data.length;i++)
    data[i]=new String[2];
   data[0][0]="Joe";
   data[0][1]="1234";
   data[1][0]="Jane";
   data[1][1]="5678";
   data[2][0]="Tom";
   data[2][1]="9876";
   for(int i=0;i<data.length;i++)
   {
    for(int j=0;j<data[i].length;j++)
	{
	 out.print(data[i][j]+"  ");
	}
	out.print("<br>");
   }	
  %>
 </body>
</html>