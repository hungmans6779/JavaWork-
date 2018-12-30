public class EXAME53_1
{
 static class A
 {
  void process() throws Exception 
  { throw new Exception(); }	
 }
 static class B extends A
 {
 	void process()
 	{
 	 System.out.println("B");
 	}	
 }	
 public static void main(String argv[])
 {
  A a=new B();
  try
  {
   a.process();	
  }
  catch(Exception e)
  {
   System.out.println("丟出一個例外了");	
  }	 
 }	
}