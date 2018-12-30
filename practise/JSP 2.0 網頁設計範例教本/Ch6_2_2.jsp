<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch6_2_2.jsp 程式</title>
 </head>
 <body>
  <b><c:out value="<c:set> 標準範例" /></b><br>
  <hr>
  <b>var與value的屬性:</b><br>
  <c:set var="code" value="02" />
  <c:set var="number" value="12345678" />
  <c:set var="phone" value="(${code})-${number}" />
  電話號碼1:<c:out value="${phone}" /><br>
  <c:set var="number">
   02-22222222
  </c:set>
  電話號碼2:<c:out value="${number}" /><br>
  <b>scope屬性</b><br>
  <c:set var="msg1" value="JSP 2.0" />
  <c:set var="msg2" scope="session">
   <b>網頁設計徹底研究中心</b>
  </c:set>
  Page範圍變數msg1:<c:out value="${msg1}"/><br>
  Session範圍的變數msg2:<c:out value="${msg2}" /><br>
  <a href="Ch6_2_2next.jsp">檢視變數範圍的JSP程式</a><br>
  <b>target與property屬性</b><br>
  <jsp:useBean id="list" class="java.util.TreeMap" />
  <c:set target="${list}" property="Joe" value="陳會安" />
  <c:set target="${list}" property="Tom" value="張無忌" />
  Joe的姓名:<c:out value="${list['Joe']}" /><br>
  Tom的姓名:<c:out value="${list['Tom']}" /><br>
 </body>
</html>