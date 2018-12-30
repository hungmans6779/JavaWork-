/* =================================================
            程式名稱:zoo.java
   =================================================*/
class Animal
{
 public void move()
 {
  System.out.println("移動......");
 } 
}

class Cat extends Animal
{
 public void move()
 {
  System.out.println("跑跑跳跳.....");
 }
 public void skill()
 {
  System.out.println("洗澡.....");
 }
}

class Tiger extends Cat
{
 public void skill()
 {
  System.out.println("狩獵.....");
 }
}

public class Zoo
{
 public static void main(String argv[])
 {
 	System.out.println("以老虎的觀點來看自己......");
 	Tiger t=new Tiger();
 	t.move();
 	t.skill();
 	
  System.out.println("================================================================");
 	System.out.println("以貓的觀點來看老虎，換句話說也就是所有的老虎都可以看成貓科動物");
 	Cat c=new Tiger();
 	c.move();
 	c.skill();
 	
 	System.out.println("==========================");
 	System.out.println("以動物的觀點來看老虎，換句話說也就是所有的老虎可以看成是動物");
 	Animal a=new Tiger();
 	a.move();
 }	
}