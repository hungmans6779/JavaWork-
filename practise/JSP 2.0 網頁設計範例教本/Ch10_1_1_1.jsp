<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head>
  <title>Ch10_1_1_1.jsp程式</title>
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
   Customer hung=new Customer("洪嘉宏","台南市");
   hung.age=29;
   out.print("<b><h2>Java的類別與物件</h2></b><hr>");
   out.print("姓名："+hung.getName()+"<br>");
   out.print("地址："+hung.getAddress()+"<br>");
   out.print("年齡："+hung.age+"<br>");
 %>
 </body>
</html>