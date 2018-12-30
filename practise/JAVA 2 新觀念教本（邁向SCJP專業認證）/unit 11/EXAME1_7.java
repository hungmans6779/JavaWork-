public class EXAME1_7
{
 public static void main(String argv[])
 {
  try
  {
   m();
  }
  catch(Throwable e)
  {
   System.exit(0);
  }
  finally
  {
   System.out.println("In finally");
  }
 }
 static void m() throws Throwable
 {
  throw new Error();
 }
}