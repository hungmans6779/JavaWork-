public class ErrorTest2
{
 public static void main(String argv[])
 {
 	try
 	{
   aMethod();
  }
  catch(Error e)
  {
   System.out.println("我捕捉到例外了");	
  }	 
  finally
  {
   System.out.println("再見");	
  }	
 }
 static void aMethod()
 {
  doStuff();
 }
 static void doStuff()
 {
  try
  {
   throw new Error();
  }
  catch(Error me)
  {
   throw me;
  }
 }
}