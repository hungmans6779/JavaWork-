class Animal
{
 public String noise()
 {
  return "Animal";
 }
}

class Dog extends Animal
{
 public String  noise()
 {
  return "Dog";
 }
}

class Cat extends Animal
{
 public String  noise()
 {
  return "Cat";
 }
}

public class EXAME027
{
 public static void main(String argv[])
 {
 	Animal animal=new Dog();
 	Cat cat=(Cat)animal;
  System.out.println(cat.noise());
 }		
}	