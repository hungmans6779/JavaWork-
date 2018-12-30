public class OutClassTest1
{
 public static void main(String argv[])
 {
  new OutClassTest1().new InnerClass().foo();
 }		
 class InnerClass
 {
  void foo()
  {
   System.out.println("§Ú¬Ofoo");	
  }		
  int i=10;
  int i1=20;	
 }		
}	