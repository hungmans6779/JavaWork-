<!-- JavaScript Document -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>Ch4_1_1.jsp程式</title>
  
 </head>
 <body>
  <%!
    String msg="";
    public void jspInit()
    {
	 msg="step1: 呼叫jspInit()方法";   
    }
    public void jspDestory()
    {
	 System.out.println("step3 : 呼叫jspDestory()方法");   
    }
  %>
 
  <%
   out.print(msg+"<br>");
   out.print("step2 : 呼叫_jspService()方法<br>");
  %>
 </body>
</html> 