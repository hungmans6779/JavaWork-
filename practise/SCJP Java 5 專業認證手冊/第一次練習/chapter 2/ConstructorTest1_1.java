class Animal
{
 private static String name="Animal";
 private Animal(String str)
 {
  name=str;
  System.out.println(name+" has parament");
 }
 Animal()
 {
  this(name);
  System.out.println("Animal no parament");
 }
}

class Dog extends Animal
{
 Dog(String str)
 {
  System.out.println(str);
 }
}

public class ConstructorTest1_1
{
 public static void main(String argv[])
 {
  Dog d=new Dog("Dog");
 }
}