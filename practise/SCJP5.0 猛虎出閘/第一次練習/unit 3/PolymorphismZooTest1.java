class Animal
{
 void move()
 {
  System.out.println("����...............");
 }
}
class Cat extends  Animal
{
 void move()
 {
  System.out.println("�]�]����.............");
 }
 void skill()
 {
  System.out.println("�~��..............");
 }
}
class Tiger extends Cat
{
 void skill()
 {
  System.out.println("���y............");
 }
}
class Bird extends Animal
{
 void move()
 {
  System.out.println("������.............");
 }
}
public class PolymorphismZooTest1 
{
 public static void main(String argv[])
 {
  Tiger t1=new Tiger();
  t1.move();
  t1.skill();
  System.out.println("=============================");
  Cat t2=new Tiger();
  t2.move();
  t2.skill();
  System.out.println("=============================");
  Animal t3=new Tiger();
  t3.move();
  //t3.skill(); 
  ((Tiger)t3).skill();
  System.out.println("=============================");
  System.out.println(t3 instanceof Bird);
  if(t3 instanceof Bird)
  {
   ((Bird)t3).move();
  } 
  else
  {
   System.out.println("�����ܼ�t3���i�૬��Bird"); 	
  }	
  System.out.println("=============================");
  //((Bird)t2).move();
 }
}