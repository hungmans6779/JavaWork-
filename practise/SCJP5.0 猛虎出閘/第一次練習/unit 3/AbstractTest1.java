abstract class Abstract11
{
 abstract  void greet();
}

public class AbstractTest1
{
 public static void main(String argv[])
 {
  new Abstract11()
  {
   void greet()
   {
   	System.out.println("�ڬO��H���O����k");
   }		
  }.greet();	
 }
}