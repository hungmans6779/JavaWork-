<!-- JSP程式：Ch5_5_2.jsp -->
<%@ page contentType="text/html; charset=MS950"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Ch5_5_2.jsp</title>
</head>
<body>
1: ${pageContext.request.protocol}<br>
2: ${pageContext.request[protocol]}<br><!-- 此為屬性 -->
3: ${pageContext.request["protocol"]}<br>
4: ${pageContext.request.characterEncoding}<br>
5: ${pageContext.request["characterEncoding"]}<br>
6: ${pageContext["request"]["characterEncoding"]}<br>
7: ${pageContext["request"].protocol}<br>
<!-- 存取JavaBeans物件today的time和month屬性 -->
<jsp:useBean id="today" class="java.util.Date"/>
8: ${today}<br>
9: ${today.time}<br><!-- today.getTime() -->
10: ${today["month"]}<br><!-- today.getMonth() -->
<!-- 存取集合物件hmap的元素 -->
<% // 建立HashMap物件
java.util.HashMap hmap =
          new java.util.HashMap();
// 新增集合物件的元素
hmap.put("Joe", "陳會安");
hmap.put("Jane", "江小魚");
hmap.put("Tom", "張無忌");
hmap.put("Hueyan", "陳會安");
pageContext.setAttribute("nameMap", hmap);
pageContext.setAttribute("Name", "Joe");
%>
11: ${nameMap[Joe]}<br>
12: ${nameMap[Name]}<br><!-- Name是變數 -->
13: ${nameMap.Jane}<br>
14: ${nameMap["Tom"]}<br>
<!-- 存取陣列array的元素 -->
<% // 建立字串陣列
String[] array = {"JSP","ASP","PHP"};
pageContext.setAttribute("array", array);
%>
15: ${array[0]}<br>
16: ${array["1"]}<br>
<!-- 存取List集合物件的元素 -->
17: ${pageContext.request.cookies[0]}<br>
18: ${pageContext.request.cookies[0].name}<br>
19: ${pageContext.request.cookies[0].value}<br>
</body>
</html>