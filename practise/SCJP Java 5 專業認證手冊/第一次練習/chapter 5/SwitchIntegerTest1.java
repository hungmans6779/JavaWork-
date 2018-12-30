public class SwitchIntegerTest1
{
 public static void main(String argv[])
 {
  Integer x=10;
  switch(x)
  {
   case 5: System.out.println("5");break;
   case 10: System.out.println("10");break;
   case 12: System.out.println("12");break;
   default:assert false;	
  }	
 }
}