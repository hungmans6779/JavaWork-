<!-- JSP�{���GCh5_5_2.jsp -->
<%@ page contentType="text/html; charset=MS950"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Ch5_5_2.jsp</title>
</head>
<body>
1: ${pageContext.request.protocol}<br>
2: ${pageContext.request[protocol]}<br><!-- �����ݩ� -->
3: ${pageContext.request["protocol"]}<br>
4: ${pageContext.request.characterEncoding}<br>
5: ${pageContext.request["characterEncoding"]}<br>
6: ${pageContext["request"]["characterEncoding"]}<br>
7: ${pageContext["request"].protocol}<br>
<!-- �s��JavaBeans����today��time�Mmonth�ݩ� -->
<jsp:useBean id="today" class="java.util.Date"/>
8: ${today}<br>
9: ${today.time}<br><!-- today.getTime() -->
10: ${today["month"]}<br><!-- today.getMonth() -->
<!-- �s�����X����hmap������ -->
<% // �إ�HashMap����
java.util.HashMap hmap =
          new java.util.HashMap();
// �s�W���X���󪺤���
hmap.put("Joe", "���|�w");
hmap.put("Jane", "���p��");
hmap.put("Tom", "�i�L��");
hmap.put("Hueyan", "���|�w");
pageContext.setAttribute("nameMap", hmap);
pageContext.setAttribute("Name", "Joe");
%>
11: ${nameMap[Joe]}<br>
12: ${nameMap[Name]}<br><!-- Name�O�ܼ� -->
13: ${nameMap.Jane}<br>
14: ${nameMap["Tom"]}<br>
<!-- �s���}�Carray������ -->
<% // �إߦr��}�C
String[] array = {"JSP","ASP","PHP"};
pageContext.setAttribute("array", array);
%>
15: ${array[0]}<br>
16: ${array["1"]}<br>
<!-- �s��List���X���󪺤��� -->
17: ${pageContext.request.cookies[0]}<br>
18: ${pageContext.request.cookies[0].name}<br>
19: ${pageContext.request.cookies[0].value}<br>
</body>
</html>