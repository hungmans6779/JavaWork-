class Animal
{
 public void eat()
 {
  System.out.println("Animal eat");
 }
}
public class DogPolymorphismTest1 extends Animal
{
 public void eat()
 {
  System.out.println("Dog eat");
  super.eat();
 }
 public static void main(String argv[])
 {
  Animal a=new DogPolymorphismTest1();
  a.eat();
 }
}