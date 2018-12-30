public class ExceptionTest4
{
 public static void main(String argv[])
 {
 	try
 	{
   amethod();
  }
  catch(NoClassDefFoundError ae)
  {
   System.out.println("§Ú®·®»¨ì¨Ò¥~");
  }	 
 }
 static void amethod()
 {
  bmethod();
 }
 static void bmethod()
 {
 	cmethod();
 }
 static void cmethod()
 {
 	throw new NoClassDefFoundError();
 }
}