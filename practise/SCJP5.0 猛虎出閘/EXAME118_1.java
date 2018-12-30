import java.util.*;
class Animal
{
 public void eat(String ... kind){ System.out.println("Animal eat"); }
 public void run(String  rr) { System.out.println("Animal run"); }
}
class Dog extends Animal
{
 public void eat(String kind) {System.out.println("Dog eat"); }
 public void run(String rr) {System.out.println("Dog run"); }
}
public class EXAME118_1
{
 public static void main(String argv[])
 {
 	Date now=new Date();
 	System.out.println("現在的時間為 : "+now);
  Animal animal=new Dog();
  Dog d=(Dog)animal;
  animal.eat("test");
  d.eat("test");
  animal.run("test");
  d.run("test");
 }
}