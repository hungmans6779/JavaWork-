<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Test7.jsp程式</title>
 </head>
 <body>
 <%
  String error="",msessage="";
  String name="",username="",pass1="",pass2="";
  String year="",month="",date="";
  String area="",address="",memo="";
  boolean showForm=true; //true代表輸入的資料錯誤，顯示重新輸入的表格
  if(request.getParameter("Register")!=null)
  {
    name=request.getParameter("Name");
	username=request.getParameter("Username");
	pass1=request.getParameter("Password1");
	pass2=request.getParameter("Password2");
	year=request.getParameter("AgeYear");
    month=request.getParameter("AgeMonth");
	date=request.getParameter("AgeDate");
	area=request.getParameter("Area");
	address=request.getParameter("Address");
	memo=request.getParameter("Memo");
	if(name.length()==0)
	{
	 error="姓名欄位空白！！！";
	}
	else if(username.length()==0)
	{
	 error="帳號欄位空白！！！";
	}
	else if(pass1.length()==0 || pass2.length()==0)
	{
	 error="密碼欄位不得有任一空白！！！";	
	}
	else if(!pass1.equals(pass2)) //判斷密碼欄位
	{
	 error="密碼輸入不一致.....";	
	} 
	else if ((Integer.parseInt(year)==0 || Integer.parseInt(year)==0) || Integer.parseInt(date)==0)
	{
	 error="生日輸入有錯誤！！！";	
	}
	else if(area.length()==1)
	{
	 error="未輸入居住地區.....";
	}
	else if(address.length()==0)
	{
	 error="住址未輸入.....";	
	}
	else
	{
	 showForm=false; //false代表將輸入的資料輸出	
	}
  }

 if(showForm)
 {
 %>
 
  <center>
  <b><h1>請輸入您的個人資料</h1></b><br />
  <font color="red"><%=error%></font>
  <hr />
  </center>
  <form method="get" action="http://hungmans6779.homeip.net/jsp/Test7.jsp">
   <b>註：(<font color="red">*</font>)一定要輸入資料</b><br /><br>
   <font color="red">*</font>姓名：<input type="TEXT" name="Name" size="10" value="<%=name%>"/><br />
   <font color="red">*</font>帳號：<input tye="TEXT" name="Username" size="10" value="<%=username%>"><br>
   <font color="red">*</font>輸入密碼：<input type="PASSWORD" name="Password1" size="10"><br>
   <font color="red">*</font>再輸入一次密碼：<input type="PASSWORD" name="Password2" size="10"><br>
    您的性別：
   <input type="RADIO" name="Sex" value="男性" checked>男性
   <input type="RADIO" name="Sex" value="女性" />女性<br />
   <font color="red">*</font>請輸入您的年齡：
   <select name="AgeYear">
    西元：
    <option value="0"> </option>
    <option value="2007">2007</option>
	<option value="2006">2006</option>
	<option value="2005">2005</option>
	<option value="2004">2004</option>
	<option value="2003">2003</option>
	<option value="2002">2002</option>
   </select>
    年 
	
   <select name="AgeMonth">
    <option value="0"></option>
	<option value="01">01</option>
	<option value="02">02</option>
	<option value="03">03</option>
	<option value="04">04</option>
	<option value="05">05</option>
	<option value="06">06</option>
	<option value="07">07</option>
	<option value="08">08</option>
	<option value="09">09</option>
	<option value="10">10</option>
	<option value="11">11</option>
	<option value="12">12</option>
   </select>
    月
   <select name="AgeDate">
    <option value="0"></option>
	<option value="01">01</option>
	<option value="02">02</option>
	<option value="03">03</option>
	<option value="04">04</option>
	<option value="05">05</option>
	<option value="06">06</option>
	<option value="07">07</option>
	<option value="08">08</option>
	<option value="09">09</option>
	<option value="10">10</option>
	<option value="11">11</option>
	<option value="12">12</option>
	<option value="13">13</option>
	<option value="14">14</option>
	<option value="15">15</option>
	<option value="16">16</option>
	<option value="17">17</option>
	<option value="18">18</option>
	<option value="19">19</option>
	<option value="20">20</option>
	<option value="21">21</option>
	<option value="22">22</option>
	<option value="23">23</option>
	<option value="24">24</option>
	<option value="25">25</option>
	<option value="26">26</option>
	<option value="27">27</option>
	<option value="28">28</option>
	<option value="29">29</option>
	<option value="30">30</option>
	<option value="31">31</option>
   </select>
    日<br />
    <font color="red">*</font>居住地區：
	<select name="Area">
	 <option value="0"></option>
	 <option value="台北市">台北市</option>
	 <option value="台中市">台中市</option>
	 <option value="台南市">台南市</option>
	 <option value="高雄市">高雄市</option>
	</select>
	<br>
	<font color="red">*</font>住址：<input type="TEXT" name="Address" size=50" values="<%=address%>"><br>
	您的興趣：
	<input type="CHECKBOX" name="Enjor" value="打球">打球
	<input type="CHECKBOX" name="Enjor" value="游泳">游泳
	<input type="CHECKBOX" name="Enjor" value="逛街">逛街
	<input type="CHECKBOX" name="Enjor" value="打電動">打電動
	<input type="CHECKBOX" name="Enjor" value="旅遊">旅遊
	<input type="CHECKBOX" name="Enjor" value="上網">上網
	<input type="CHECKBOX" name="Enjor" value="聊天">聊天
	<input type="CHECKBOX" name="Enjor" value="電腦">電腦
	<br><br>
	<font color="red">*</font>發表意見：<br>
	<textarea name="Memo" cols="50" rows="10">
	 <%=memo%>
	</textarea>
	<br>
   <input type="SUBMIT" value="將資料送出" name="Register">
  </form>
  <%
  }
  else
  {
   out.print("<b><h1>您輸入的資料是</h1></b><hr>");
   out.print("姓名："+name+"<br>");
   out.print("帳號："+username+"<br>");
   out.print("密碼："+pass1+"<br>");
   out.print("性別："+request.getParameter("Sex")+"<br>");
   out.print("生日：西元 "+year+"年 "+month+"月 "+date+"日<br>");
   out.print("您的住址是："+area+address+"<br>");
   String enjors[]=request.getParameterValues("Enjor");
   out.print("您的興趣是：");
   for(int i=0;i<enjors.length;i++)
   {
	out.print(enjors[i]+",");   
   }
   out.print("<br>");
   out.print("您所發表的意見是:<br>");
   out.print(memo);

  }
  %>
 </body>
</html>