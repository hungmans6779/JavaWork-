class Animal
{
 void eat()
 {
 	System.out.println("Animal eat");
 }	
 public Animal getName()
 { return new Dog();}	
}
class Dog extends Animal
{
 void eat()
 {	
  System.out.println("Dog eat");	
 } 
 public Dog getName()
 { 
  return new Dog();	
 }
}
public class ReturnTest1_2
{
 public Animal getName()
 {
  return new Dog();
 }
 public static void main(String argv[])
 {
  ReturnTest1_2 r2=new ReturnTest1_2();
  Animal a;
  a=r2.getName();
  a.eat();
 }
}