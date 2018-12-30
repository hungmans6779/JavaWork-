<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>ch5_1_2.jsp程式</title>
 </head>
 <body>
 <%
  int count=1;
  String file="copyright";
  pageContext.setAttribute("amount",count);
  pageContext.setAttribute("file",file);
 %>
 <c:set var="myName" value="洪嘉宏" />
 <c:set var="user" value="Hung Chia Hung" />
 <h1>EL的使用者-<c:out value="${myName}" /></h1><hr>
 <font color="blue"><c:out value="[${myName}]的使用者:${user}"/><br /></font>
 amount=${amount}<br />
 amount+5=${amount+5}<br />
 <form>
  姓名:<input type="text" name="Name" value=${myName} /><br /><hr />
 </form>
 <jsp:include page="${file}.jsp" flush="true" />
 </body>
</html>