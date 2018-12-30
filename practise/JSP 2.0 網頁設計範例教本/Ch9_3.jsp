<%@ page contentType="text/html;charset=MS950" errorPage="Ch9_3error.jsp" %>
<html>
 <head>
  <title>Ch9_3.jsp程式</title>
 </head>
 <body>
 <center><font color="blue">
  <%
   if(request.getParameter("InputAge")!=null)
   {
	int age;
	age=Integer.parseInt(request.getParameter("Age"));   
	out.print("輸入的年齡： "+age+" 歲<br>");
   }
  
  %>
  </font>
  <b><h2>請輸入使用者年齡</h2></b><hr />
  <form method="get" action="Ch9_3.jsp" >
   年齡：<input type="TEXT" name="Age" size="15" />
   <input type="SUBMIT" name="InputAge" value="輸入" /><br />
  </form>
 </body>
</html>