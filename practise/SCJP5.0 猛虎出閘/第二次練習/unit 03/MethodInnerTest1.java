public class MethodInnerTest1
{
 public static void main(String argv[])
 {
  new MethodInnerTest1().see();
 }
 public void see()
 {
 	class MyInner
 	{
 	 public void foo()
 	 {
 	  System.out.println("Hello MethodInner Class ");
 	 }		
 	}	
 	new MyInner().foo();
 }	
}