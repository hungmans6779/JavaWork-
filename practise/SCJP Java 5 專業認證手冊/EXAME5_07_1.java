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
   System.out.println("�ڤw�g������NumberFormatException �ҥ~");	
   nfe.printStackTrace();	
  }	 
  
  try
  {
   int x=Integer.parseInt("three");	
  }
  catch(IllegalArgumentException iae)
  {
   System.out.println("�ڤw�g������IllegalArgumentException ���ҥ~�F");	
   iae.printStackTrace();
  }		
  
 }
}