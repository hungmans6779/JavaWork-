<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch10_1_1_1.jsp�{��</title>
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
 %>
 <%
   Customer hung=new Customer("�x�ŧ�","�x�n��");
   hung.age=29;
   out.print("<b><h2>Java�����O�P����</h2></b><hr>");
   out.print("�m�W�G"+hung.getName()+"<br>");
   out.print("�a�}�G"+hung.getAddress()+"<br>");
   out.print("�~�֡G"+hung.age+"<br>");
 %>
 </body>
</html>