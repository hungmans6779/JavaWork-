<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
   <title>Ch7_3_4.jsp程式</title>
  </head>
  <body>
   <b><h2>取得文字區域欄位值</h2></b><hr>
   <%
    String address=request.getParameter("Address");
	if(address!=null)
	{
	 out.print("<b>JSP的request物件的方法:</b><br>");
	 out.print("地址<br>");
	 out.print(address.replaceAll("\r\n","<br>")+"<br>");
	}
   %>
  <b>JSTL的param隱含物件</b><br>
  地址:<br>
  <c:out value="${param.Address}" default="無資料" />
  </body>
</html>