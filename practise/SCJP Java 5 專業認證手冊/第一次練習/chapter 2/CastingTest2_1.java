class Animal
{
 void eat()
 {
 	System.out.println("Animal eat");
 }		
}
class Dog extends Animal
{
 void eat()
 {
 	System.out.println("Dog eat");
 }			
 void play()
 {
  System.out.println("Dog play");	
 }	
}
public class CastingTest2_1
{
 public static void main(String argv[])
 {
  Dog d=new Dog();
  Animal a=d;
  a.eat();
  ((Dog)a).play();
 }
}