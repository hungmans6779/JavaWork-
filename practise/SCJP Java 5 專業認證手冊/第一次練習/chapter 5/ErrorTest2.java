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
   System.out.println("�ڮ�����ҥ~�F");	
  }	 
  finally
  {
   System.out.println("�A��");	
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