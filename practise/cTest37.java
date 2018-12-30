class Animal
{
 int i=10;
 public void run()
 {
  System.out.println("Animal running...");
 }
}

class Dog extends Animal
{
 int i=20;
 public void run()
 {
  //super.run();
  System.out.println("Dog running...");
 }
}

public class cTest37
{
 public static void main(String argv[])
 {
  Dog a=new Dog();
  //a.run();
  System.out.println(a.i);
  System.out.println(((Animal)a).i);
  a.run();
  ((Animal)a).run();
 }
}