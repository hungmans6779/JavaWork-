<!--JavaScript Document-->
<%--程式Ch3_5_2.jsp --%>
<html>
 <head>
  <title>這是程式Ch3_5_2.jsp</title>
 </head>
 <body>
  <%
   int age=35;
   char grade='B';
   out.print("年齡為:"+age+"<br>");
   if(age<=18)
    out.print("兒童票:12元<br>");
	else if(age>=65)
	 out.print("敬老票:8元<br>");
	else
	 out.print("普通票:15元<br>");
	 
	out.print("GPA成績:"+grade+"<br>");
	switch(grade)
	{
	 case 'A': out.print("學生的成績為80分以上<br>"); break;
	 case 'B': out.print("學生的成績在70-79分<br>"); break;
	 case 'C': out.print("學生的成績在60-69分<br>"); break;
	 default: out.print("學生的成績不及格<br>"); break;
	}
  %>
 </body>
</html>