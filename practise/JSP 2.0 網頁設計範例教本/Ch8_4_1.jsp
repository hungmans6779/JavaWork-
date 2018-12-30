<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<html>
 <head>
  <title>Ch8_4_1.jsp程式</title>
 </head>
 <body>
  <b><h2> 存取與建立指定範圍的變數</h2></b><hr />
  <%
   pageContext.setAttribute("name","洪嘉宏",PageContext.APPLICATION_SCOPE);
   pageContext.setAttribute("pas1","1234",PageContext.APPLICATION_SCOPE);
   pageContext.setAttribute("name","自由人",PageContext.SESSION_SCOPE);
   pageContext.setAttribute("pas2","5678",PageContext.SESSION_SCOPE);
   pageContext.setAttribute("name","加菲貓",PageContext.REQUEST_SCOPE);
   pageContext.setAttribute("pas3","0000",PageContext.REQUEST_SCOPE);
   pageContext.setAttribute("name","小飛仔",PageContext.PAGE_SCOPE);
   pageContext.setAttribute("pas4","1111",PageContext.PAGE_SCOPE);
   out.print("<b>檢查指定的變數是否存在：</b><br>");
   if(pageContext.findAttribute("pas3")!=null)
    out.print("pas3變數存在<br>");
   else
    out.print("pas3變數不存在<br>");
   if(pageContext.findAttribute("pas0")!=null)
    out.print("pas0變數存在<br>");
   else
    out.print("pas0變數不存在<br>");
  %>
  <b>取得指定範圍的變數值：</b><br>
  Session範圍的name變數值=<%=pageContext.getAttribute("name",PageContext.SESSION_SCOPE)%><br>
  Page範圍的pas4變數值：=<%=pageContext.getAttribute("pas4",PageContext.PAGE_SCOPE)%><br>
  <b>取得指定變數的範圍：</b><br>
  name變數=<%=pageContext.getAttributesScope("name")%><br>
  pas1變數=<%=pageContext.getAttributesScope("pas1")%><br />
  pas2變數=<%=pageContext.getAttributesScope("pas2")%><br />
  pas3變數=<%=pageContext.getAttributesScope("pas3")%><br />
  pas4變數=<%=pageContext.getAttributesScope("pas4")%><br />
  <b>取得Application範圍的所有變數名稱：</b><br>
  <%
   Enumeration e=pageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE);
   while(e.hasMoreElements())
   {
	String name=(String)e.nextElement();
	out.print("變數名稱："+name+"<br>");
   }
  %>
 </body>
</html>