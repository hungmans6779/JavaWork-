abstract class AbstractTest7
{
 abstract void move();
 public AbstractTest7()
 {
 	System.out.println("�ڬO�@���p�p��.......");
 }
 private AbstractTest7(int i)
 {
 	
 }	
 public static void main(String argv[])
 {
 	new AbstractTest7()
 	{
 	 void move()
 	 {
 	 	System.out.println("�o�Q�n���]������...........");
 	 }		
 	}.move();	
 }		
}