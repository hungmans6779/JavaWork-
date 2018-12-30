public class EXAME113 implements Runnable
{
 public static void main(String argv[])
 {
  Thread t1=new Thread(new EXAME113());
  t1.start(); 
  //t1.join();
  System.out.println("End of method");
 }
 public void run()
 {
  System.out.println("run ...");
  throw new RuntimeException("Program");	
 }	
}