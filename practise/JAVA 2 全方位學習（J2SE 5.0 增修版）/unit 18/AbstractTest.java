public class AbstractTest extends abstractT1
{
 public static void main(String argv[])
 {
 	AbstractTest tt=new AbstractTest();
 	tt.move();
 }		
 public void move()
 {
   System.out.println("test");	
 }	

}
abstract class abstractT1
{
 public abstract void move();
}