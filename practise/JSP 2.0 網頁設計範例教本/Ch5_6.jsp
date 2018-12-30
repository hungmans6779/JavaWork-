<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
 <head>
  <title> Ch5_6.jsp 程式</title>
 </head>
 <body>
  <%
   pageContext.setAttribute("str1"," Copyright ");
   pageContext.setAttribute("str2","JSP 2.0網頁製作");
   pageContext.setAttribute("str3","<order>書價 < 500 </order>");
   pageContext.setAttribute("str4","1/2/3/4");
   String [] list={"1","2","3"};
   pageContext.setAttribute("list",list);
  %>
  [${str1}]長度:${fn:length(str1)}<br>
  [${str2}]長度:${fn:length(str2)}<br>
  list字串陣列的元素為:${fn:length(list)}<br>
  [${str1}]改為小寫:${fn:toLowerCase(str1)}<br>
  [${str1}]改為大寫:${fn:toUpperCase(str1)}<br>
  [${str1}]刪除空白字元:${fn:trim(str1)}<br>
  [${str3}]轉換成XML字元:[${fn:escapeXml(str3)}]<br>
  [${str2}]是否是"S"開頭:${fn:startsWith(str2,"S")}<br>
  [${str2}]是否是"作"結尾:${fn:endsWith(str2,"作")}<br>
  [${str1}]是否包含"right":${fn:contains(str1,"right")}<br>
  [${str1}]是否包含"right"，不分大小寫:${fn:containsIgnoreCase(str1,"right")}<br>
  [${str1}]出現"Right"索引:${fn:indexOf(str1,"Right")}<br>
  [${str2}]在"2.0"後:${fn:substringAfter(str2,"2.0")}<br>
  [${str2}]在"2.0"前:${fn:substringBefore(str2,"2.0")}<br>
  [${str2}]從索引4到7:${fn:substring(str2,4,7)}<br>
  合併list字串陣列:${fn:join(list,"-")}<br>
  [${str2}]取代2.0成為"3.0":${fn:replace(str2,"2.0","3.0")}<br>
  [${str4}]以"/"字串分割陣列:
  <c:forEach var="ele" items='${fn:split(str4,"/")}'>
   "<c:out value="${ele}"/>"
  </c:forEach>
 </body>
</html>