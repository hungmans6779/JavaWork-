public class EXAME053_1
{
 static class A
 {
  void process() throws Exception { throw new Exception(); }	
 }	
 static class B extends A
 {
 	void process() {System.out.println("B"); }
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
   e.printStackTrace();
  }  
 }
}