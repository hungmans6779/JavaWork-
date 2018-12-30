abstract class A
{
 abstract void move();
}
public class AbstractTest3 
{
 public static void main(String argv[])
 {
  new A()
  {
   void move()
   {
    System.out.println("§Ú¬O............");
   }
  }.move();
 }
}