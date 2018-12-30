<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
 <head>
  <title> Ch5_6.jsp �{��</title>
 </head>
 <body>
  <%
   pageContext.setAttribute("str1"," Copyright ");
   pageContext.setAttribute("str2","JSP 2.0�����s�@");
   pageContext.setAttribute("str3","<order>�ѻ� < 500 </order>");
   pageContext.setAttribute("str4","1/2/3/4");
   String [] list={"1","2","3"};
   pageContext.setAttribute("list",list);
  %>
  [${str1}]����:${fn:length(str1)}<br>
  [${str2}]����:${fn:length(str2)}<br>
  list�r��}�C��������:${fn:length(list)}<br>
  [${str1}]�אּ�p�g:${fn:toLowerCase(str1)}<br>
  [${str1}]�אּ�j�g:${fn:toUpperCase(str1)}<br>
  [${str1}]�R���ťզr��:${fn:trim(str1)}<br>
  [${str3}]�ഫ��XML�r��:[${fn:escapeXml(str3)}]<br>
  [${str2}]�O�_�O"S"�}�Y:${fn:startsWith(str2,"S")}<br>
  [${str2}]�O�_�O"�@"����:${fn:endsWith(str2,"�@")}<br>
  [${str1}]�O�_�]�t"right":${fn:contains(str1,"right")}<br>
  [${str1}]�O�_�]�t"right"�A�����j�p�g:${fn:containsIgnoreCase(str1,"right")}<br>
  [${str1}]�X�{"Right"����:${fn:indexOf(str1,"Right")}<br>
  [${str2}]�b"2.0"��:${fn:substringAfter(str2,"2.0")}<br>
  [${str2}]�b"2.0"�e:${fn:substringBefore(str2,"2.0")}<br>
  [${str2}]�q����4��7:${fn:substring(str2,4,7)}<br>
  �X��list�r��}�C:${fn:join(list,"-")}<br>
  [${str2}]���N2.0����"3.0":${fn:replace(str2,"2.0","3.0")}<br>
  [${str4}]�H"/"�r����ΰ}�C:
  <c:forEach var="ele" items='${fn:split(str4,"/")}'>
   "<c:out value="${ele}"/>"
  </c:forEach>
 </body>
</html>