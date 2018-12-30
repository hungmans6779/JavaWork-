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
 
  System.out.println(dog1.leg+" ¤ä");	
  System.out.println(dog1.eyes+" ­Ó");
  System.out.println(dog1.color+" ¦â");
  System.out.println(dog1.eat());
 }	
}