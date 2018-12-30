abstract class AbstractTest7
{
 abstract void move();
 public AbstractTest7()
 {
 	System.out.println("我是一隻小小鳥.......");
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
 	 	System.out.println("卻想要飛也飛不高...........");
 	 }		
 	}.move();	
 }		
}