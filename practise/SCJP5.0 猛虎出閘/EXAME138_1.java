public class EXAME138_1
{
 public static void main(String argv[])
 {
 	Integer i;
 	try
 	{
   i=Integer.parseInt(argv[0]);
  }
  catch(IndexOutOfBoundsException ioe)
  {
   System.out.println("Ãþ§OÂà´«¿ù»~");	
   //ioe.printStackTrace();	
  }	 
  int j=12;
  System.out.println("It is "+(j==i)+"that j==i.");
 }
}