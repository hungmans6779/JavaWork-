class MyOuter 
{
 public static class MyInner
 { 
  public String show()
  {
   return "我被呼叫到了";
  }		
 }
}	


public class EXAME8_01_1
{
 public static void main(String argv[])
 {
  MyOuter.MyInner m1=new MyOuter.MyInner();	
  System.out.println(m1.show());
 }	
}