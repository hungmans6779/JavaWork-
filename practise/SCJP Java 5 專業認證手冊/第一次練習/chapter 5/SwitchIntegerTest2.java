public class SwitchIntegerTest2
{
 public static void main(String argv[])
 {
 	final int x1=10;
  Integer x=10;
  switch(x)
  {
   case 5: System.out.println("5");break;
   case x1: System.out.println("10");break;
   case 12: System.out.println("12");break;
   default:assert false;	
  }	
 }
}