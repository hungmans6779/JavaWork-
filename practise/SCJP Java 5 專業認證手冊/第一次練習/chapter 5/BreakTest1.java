public class BreakTest1
{
 public static void main(String argv[])
 {
  boolean b=true;
  outer:
  for(int i=0;i<5;i++)
  {
   while(b)
   {
    System.out.println("Hello");
    break outer;
   }
   System.out.println("Java");
  }
  System.out.println("Good-Bye");
 }
}