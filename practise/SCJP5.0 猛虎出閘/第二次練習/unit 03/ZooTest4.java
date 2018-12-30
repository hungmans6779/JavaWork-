class Animal
{
 public void move()
 {
  System.out.println("移動...");
 }
}

class Cat extends Animal
{
 public void move()
 {
  System.out.println("跑跑跳跳...");
 }
 public void skill()
 {
  System.out.println("洗澡...");
 } 
}

class Bird extends Animal
{
 public void move()
 {
  System.out.println("飛飛飛...");
 }
}

class Tiger extends Cat
{
 public void skill()
 {
  System.out.println("狩獵...");
 }
}

public class ZooTest4 
{
 public static void main(String argv[])
 {
  Animal a=new Tiger();
  a.move();
  
  /*會造成編譯時期的錯誤
  ((Bird)a).move();
  */
  
  if(a instanceof Bird)
  {
   ((Bird)a).move();	
  }	
  else
  {
   System.out.println("物件變數a不可轉型為Bird");	
  }	
 }
}