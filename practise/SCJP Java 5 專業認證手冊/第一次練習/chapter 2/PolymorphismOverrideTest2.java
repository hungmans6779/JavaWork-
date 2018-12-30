class Animal
{
 final public  void eat()
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

public class PolymorphismOverrideTest2
{
 public static void main(String argv[])
 {
  //Animal a=new Dog();
  //Dog d=new Dog();
  //d.eat();
 }
}