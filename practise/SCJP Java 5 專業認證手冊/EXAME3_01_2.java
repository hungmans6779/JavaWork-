public class EXAME3_01_2
{
 static int x;
 static void thrower() throws Exception 
 {
 	x=42;
 	throw new Exception("���ҥ~�F");
 }	
 public static void main(String argv[])
 {
  try
  {
   thrower();	
   System.out.println("�ڦ��Q�����I�ҥH�S��Exception����");
  }	
  catch(Exception e)
  {
   x++;	
   System.out.println(e);
  }	
  finally
  {
   System.out.println("x = "+ ++x);	
  }	
 }
}