class Animal
{
 static int i=10;
 public int getValue()
 {
  return i;
 }
 public static  String  run()
 {
  return "Animalªºrun()...";
 }
}

public class Dog extends Animal
{
 int i=20;
 public int getValue()
 {
  return i;
 }
 public  static  String  run()
 {
  return "Dogªºrun()....";
 }
 public static void main(String argv[])
 {
 	
  Animal animal=new Animal();
  /*
  System.out.println(animal.i);
  System.out.println(animal.run());
  System.out.println(animal.getValue());
  System.out.println("==================================");
  */
  
  Dog dog=new Dog();
  
  /*
  System.out.println(dog.i);
  System.out.println(dog.run());
  System.out.println(dog.getValue());
  */
  System.out.println("==================================");
  System.out.println(((Animal)dog).i);
  System.out.println(((Animal)dog).run());
  System.out.println(((Animal)dog).getValue());
  
 }
}