class WrongDefineException extends RuntimeException
{
 public WrongDefineException()
 {
  super("�ڬO�ۦ�w�q��wrongDefineException");	
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
 	 System.out.println("�ڳQ�����ҥ~�F...");
 	 System.out.println(e.getLocalizedMessage());	
 	}	 
 }
 public static  void testDefineException() throws WrongDefineException
 {
  throw new WrongDefineException("�ڬO�ۥѤH");	
 }			
}	