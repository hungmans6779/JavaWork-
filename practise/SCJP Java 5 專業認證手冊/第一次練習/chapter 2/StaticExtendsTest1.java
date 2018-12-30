class Animal
{
 static String name="Animal";
}

class Dog extends Animal
{

}

public class StaticExtendsTest1
{
 public static void main(String argv[])
 {
  System.out.println(Dog.name);
  Dog.name="Dog";
  System.out.println(Animal.name);
 }
}