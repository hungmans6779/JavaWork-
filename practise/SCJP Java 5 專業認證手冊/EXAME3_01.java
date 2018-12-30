public class EXAME3_01
{
 static int thrower() throws Exception 
 {
  return 42;
 }	
 public static void main(String argv[])
 {
  try
  {
   int x=thrower();	
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