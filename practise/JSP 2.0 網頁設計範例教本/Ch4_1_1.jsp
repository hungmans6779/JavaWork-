<!-- JavaScript Document -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>Ch4_1_1.jsp�{��</title>
  
 </head>
 <body>
  <%!
    String msg="";
    public void jspInit()
    {
	 msg="step1: �I�sjspInit()��k";   
    }
    public void jspDestory()
    {
	 System.out.println("step3 : �I�sjspDestory()��k");   
    }
  %>
 
  <%
   out.print(msg+"<br>");
   out.print("step2 : �I�s_jspService()��k<br>");
  %>
 </body>
</html> 