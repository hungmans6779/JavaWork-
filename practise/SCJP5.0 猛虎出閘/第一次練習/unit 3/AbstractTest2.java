abstract class Car
{
 public void power()
 {
 
 }
 abstract void move();
}
public class AbstractTest2 extends Car
{
 void move()
 {
  System.out.println("�ڬO��...");
 }
 public static void main(String argv[])
 {
  new AbstractTest2().move();
 }
}