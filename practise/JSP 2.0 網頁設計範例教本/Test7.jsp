<%@ page contentType="text/html;charset=MS950" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <title>Test7.jsp�{��</title>
 </head>
 <body>
 <%
  String error="",msessage="";
  String name="",username="",pass1="",pass2="";
  String year="",month="",date="";
  String area="",address="",memo="";
  boolean showForm=true; //true�N���J����ƿ��~�A��ܭ��s��J�����
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
	 error="�m�W���ťաI�I�I";
	}
	else if(username.length()==0)
	{
	 error="�b�����ťաI�I�I";
	}
	else if(pass1.length()==0 || pass2.length()==0)
	{
	 error="�K�X��줣�o�����@�ťաI�I�I";	
	}
	else if(!pass1.equals(pass2)) //�P�_�K�X���
	{
	 error="�K�X��J���@�P.....";	
	} 
	else if ((Integer.parseInt(year)==0 || Integer.parseInt(year)==0) || Integer.parseInt(date)==0)
	{
	 error="�ͤ��J�����~�I�I�I";	
	}
	else if(area.length()==1)
	{
	 error="����J�~��a��.....";
	}
	else if(address.length()==0)
	{
	 error="��}����J.....";	
	}
	else
	{
	 showForm=false; //false�N��N��J����ƿ�X	
	}
  }

 if(showForm)
 {
 %>
 
  <center>
  <b><h1>�п�J�z���ӤH���</h1></b><br />
  <font color="red"><%=error%></font>
  <hr />
  </center>
  <form method="get" action="http://hungmans6779.homeip.net/jsp/Test7.jsp">
   <b>���G(<font color="red">*</font>)�@�w�n��J���</b><br /><br>
   <font color="red">*</font>�m�W�G<input type="TEXT" name="Name" size="10" value="<%=name%>"/><br />
   <font color="red">*</font>�b���G<input tye="TEXT" name="Username" size="10" value="<%=username%>"><br>
   <font color="red">*</font>��J�K�X�G<input type="PASSWORD" name="Password1" size="10"><br>
   <font color="red">*</font>�A��J�@���K�X�G<input type="PASSWORD" name="Password2" size="10"><br>
    �z���ʧO�G
   <input type="RADIO" name="Sex" value="�k��" checked>�k��
   <input type="RADIO" name="Sex" value="�k��" />�k��<br />
   <font color="red">*</font>�п�J�z���~�֡G
   <select name="AgeYear">
    �褸�G
    <option value="0"> </option>
    <option value="2007">2007</option>
	<option value="2006">2006</option>
	<option value="2005">2005</option>
	<option value="2004">2004</option>
	<option value="2003">2003</option>
	<option value="2002">2002</option>
   </select>
    �~ 
	
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
    ��
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
    ��<br />
    <font color="red">*</font>�~��a�ϡG
	<select name="Area">
	 <option value="0"></option>
	 <option value="�x�_��">�x�_��</option>
	 <option value="�x����">�x����</option>
	 <option value="�x�n��">�x�n��</option>
	 <option value="������">������</option>
	</select>
	<br>
	<font color="red">*</font>��}�G<input type="TEXT" name="Address" size=50" values="<%=address%>"><br>
	�z������G
	<input type="CHECKBOX" name="Enjor" value="���y">���y
	<input type="CHECKBOX" name="Enjor" value="��a">��a
	<input type="CHECKBOX" name="Enjor" value="�}��">�}��
	<input type="CHECKBOX" name="Enjor" value="���q��">���q��
	<input type="CHECKBOX" name="Enjor" value="�ȹC">�ȹC
	<input type="CHECKBOX" name="Enjor" value="�W��">�W��
	<input type="CHECKBOX" name="Enjor" value="���">���
	<input type="CHECKBOX" name="Enjor" value="�q��">�q��
	<br><br>
	<font color="red">*</font>�o��N���G<br>
	<textarea name="Memo" cols="50" rows="10">
	 <%=memo%>
	</textarea>
	<br>
   <input type="SUBMIT" value="�N��ưe�X" name="Register">
  </form>
  <%
  }
  else
  {
   out.print("<b><h1>�z��J����ƬO</h1></b><hr>");
   out.print("�m�W�G"+name+"<br>");
   out.print("�b���G"+username+"<br>");
   out.print("�K�X�G"+pass1+"<br>");
   out.print("�ʧO�G"+request.getParameter("Sex")+"<br>");
   out.print("�ͤ�G�褸 "+year+"�~ "+month+"�� "+date+"��<br>");
   out.print("�z����}�O�G"+area+address+"<br>");
   String enjors[]=request.getParameterValues("Enjor");
   out.print("�z������O�G");
   for(int i=0;i<enjors.length;i++)
   {
	out.print(enjors[i]+",");   
   }
   out.print("<br>");
   out.print("�z�ҵo���N���O:<br>");
   out.print(memo);

  }
  %>
 </body>
</html>