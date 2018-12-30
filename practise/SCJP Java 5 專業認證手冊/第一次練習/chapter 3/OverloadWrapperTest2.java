class Animal{}
class Dog extends Animal{}
public class OverloadWrapperTest2
{
 public static void main(String argv[])
 {
  Animal d=new Dog();
  go(d);
 }
 static void go(Animal a)
 {
  System.out.println("Animal");
 }
 static void go(Dog d)
 {
 	System.out.println("Dog");
 }	
}