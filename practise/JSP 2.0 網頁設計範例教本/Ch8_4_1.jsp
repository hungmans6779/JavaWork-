<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<html>
 <head>
  <title>Ch8_4_1.jsp�{��</title>
 </head>
 <body>
  <b><h2> �s���P�إ߫��w�d���ܼ�</h2></b><hr />
  <%
   pageContext.setAttribute("name","�x�ŧ�",PageContext.APPLICATION_SCOPE);
   pageContext.setAttribute("pas1","1234",PageContext.APPLICATION_SCOPE);
   pageContext.setAttribute("name","�ۥѤH",PageContext.SESSION_SCOPE);
   pageContext.setAttribute("pas2","5678",PageContext.SESSION_SCOPE);
   pageContext.setAttribute("name","�[���",PageContext.REQUEST_SCOPE);
   pageContext.setAttribute("pas3","0000",PageContext.REQUEST_SCOPE);
   pageContext.setAttribute("name","�p���J",PageContext.PAGE_SCOPE);
   pageContext.setAttribute("pas4","1111",PageContext.PAGE_SCOPE);
   out.print("<b>�ˬd���w���ܼƬO�_�s�b�G</b><br>");
   if(pageContext.findAttribute("pas3")!=null)
    out.print("pas3�ܼƦs�b<br>");
   else
    out.print("pas3�ܼƤ��s�b<br>");
   if(pageContext.findAttribute("pas0")!=null)
    out.print("pas0�ܼƦs�b<br>");
   else
    out.print("pas0�ܼƤ��s�b<br>");
  %>
  <b>���o���w�d���ܼƭȡG</b><br>
  Session�d��name�ܼƭ�=<%=pageContext.getAttribute("name",PageContext.SESSION_SCOPE)%><br>
  Page�d��pas4�ܼƭȡG=<%=pageContext.getAttribute("pas4",PageContext.PAGE_SCOPE)%><br>
  <b>���o���w�ܼƪ��d��G</b><br>
  name�ܼ�=<%=pageContext.getAttributesScope("name")%><br>
  pas1�ܼ�=<%=pageContext.getAttributesScope("pas1")%><br />
  pas2�ܼ�=<%=pageContext.getAttributesScope("pas2")%><br />
  pas3�ܼ�=<%=pageContext.getAttributesScope("pas3")%><br />
  pas4�ܼ�=<%=pageContext.getAttributesScope("pas4")%><br />
  <b>���oApplication�d�򪺩Ҧ��ܼƦW�١G</b><br>
  <%
   Enumeration e=pageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE);
   while(e.hasMoreElements())
   {
	String name=(String)e.nextElement();
	out.print("�ܼƦW�١G"+name+"<br>");
   }
  %>
 </body>
</html>