<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title> Ch4_7_2.jsp </title>
 </head>
 <body>
  <font color="red"><h2>JSP���֨��B�z-response���t����</h2></font>
  <hr>
  <%
   String http=request.getProtocol();
   out.print("HTTP����:"+http+"<br>");
   if(http.equals("HTTP/1.0"))
   {
	response.setHeader("Pragma","no-cache");   
    out.print("1.0���֨��B�z�A�O�d�ɶ���0");
   }
   else
   {
	response.setHeader("Cache-Control","no-cache");
	out.print("1.1���֨��B�z�A�O�d�ɶ���0");
   }
   response.setDateHeader("Expirse",0);
  %>
 </body>
</html> 