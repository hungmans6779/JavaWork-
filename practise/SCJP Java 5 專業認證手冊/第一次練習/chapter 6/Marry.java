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