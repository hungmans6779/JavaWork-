<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch10_1_1.jsp�{��</title>
 </head>
 <body>
 <%!
  class Customer
  {
	private String name;
	private String address;
	public int age;
	Customer(String name,String a)
	{
	this.name=name;
	address=a;
	}
	public String getName()
	{
	 return name;	
	}
	public String getAddress()
	{
	 return address;	
	}  
  }
  Customer hung=new Customer("�x�ŧ�","�x�n��");
 %>
  <%
   hung.age=29;
  %>
  <b><h2>Java�����O�P����</h2></b><hr />
  �m�W�G<%=hung.getName()%><br />
  �a�}�G<%=hung.getAddress()%><br>
  �~�֡G<%=hung.age%><br>
 </body>
</html>