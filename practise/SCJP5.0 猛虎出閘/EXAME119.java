public class EXAME119
{
 public static void main(String argv[])
 {
  try
  {
   float f=Float.parseFloat(3.32);
  }
  catch(NumberFormatException nfe)
  {
   nfe.printStackTrace();	
  }		
  finally
  {
   System.out.println("f = "+f);
  }	
 }
}