class Animal
{
 public void move()
 {
  System.out.println("����......");
 } 
}

class Bird extends Animal
{
 public void move()
 {
  System.out.println("��......");
 }
}

class Cat extends Animal
{
 public void move()
 {
  System.out.println("�]�]����.....");
 }
 public void skill()
 {
  System.out.println("�~��.....");
 }
}

class Tiger extends Cat
{
 public void skill()
 {
  System.out.println("���y.....");
 }
}

public class Zoo1
{
 public static void main(String argv[])
 {
 	System.out.println("�H�Ѫꪺ�[�I�Ӭݦۤv......");
 	Tiger t1=new Tiger();
 	t1.move();
 	t1.skill();
  System.out.println("==========================");
 	System.out.println("�H�ߪ��[�I�ӬݦѪ�......");
 	Cat c1=new Tiger();
 	c1.move();
 	c1.skill();
 	((Animal)c1).move();
 	System.out.println("==========================");
 	System.out.println("�H�ʪ����[�I�ӬݦѪ�......");
 	Animal a1=new Tiger();
 	a1.move();
 	((Tiger)a1).skill();
 	((Cat)a1).skill();
 }	
}