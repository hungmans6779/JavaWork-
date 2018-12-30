abstract class Car
{
 abstract void move();
}

public class AbstractTest3
{
 public static void main(String argv[])
 {
  new Car()
  {
   public void move()
   {
   	System.out.println("用履帶走的...");
   }			
  }.move();	
 }
}