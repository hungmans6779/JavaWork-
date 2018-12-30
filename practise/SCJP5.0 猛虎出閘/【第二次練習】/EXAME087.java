public class EXAME087
{
 public static void test() throws Error
 {
  if(true) throw new AssertionError();
  System.out.println("test");
 }
 public static void main(String argv[])
 {
  try
  {
   test();
  }
  catch(Exception e)
  {
   System.out.println("exception ");
  }
  System.out.println("end");
 }
}