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
   System.out.println("�ڮ����첧�`�F");
   //System.exit(0);
   return;
  }
  finally
  {
   System.out.println("�A��");
  }
 }
}