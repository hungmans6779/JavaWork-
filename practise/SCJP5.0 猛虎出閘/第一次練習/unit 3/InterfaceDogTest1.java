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
 	System.out.println("�ڬO�|�]�]������...........");
 }		
 public void skill()
 {
 	System.out.println("�ڷ|���y..........");
 }	
 public static void main(String argv[])
 {
 	InterfaceDogTest1 dog=new InterfaceDogTest1();
  System.out.println("�ڪ��W�r�s�� "+dog.name);
 	dog.move();
 	dog.skill();
 
 }	
}	