<%@ page contentType="text/html;charset=MS950" %>
<html>
 <head> 
  <title>Ch10_1_2.jsp�{��</title>
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
	 return "�����G"+name+"<br>����G"+price;
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
	 return "======�⨮���=====<br>"+getVehicleInfo()+"<br>�����X���G"+door;	
	}
   }
  %>
  <%
   Car honda=new Car("CRV",79.3,5);
   Car mozda=new Car("M3",59.5,4);
   out.print("<b><h2>Java���O���~��</h2></b><hr>");
   out.print(honda.getCarInfo()+"<br>");
   out.print(mozda.getCarInfo()+"<br>");
  %>
  
 </body>
</html>