class Animal
{
 void aMethod()
 {
  System.out.println("Animal");
 }
}
class Cat extends Animal
{
 void aMethod()
 {
  System.out.println("Cat1");
 }
 void bMethod()
 {
 	System.out.println("Cat2");
 }	
}
class Tiger extends Cat
{
 void aMethod()
 {
  System.out.println("tiger1");
 }
 void bMethod()
 {
  System.out.println("tiger2");
 }
}
class Bird extends Animal
{
 void aMethod()
 {
  System.out.println("Bird");
 }
}
public class PolymorphismTest1
{
 public static void main(String argv[])
 {
  Tiger t1=new Tiger();
  t1.aMethod();
  t1.bMethod();
  System.out.println("========================");
  Cat t2=new Tiger();
  t2.aMethod();
  t2.bMethod();
  System.out.println("========================");
  Animal t3=new Tiger();
  t3.aMethod();
  //t3.bMethod();
  Tiger tt=new Cat();
 }
}