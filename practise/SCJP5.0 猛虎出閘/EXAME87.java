public class EXAME87
{
 public static void main(String argv[]) 
 {
  try
  {
   test();
  } 
  catch(Exception e)
  {
   System.out.println("Exception");
  }
  System.out.println("end");
 }
 static void test() throws Error
 {
  if(true) throw new AssertionError();
  System.out.println("test");
 }

}