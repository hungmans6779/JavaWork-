abstract class Car
{
 public void power(){}
 abstract void move();
}

public class AbstractTest2 extends Car
{
 public void move()
 {
  System.out.println("�μi�a����...");	
 }		
 public static void main(String argv[])
 {
  AbstractTest2 a=new AbstractTest2();
  a.move();	
 }	
}	