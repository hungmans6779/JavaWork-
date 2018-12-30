public class SwitchIntegerTest3
{
 public static void main(String argv[])
 {
 	final int x1=10;
 	final Integer x2=20;
  Integer x=10;
  switch(x)
  {
   case 5: System.out.println("5");break;
   case x1: System.out.println("10");break;
   case x2: System.out.println("12");break;
   default:assert false;	
  }	
 }
}