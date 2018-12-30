<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title> Ch4_7_2.jsp </title>
 </head>
 <body>
  <font color="red"><h2>JSP的快取處理-response隱含物件</h2></font>
  <hr>
  <%
   String http=request.getProtocol();
   out.print("HTTP版本:"+http+"<br>");
   if(http.equals("HTTP/1.0"))
   {
	response.setHeader("Pragma","no-cache");   
    out.print("1.0版快取處理，保留時間為0");
   }
   else
   {
	response.setHeader("Cache-Control","no-cache");
	out.print("1.1版快取處理，保留時間為0");
   }
   response.setDateHeader("Expirse",0);
  %>
 </body>
</html> 