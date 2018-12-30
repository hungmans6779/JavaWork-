public class EXAME3_01_2
{
 static int x;
 static void thrower() throws Exception 
 {
 	x=42;
 	throw new Exception("有例外了");
 }	
 public static void main(String argv[])
 {
  try
  {
   thrower();	
   System.out.println("我有被執行到！所以沒有Exception產生");
  }	
  catch(Exception e)
  {
   x++;	
   System.out.println(e);
  }	
  finally
  {
   System.out.println("x = "+ ++x);	
  }	
 }
}