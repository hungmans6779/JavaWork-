import Package.*;
public class Dog extends Animal
{
 int eyes=1;
 int leg=2;
 String color="Black";
 public String eat()
 {
 	return "Dog eat............";
 }	
 public static void main(String argv[])
 {
  Animal dog1=new Dog();
  Dog dog2=new Dog();
  System.out.println(Animal.leg+" ��");	
  System.out.println(Animal.eyes+" ��");
  System.out.println(Animal.color+" ��");
  System.out.println(new Animal().eat());
  System.out.println("=============================");
  System.out.println(dog1.leg+" ��");	
  System.out.println(dog1.eyes+" ��");
  System.out.println(dog1.color+" ��");
  System.out.println(dog1.eat());
  System.out.println("=============================");
  System.out.println(dog2.leg+" ��");	
  System.out.println(dog2.eyes+" ��");
  System.out.println(dog2.color+" ��");
  System.out.println(dog2.eat());
 }	
}