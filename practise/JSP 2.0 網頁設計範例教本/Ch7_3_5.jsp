<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch7_3_5.jsp�{��</title>
 </head>
 <body>
  <b><h2>���o�֨����������</h2></b><hr />
  <%
   out.print("<b>request��getParameter��k</b><br>");
   if(request.getParameter("Tel")!=null)
    out.print("�ϥιq�ܨӽT�{<br>");
   if(request.getParameter("Email")!=null)
    out.print("�ϥιq�l�l��ӽT�{<br>");
   if(request.getParameter("Fax")!=null)
    out.print("�ϥζǯu�ӽT�{<br>");
  %>
  <b><c:out value="JSTL��param���t����" /></b><br />
  <c:if test="${not empty param.Tel}" >
   �ϥιq�ܨӽT�{<br />
  </c:if>
  <c:if test="${not empty param.Email}">
   �ϥιq�l�l��ӽT�{<br />
  </c:if>
  <c:if test="${not empty param.Fax}">
   �ϥζǯu�ӽT�{<br />
  </c:if>
   
 </body>
</html>