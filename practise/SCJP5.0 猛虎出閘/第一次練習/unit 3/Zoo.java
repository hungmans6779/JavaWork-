/* =================================================
            �{���W��:zoo.java
   =================================================*/
class Animal
{
 public void move()
 {
  System.out.println("����......");
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

public class Zoo
{
 public static void main(String argv[])
 {
 	System.out.println("�H�Ѫꪺ�[�I�Ӭݦۤv......");
 	Tiger t=new Tiger();
 	t.move();
 	t.skill();
 	
  System.out.println("================================================================");
 	System.out.println("�H�ߪ��[�I�ӬݦѪ�A���y�ܻ��]�N�O�Ҧ����Ѫ곣�i�H�ݦ��߬�ʪ�");
 	Cat c=new Tiger();
 	c.move();
 	c.skill();
 	
 	System.out.println("==========================");
 	System.out.println("�H�ʪ����[�I�ӬݦѪ�A���y�ܻ��]�N�O�Ҧ����Ѫ�i�H�ݦ��O�ʪ�");
 	Animal a=new Tiger();
 	a.move();
 }	
}