public class EXAME113_1 implements Runnable
{
 public static void main(String argv[]) throws InterruptedException
 {
  Thread t1=new Thread(new EXAME113_1());
  t1.start(); 
  t1.join();
  System.out.println("End of method");
 }
 public void run()
 {
  System.out.println("run ...");
  throw new RuntimeException("Program");	
 }	
}