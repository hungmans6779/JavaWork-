public class FinallyTest
{
 public static void main(String argv[])
 {
  int i=Integer.parseInt(argv[0]);
  try
  {
   int ans=10/i;
   System.out.println("\n\n10/"+i+" = "+ans);
  }
  catch(ArithmeticException e)
  {
   e.printStackTrace();
  }
  finally
  {
   System.out.println("這是finally的區塊.....");
  }
  System.out.println("程式到此結束....."); 
 }
}