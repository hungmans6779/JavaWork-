public class MyClassTest1
{
 static int i=10;	
 public static void main(String argv[])
 {
  new MyClassTest1().amethod();
 }
 public void amethod()
 {
  System.out.println("test");
  System.out.println(i);
  class InnerInstanceClass
  {
  	
  }		
 }
}