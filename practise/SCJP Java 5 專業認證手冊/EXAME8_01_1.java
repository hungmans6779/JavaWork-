class MyOuter 
{
 public static class MyInner
 { 
  public String show()
  {
   return "�ڳQ�I�s��F";
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