<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_2next.jsp程式</title>
 </head>
 <body>
  <b><h2>取得URL傳遞的參數值</h2></b><hr>
  <%
   String username=request.getParameter("Username");
   String password=request.getParameter("Password");
   if(username!=null && password!=null)
   {
    out.print("<b>request物件的方法</b><br>");
    out.print("使用者名稱:"+username+"<br>");
    out.print("使用者密碼:"+password+"<br>");
   }
  %>
  <b><c:out value="JSTL的param隱含物件" /></b><br>
  使用者名稱:<c:out value="${param.Username}" default="無名稱" /><br>
  使用者密碼:<c:out value="${param.Password}" default="無密碼" /><br>
 </body>
</html>