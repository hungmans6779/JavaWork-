<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head> 
  <title>Ch10_1_2.jsp程式</title>
 </head>
 <body>
  <%!
   class Vehicle
   {
	private String name;
	private double price;
	public Vehicle(String name,double price)
	{
	 this.name=name;
	 this.price=price;
	}
	public String getVehicleInfo()
	{
	 return "型號："+name+"<br>價格："+price;
	}
   }
   class Car extends Vehicle
   {
	private int door;
	public Car(String name,double price,int door)
	{
	 super(name,price);	
     this.door=door;
	}
	public String getCarInfo()
	{
	 return "======轎車資料=====<br>"+getVehicleInfo()+"<br>車有幾門："+door;	
	}
   }
  %>
  <%
   Car honda=new Car("CRV",79.3,5);
   Car mozda=new Car("M3",59.5,4);
   out.print("<b><h2>Java類別的繼承</h2></b><hr>");
   out.print(honda.getCarInfo()+"<br>");
   out.print(mozda.getCarInfo()+"<br>");
  %>
  
 </body>
</html>