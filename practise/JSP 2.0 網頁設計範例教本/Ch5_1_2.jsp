<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>ch5_1_2.jsp�{��</title>
 </head>
 <body>
 <%
  int count=1;
  String file="copyright";
  pageContext.setAttribute("amount",count);
  pageContext.setAttribute("file",file);
 %>
 <c:set var="myName" value="�x�ŧ�" />
 <c:set var="user" value="Hung Chia Hung" />
 <h1>EL���ϥΪ�-<c:out value="${myName}" /></h1><hr>
 <font color="blue"><c:out value="[${myName}]���ϥΪ�:${user}"/><br /></font>
 amount=${amount}<br />
 amount+5=${amount+5}<br />
 <form>
  �m�W:<input type="text" name="Name" value=${myName} /><br /><hr />
 </form>
 <jsp:include page="${file}.jsp" flush="true" />
 </body>
</html>