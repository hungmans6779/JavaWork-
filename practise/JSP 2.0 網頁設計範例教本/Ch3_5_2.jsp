<!--JavaScript Document-->
<%--�{��Ch3_5_2.jsp --%>
<html>
 <head>
  <title>�o�O�{��Ch3_5_2.jsp</title>
 </head>
 <body>
  <%
   int age=35;
   char grade='B';
   out.print("�~�֬�:"+age+"<br>");
   if(age<=18)
    out.print("�ൣ��:12��<br>");
	else if(age>=65)
	 out.print("�q�Ѳ�:8��<br>");
	else
	 out.print("���q��:15��<br>");
	 
	out.print("GPA���Z:"+grade+"<br>");
	switch(grade)
	{
	 case 'A': out.print("�ǥͪ����Z��80���H�W<br>"); break;
	 case 'B': out.print("�ǥͪ����Z�b70-79��<br>"); break;
	 case 'C': out.print("�ǥͪ����Z�b60-69��<br>"); break;
	 default: out.print("�ǥͪ����Z���ή�<br>"); break;
	}
  %>
 </body>
</html>