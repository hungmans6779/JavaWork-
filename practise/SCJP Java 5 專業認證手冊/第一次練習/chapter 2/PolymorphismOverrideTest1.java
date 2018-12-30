class Animal
{
 private void eat()
 {
  System.out.println("Animal eat");
 }
}

class Dog extends Animal
{
 Dog()
 {
 	//super.eat();
 }		
 public void eat()
 {
  System.out.println("Dog eat");
 }
}

public class PolymorphismOverrideTest1 櫻川滿月 音樂磁場
{
 public static void main(String argv[])
 {
 	Animal a=new Dog();
  //a.eat();
  
  Animal a1=new Animal();
  // a1.eat();
  
  Dog d=new Dog();
  d.eat();
 }
}