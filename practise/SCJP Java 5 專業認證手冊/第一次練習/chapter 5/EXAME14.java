public class EXAME14
{
 public static void main(String argv[])
 {
 	String s="-";
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
    catch(Exception e1)
    {
     s+="ic ";	
    }	
    throw new Exception(); 
   }
   catch(Exception e2)
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