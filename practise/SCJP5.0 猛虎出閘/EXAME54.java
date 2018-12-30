public class EXAME54
{
 public static void main(String argv[])
 {
  try
  {
  	throw new NullPointerException();
  }	
  catch(NullPointerException npe)
  {
  	System.out.print("a");
  }	
  catch(RuntimeException re)
  {
  	System.out.print("b");
  }	
  finally
  {
  	System.out.print("c");
  }
 } 	
}