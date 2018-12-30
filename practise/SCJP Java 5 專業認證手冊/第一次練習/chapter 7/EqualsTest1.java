public class EqualsTest1
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
 }
}
class Car
{
 private int value;
 Car(int value)
 {
  this.value=value;
 }
}