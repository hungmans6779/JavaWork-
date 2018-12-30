public class ContinueTest2
{
 public static void main(String argv[])
 {
 	outer:
  for(int i=0;i<5;i++)
  {
   for(int j=0;j<5;j++)
   {
   	System.out.println("Hello");
   	continue outer;
   }	
   System.out.println("Java");
  }
  System.out.println("Good-Bye");	
 }
}