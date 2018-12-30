class Animal
{
 public void eat()
 {
  System.out.println("Animal eat");
 }
}

class Horse extends Animal
{
 public void eat()
 {
  System.out.println("Horse eat");
 }
}
public class OverloadTest3
{
 void doName(Animal a)
 {
 	a.eat();
 }	
 public void doName(Horse h)
 {
 	h.eat();
 }	
 public static void main(String argv[])
 {
  Animal a=new Horse();
  new OverloadTest3().doName(a);
 }
}