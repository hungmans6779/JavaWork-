class Animal
{
 public void eat()
 {
  System.out.println("Animal Dog");
 }
}
class Dog extends Animal{}

public class AnonymousInnerClassTest4
{
 public static void main(String argv[])
 {
  new Dog()
  {
   public void eat()
   {
    System.out.println("Dog eat");
   }
  }.eat();
 }
}