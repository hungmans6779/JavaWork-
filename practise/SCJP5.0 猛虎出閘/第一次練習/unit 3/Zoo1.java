class Animal
{
 public void move()
 {
  System.out.println("移動......");
 } 
}

class Bird extends Animal
{
 public void move()
 {
  System.out.println("飛......");
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

public class Zoo1
{
 public static void main(String argv[])
 {
 	System.out.println("以老虎的觀點來看自己......");
 	Tiger t1=new Tiger();
 	t1.move();
 	t1.skill();
  System.out.println("==========================");
 	System.out.println("以貓的觀點來看老虎......");
 	Cat c1=new Tiger();
 	c1.move();
 	c1.skill();
 	((Animal)c1).move();
 	System.out.println("==========================");
 	System.out.println("以動物的觀點來看老虎......");
 	Animal a1=new Tiger();
 	a1.move();
 	((Tiger)a1).skill();
 	((Cat)a1).skill();
 }	
}