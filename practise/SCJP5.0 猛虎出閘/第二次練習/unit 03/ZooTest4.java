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

public class ZooTest4 
{
 public static void main(String argv[])
 {
  Animal a=new Tiger();
  a.move();
  
  /*�|�y���sĶ�ɴ������~
  ((Bird)a).move();
  */
  
  if(a instanceof Bird)
  {
   ((Bird)a).move();	
  }	
  else
  {
   System.out.println("�����ܼ�a���i�૬��Bird");	
  }	
 }
}