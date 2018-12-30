public class ORTest1
{
 public static void main(String argv[])
 {
  if((isIt(3))||(isIt(7)))
  {
   System.out.println("Result is true");
  }
  if((isIt(6))||(isIt(9)))
  {
   System.out.println("Result is true");
  }
 }
 static boolean isIt(int i)
 {
  if(i<5)
  {
   System.out.println("i<5");
   return true;
  }
  else
  {
   System.out.println("i>=5");
   return false;
  }
 }
}