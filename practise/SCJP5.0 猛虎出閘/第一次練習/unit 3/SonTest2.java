import java.io.*;
class Father
{
 void aMethod() throws IOException
 {
  System.out.println("Father");
 }
}

public class SonTest2 extends Father
{
 void aMethod() throws IOException
 {
  // super.aMethod();
  System.out.println("Son");
 }
 public static void main(String argv[])
 {
 	try
 	{
   new SonTest1().aMethod();
  }
  catch(Exception e)
  {
   e.printStackTrace();	
  }	 
 }
}