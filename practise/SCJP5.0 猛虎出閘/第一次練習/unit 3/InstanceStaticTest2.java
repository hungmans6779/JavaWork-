public class InstanceStaticTest2
{		
 void aMethod()
 {
  System.out.println(1);	
 }	
 public class InnerInstance extends InstanceStaticTest2
 {
  void aMethod()
  {
   super.aMethod();	
   System.out.println(2);	
  }	
 }
 public static class InnerStatic extends InstanceStaticTest2
 {
 	void aMethod()
 	{
 	 System.out.println(3);	
 	}	
 	static void bMethod()
 	{
 	 System.out.println(4);	
 	}
 }	
 public static void main(String argv[])
 {
 	new InstanceStaticTest2().new InnerInstance().aMethod();
 	new InnerStatic().aMethod();
  InnerStatic.bMethod();
 } 
}