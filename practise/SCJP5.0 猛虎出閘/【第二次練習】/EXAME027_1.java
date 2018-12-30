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

public class EXAME027_1
{
 public static void main(String argv[])
 {
 	Animal animal=new Animal();
 	Cat cat=(Cat)animal;
  System.out.println(cat.noise());
 }		
}	