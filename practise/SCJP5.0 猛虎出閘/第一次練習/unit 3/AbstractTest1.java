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
   	System.out.println("我是抽象類別的方法");
   }		
  }.greet();	
 }
}