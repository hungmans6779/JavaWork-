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

public class ZooTest3 
{
 public static void main(String argv[])
 {
  Animal a=new Tiger();
  a.move();
 // a.skill();
  ((Tiger)a).skill();
  ((Cat)a).skill();
 }
}