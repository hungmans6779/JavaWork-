public class Test43
{
 public static void main(String argv[])
 {
  byte b=2;
  switch(b)
  {
   case 1: System.out.println("1"); break;
   case 2: System.out.println("2"); break;
   case 127: System.out.println("127"); break;
   default: System.out.println("default"); break;	
  }	
 }
}