public class ExceptionTest3
{
 public static void main(String argv[])
 {
  try
  {
   throw new ArithmeticException();
  }
  catch(ArithmeticException ae)
  {
   System.out.println("我捕捉到異常了");
   //System.exit(0);
   return;
  }
  finally
  {
   System.out.println("再見");
  }
 }
}