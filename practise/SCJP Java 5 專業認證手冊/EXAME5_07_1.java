public class EXAME5_07_1
{
 public static void main(String argv[])
 {
  try
  {
   int x=Integer.parseInt("two");	
  }
  catch(NumberFormatException nfe)
  {
   System.out.println("我已經捕捉到NumberFormatException 例外");	
   nfe.printStackTrace();	
  }	 
  
  try
  {
   int x=Integer.parseInt("three");	
  }
  catch(IllegalArgumentException iae)
  {
   System.out.println("我已經捕捉到IllegalArgumentException 的例外了");	
   iae.printStackTrace();
  }		
  
 }
}