public class EXAME5_14
{
 static String s="-";
 public static void main(String argv[])
 {
  try
  {
   throw new Exception();
  }
  catch(Exception e)
  {
   try
   {
   	try
   	{
   		throw new Exception();
   	}
   	catch(Exception eee)
   	{
   	 s+="ic ";	
   	}		
   	throw new Exception();
   }
   catch(Exception ee)
   {
   	s+="mc ";
   }
   finally
   {
    s+="mf ";	
   }			
  }
  finally
  {
   s+="of ";
  }
  System.out.println(s);
 }
}