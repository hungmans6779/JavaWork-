import Package.*;
class Dog extends Animal
{}
public class Marry1
{
 public String eat()
 {
 	return "Dog eat............";
 }	
 public static void main(String argv[])
 {
  Animal dog1=new Dog();
 
  System.out.println(dog1.leg+" ��");	
  System.out.println(dog1.eyes+" ��");
  System.out.println(dog1.color+" ��");
  System.out.println(dog1.eat());
 }	
}