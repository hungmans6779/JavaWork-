<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
 <head>
  <title>Ch6_6_2.jsp�{��</title>
 </head>
 <body>
  <b><h2><c:out value="<fmt:formatNumber>�P<fmt:parseNumber>���ҽd��" /></h2></b><hr />
  <b>type���ݩ�</b><br />
  <c:set var="amount" value="19.9512" />
  <c:out value="${amount}" />==>
  <fmt:formatNumber value="${amount}" type="currency"/>/
  <fmt:formatNumber value="${amount}" type="number" />/
  <fmt:formatNumber value="${amount}" type="percent" /><br />
  <b>maxIntegerDigits�PminIntegerDigits���ݩ�</b><br />
  <c:set var="total" value="299792458.345678" />
  <c:out value="${total}" />�̤j���7�A�̤p���3==>
  <fmt:formatNumber value="${total}" maxIntegerDigits="7" minIntegerDigits="3" />/
  <fmt:formatNumber value="${total}" groupingUsed="false" maxIntegerDigits="7" minIntegerDigits="3" /><br />
  <b>pattern���ݩ�</b><br />
  <c:out value="${total}" /> ==>
  <fmt:formatNumber value="${total}" pattern="##.##" />/
  <fmt:formatNumber value="${total}" pattern="###.#E0" />/
  <fmt:formatNumber value="${total}" pattern="-#.####" /><br />
  
  <b><c:out value="<fmt:parseNumber>���ҽd��" /></b><br />
  <c:set var="order" value="15.5" />
  <c:out value="${order}" />==>
  <fmt:parseNumber value="${order}" var="data" integerOnly="true" />
  <c:out value="${data}" />
 </body>
</html>