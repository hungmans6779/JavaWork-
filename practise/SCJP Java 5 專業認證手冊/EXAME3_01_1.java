public class EXAME3_01_1
{
 static int thrower() throws Exception 
 {
  return 42;
 }	
 public static void main(String argv[])
 {
  int x=0;
  try
  {
   x=thrower();	
   System.out.println("我有被執行到！所以沒有Exception產生");
  }	
  catch(Exception e)
  {
   x++;	
  }	
  finally
  {
   System.out.println("x = "+ ++x);	
  }	
 }
}