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

public class ZooTest1
{
 public static void main(String argv[])
 {
  Tiger t=new Tiger();
  t.move();
  t.skill();
 }
}