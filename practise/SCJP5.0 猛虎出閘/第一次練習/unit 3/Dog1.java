interface Pet
{
 public static final String attr="cutte";	
 public abstract void skill();
 void move();
 int i=10;
}	

public class Dog1 implements Pet
{
 public void skill()
 {
  System.out.println("ª±²y...");	
 }
 
 public void move()
 {
  System.out.println("¶]¶]¸õ¸õ...");	
 }	
 public static void main(String argv[])
 {
 	new Dog1().skill();
 	new Dog1().move();
 	System.out.println(new Dog1().i);
 	System.out.println(new Dog1().attr);
 }	
}	