class WrongDefineException extends RuntimeException
{
 public WrongDefineException()
 {
  super("我是自行定義的wrongDefineException");	
 }	
 public WrongDefineException(String str)
 {
   super(str);
 }	
}

public class Test027
{
 public static void main(String argv[])
 {
 	try
 	{
 	 testDefineException();
 	}
 	catch(Exception e)
 	{
 	 System.out.println("我被執行到例外了...");
 	 System.out.println(e.getLocalizedMessage());	
 	}	 
 }
 public static  void testDefineException() throws WrongDefineException
 {
  throw new WrongDefineException("我是自由人");	
 }			
}	