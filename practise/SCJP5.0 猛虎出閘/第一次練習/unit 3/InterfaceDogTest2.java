interface Pet
{
 String name="pet";
 void move();
 void skill();
}
public class InterfaceDogTest2
{
 public static void main(String argv[])
 {
 	Pet dog=new Pet()
 	{
 	 public void move()
 	 {
 	 	System.out.println("我會跑跑跳跳........");
 	 }		
 	 public void skill()
 	 {
 	 	System.out.println("我會狩獵........");
 	 }	
 	}	;
 	
  System.out.println("我的名字叫做 "+dog.name);
 	dog.move();
 	dog.skill();
 }	
}	