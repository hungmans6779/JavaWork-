abstract class Car
{
 public void power(){}
 abstract void move();
}

public class AbstractTest2 extends Car
{
 public void move()
 {
  System.out.println("用履帶走的...");	
 }		
 public static void main(String argv[])
 {
  AbstractTest2 a=new AbstractTest2();
  a.move();	
 }	
}	