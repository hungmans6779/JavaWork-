public class Test020
{ 
 public static void main(String argv[])
 {
 	try
 	{
   Runtime.getRuntime().exec("cmd");
  }
  catch(Exception e)
  {
   e.printStackTrace();	
  }	 
 }
}