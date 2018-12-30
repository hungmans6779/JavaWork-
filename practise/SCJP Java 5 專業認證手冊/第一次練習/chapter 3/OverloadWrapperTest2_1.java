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
}
public class OverloadWrapperTest2_1
{
 public static void main(String argv[])
 {
  Animal d=new Dog();
  go(d);
 }
 static void go(Animal a)
 {
  System.out.println("Animal");
  a.eat();
 }
 static void go(Dog d)
 {
 	System.out.println("Dog");
 	d.eat();
 }	
}