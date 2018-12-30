interface Pet
{
 String name="pet";
 void move();
 void skill();
}
public class InterfaceDogTest1 implements Pet
{
 public void move()
 {
 	System.out.println("我是會跑跑跳跳的...........");
 }		
 public void skill()
 {
 	System.out.println("我會狩獵..........");
 }	
 public static void main(String argv[])
 {
 	InterfaceDogTest1 dog=new InterfaceDogTest1();
  System.out.println("我的名字叫做 "+dog.name);
 	dog.move();
 	dog.skill();
 
 }	
}	