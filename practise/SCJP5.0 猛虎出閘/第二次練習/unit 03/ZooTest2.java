class Animal
{
 public void move()
 {
  System.out.println("����...");
 }
}

class Cat extends Animal
{
 public void move()
 {
  System.out.println("�]�]����...");
 }
 public void skill()
 {
  System.out.println("�~��...");
 } 
}

class Bird extends Animal
{
 public void move()
 {
  System.out.println("������...");
 }
}

class Tiger extends Cat
{
 public void skill()
 {
  System.out.println("���y...");
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