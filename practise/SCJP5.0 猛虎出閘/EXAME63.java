public class EXAME63
{
 public static void main(String argv[])
 {
 	try
 	{
   argv=null;
   argv[0]="test";
   System.out.println(argv[0]);
  }
  catch(Exception e)
  {
   System.out.println("Exception");	
  } 
 }
}