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
 	 	System.out.println("�ڷ|�]�]����........");
 	 }		
 	 public void skill()
 	 {
 	 	System.out.println("�ڷ|���y........");
 	 }	
 	}	;
 	
  System.out.println("�ڪ��W�r�s�� "+dog.name);
 	dog.move();
 	dog.skill();
 }	
}	