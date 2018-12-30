import Package.*;
class Dog extends Animal
{}
public class Marry extends Dog
{
 public String eat()
 {
 	return "Dog eat............";
 }	
 public static void main(String argv[])
 {
  Animal dog1=new Dog();
  Marry dog2=new Marry();
  System.out.println(Animal.leg+" 支");	
  System.out.println(Animal.eyes+" 個");
  System.out.println(Animal.color+" 色");
  System.out.println(new Animal().eat());
  System.out.println("=============================");
  System.out.println(dog1.leg+" 支");	
  System.out.println(dog1.eyes+" 個");
  System.out.println(dog1.color+" 色");
  System.out.println(dog1.eat());
  System.out.println("=============================");
  System.out.println(dog2.leg+" 支");	
  System.out.println(dog2.eyes+" 個");
  System.out.println(dog2.color+" 色");
  System.out.println(dog2.eat());
 }	
}