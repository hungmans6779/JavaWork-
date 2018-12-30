class Animal
{
 public void eat()
 {
  System.out.println("Generic Animal Eating Generically");
 }
}

class Horse extends Animal
{
 public void eat()
 {
  System.out.println("Horse eating hay");
 }
 public void eat(String s)
 {
  System.out.println("Horse eating "+s);
 }
}

public class OverloadTest4 
{
 public static void main(String argv[])
 {
  Horse h=new Horse();
  h.eat("Apple");
 }
}