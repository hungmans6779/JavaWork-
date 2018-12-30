public class EqualsTest1_1
{
 public static void main(String argv[])
 {
  Car c1=new Car(8);
  Car c2=new Car(8);
  if(c1.equals(c2))
  {
   System.out.println("c1 and c2 are equals");
  }
  else
  {
   System.out.println("c1 different c2");
  }
  System.out.println("c1 hashcode = "+c1.hashCode());
  System.out.println("c2 hashcode = "+c2.hashCode());
 }
}
class Car
{
 private int value;
 Car(int value)
 {
  this.value=value;
 }
 public int getValue()
 {
  return value;	
 }	
 public boolean equals(Object o)
 {
 	if((o instanceof Car)&&(((Car)o).getValue())==this.value)
 	{
 	 return true;	
 	}	
 	else
 	{
 	 return false;	
 	}	
 }	
}