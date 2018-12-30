<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_3_8.jsp程式</title>
 </head>
 <body>
  <b><h2>取得隱藏欄位值</h2></b><hr />
  <%
   String name=request.getParameter("Name");
   String order=request.getParameter("Order");
   if(name!=null && order!=null)
   {
	out.print("<b>request的getParameter方法</b><br>");   
	out.print("姓    名:"+name+"<br>");
	out.print("訂單編號:"+order+"<br>");
   }
  %>
  <b>JSTL的param隱含物件</b><br />
  姓    名：<c:out value="${param.Name}" default="無姓名" /><br />
  訂單編號：<c:out value="${param.Order}" default="無編號" /><br />
 </body>
</html>