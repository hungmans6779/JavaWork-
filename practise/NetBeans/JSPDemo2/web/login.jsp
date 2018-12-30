<%@page contentType="text/html; charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<jsp:useBean id="LogonForm" scope="page" class="javaBean.LogonFormBean" />
<jsp:setProperty name="LogonForm" property="*" />
<%@ page import="javaBean.*" %>
<%  request.setCharacterEncoding("UTF-8");    %>
<%
 String e1="";
 String e2="";
if(request.getParameter("sendData")!=null) {
    if(LogonForm.validate()) {
        DBUtil db=DBUtil.getInstance();
        UserBean user=db.getUser(LogonForm.getName());
        if(user==null) {
            LogonForm.setMsg("user","User not Found");
        } else {
            if(!user.validatePassword(LogonForm.getPassword())) {
                LogonForm.setMsg("password","Password is error！！！");
            } else {
                response.sendRedirect("loginSuccess.jsp");
            }
            
        }
        
    }
    else
        {
         response.sendRedirect("login.jsp");
        /*
         e1=LogonForm.getMsg("user");
   
         e2=LogonForm.getMsg("password");
         out.println(e1+"<br>");
          out.println(e2+"<br>");
          */
        }
        
    
   

    //response.sendRedirect("login.jsp");
} else {
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <center>
            <font size=3 color=blue>登入畫面</font><br>
            <form name="form1" action="login.jsp" method="post" >
                <table border=1>            
                    <tr>
                        <td>使用者名稱：</td>
                        <td> <input type="text" name="name" value="<%= LogonForm.getName() %>" /><%= LogonForm.getMsg("user") %></td>
                    </tr>
                    <tr>
                        <td>使用者密碼：</td>
                        <td><input type="text" name="password" value="<%= LogonForm.getPassword() %>" /><%= LogonForm.getMsg("password") %></td>
                    </tr>
                    <tr><td colspan="2" align=center><input type="submit" value="登入" name="sendData" /></td></tr>
                </table>
            </form>   
        </center>
    </body>
</html>
<%
}
%>