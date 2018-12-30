public class EXAME113 implements Runnable
{
 public void run()
 {
  System.out.println("run . ");
  throw new RuntimeException("Program");
 }
 public static void main(String argv[]) throws InterruptedException
 {
 	Thread t=new Thread(new EXAME113());
 	t.start();
  t.join();
 	System.out.println("End of method.");
 }	
}