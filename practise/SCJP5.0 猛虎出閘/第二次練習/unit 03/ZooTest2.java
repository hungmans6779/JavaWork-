class Animal
{
 public void move()
 {
  System.out.println("²¾°Ê...");
 }
}

class Cat extends Animal
{
 public void move()
 {
  System.out.println("¶]¶]¸õ¸õ...");
 }
 public void skill()
 {
  System.out.println("¬~¾þ...");
 } 
}

class Bird extends Animal
{
 public void move()
 {
  System.out.println("­¸­¸­¸...");
 }
}

class Tiger extends Cat
{
 public void skill()
 {
  System.out.println("¬¼Ây...");
 }
}

public class ZooTest2
{
 public static void main(String argv[])
 {
  Cat c=new Tiger();
  c.move();
  c.skill();
 }
}