abstract class Car
{
 void power()
 {
  System.out.println("我有power.....");	
 }
 
 abstract void move();
 int i=10;
}

public class Tank extends Car
{
 int i=20;
 void move()
 {
 	System.out.println("移動的方式.....");
 }		

 void go()
 {
 	System.out.println("this.i = "+i);
 	System.out.println("super.i= "+super.i);
 	System.out.println("new Tank().i = "+new Tank().i);
 }	
 public static void main(String argv[])
 {
 	new Tank().power();
 	new Tank().move();
 	new Tank().go();
 }	
}	