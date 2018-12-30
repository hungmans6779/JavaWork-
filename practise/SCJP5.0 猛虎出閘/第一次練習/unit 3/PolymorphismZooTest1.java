class Animal
{
 void move()
 {
  System.out.println("移動...............");
 }
}
class Cat extends  Animal
{
 void move()
 {
  System.out.println("跑跑跳跳.............");
 }
 void skill()
 {
  System.out.println("洗澡..............");
 }
}
class Tiger extends Cat
{
 void skill()
 {
  System.out.println("狩獵............");
 }
}
class Bird extends Animal
{
 void move()
 {
  System.out.println("飛飛飛.............");
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
   System.out.println("物件變數t3不可轉型為Bird"); 	
  }	
  System.out.println("=============================");
  //((Bird)t2).move();
 }
}