<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch8_3_3.jsp�{��</title>
  <b><h2>���oSession��T</h2></b><hr />
  <b>���osession���ܼƭ�</b><br />
  �ϥΪ̦W�١G<%=session.getAttribute("Username")%><br>
  �ϥΪ̱K�X�G<%=session.getAttribute("Password")%><br>
  <b>���osession��������T</b><br />
  <%
   if(session.isNew())
   {
	session.setMaxInactiveInterval(18000);   
   }
  %>
  Session ID�G<%=session.getId()%><br>
  �إ߮ɶ��G<%=session.getCreationTime()%><br>
  �̫�s���ɶ��G<%=session.getLastAccessedTime()%><br>
  �̤j���Įɶ��G<%=session.getMaxInactiveInterval()%><br>
  �O�_�O�s��Session�G<%=session.isNew()%><br>
  <%
    session.invalidate();
  %>
 </head>
</html>