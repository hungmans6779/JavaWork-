class Animal
{
 private void eat()
 {
  System.out.println("Animal eat....");
 }
}

class Dog extends Animal
{
 public void eat()
 {
  System.out.println("Dog eat.....");
 }
}

public class PrivateOverrideTest1
{
 public static void main(String argv[])
 {
  Animal animal=new Animal();
  Animal dog=new Dog();
  //animal.eat();
  dog.eat();
 }
}