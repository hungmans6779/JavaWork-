<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_3_5.jsp程式</title>
 </head>
 <body>
  <b><h2>取得核取方塊的欄位值</h2></b><hr />
  <%
   out.print("<b>request的getParameter方法</b><br>");
   if(request.getParameter("Tel")!=null)
    out.print("使用電話來確認<br>");
   if(request.getParameter("Email")!=null)
    out.print("使用電子郵件來確認<br>");
   if(request.getParameter("Fax")!=null)
    out.print("使用傳真來確認<br>");
  %>
  <b><c:out value="JSTL的param隱含物件" /></b><br />
  <c:if test="${not empty param.Tel}" >
   使用電話來確認<br />
  </c:if>
  <c:if test="${not empty param.Email}">
   使用電子郵件來確認<br />
  </c:if>
  <c:if test="${not empty param.Fax}">
   使用傳真來確認<br />
  </c:if>
   
 </body>
</html>