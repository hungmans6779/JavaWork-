<%@ page contentType="text/html;charset=MS950" errorPage="Ch9_3error.jsp" %>
<html>
 <head>
  <title>Ch9_3.jsp�{��</title>
 </head>
 <body>
 <center><font color="blue">
  <%
   if(request.getParameter("InputAge")!=null)
   {
	int age;
	age=Integer.parseInt(request.getParameter("Age"));   
	out.print("��J���~�֡G "+age+" ��<br>");
   }
  
  %>
  </font>
  <b><h2>�п�J�ϥΪ̦~��</h2></b><hr />
  <form method="get" action="Ch9_3.jsp" >
   �~�֡G<input type="TEXT" name="Age" size="15" />
   <input type="SUBMIT" name="InputAge" value="��J" /><br />
  </form>
 </body>
</html>