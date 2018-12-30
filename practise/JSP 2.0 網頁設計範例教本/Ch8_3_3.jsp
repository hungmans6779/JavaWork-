<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Ch8_3_3.jsp程式</title>
  <b><h2>取得Session資訊</h2></b><hr />
  <b>取得session的變數值</b><br />
  使用者名稱：<%=session.getAttribute("Username")%><br>
  使用者密碼：<%=session.getAttribute("Password")%><br>
  <b>取得session的相關資訊</b><br />
  <%
   if(session.isNew())
   {
	session.setMaxInactiveInterval(18000);   
   }
  %>
  Session ID：<%=session.getId()%><br>
  建立時間：<%=session.getCreationTime()%><br>
  最後存取時間：<%=session.getLastAccessedTime()%><br>
  最大有效時間：<%=session.getMaxInactiveInterval()%><br>
  是否是新的Session：<%=session.isNew()%><br>
  <%
    session.invalidate();
  %>
 </head>
</html>