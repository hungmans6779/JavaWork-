class Animal
{
 public void eat()
 {
  System.out.println("Animal eat");
 }
}
class Dog extends Animal
{
 public void eat()
 {
  System.out.println("Dog eat");
 }
}

public class PolymorphismTest1
{
 public static void main(String argv[])
 {
 	Dog d=new Dog();
 	tt(d);
 }
 public static void tt(Animal a)
 {
 	System.out.println("我是Animal的引數");
 	a.eat();
 }			
 public static void tt(Dog a)
 {
 	System.out.println("我是Dog的引數");
 	a.eat();
 }	
 
}	