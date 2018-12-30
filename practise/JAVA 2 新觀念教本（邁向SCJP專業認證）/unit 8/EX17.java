public class EX17
{
 public static void main(String argv[])
 {
  new WolfDog().bark();
  new DoberMan().bark();
  new Dog().bark();
 }
}

class Dog
{
 void bark()
 {
  System.out.print("�L�L");
 }
}

class WolfDog extends Dog
{
 void bark()
 {
  
  System.out.println("��L��L����");
 }
}

class DoberMan extends Dog
{
 void bark()
 {
 	super.bark();
  System.out.println("��L�L�L��");
 }
}