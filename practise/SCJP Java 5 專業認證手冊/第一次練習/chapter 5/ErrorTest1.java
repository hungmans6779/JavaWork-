public class ErrorTest1
{
 public static void main(String argv[])
 {
 	try
 	{
   amethod();
  }
  catch(OutOfMemoryError ae)
  {
   System.out.println("�ڮ�����ҥ~");
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
 	throw new OutOfMemoryError();
 }
}