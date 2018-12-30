public class EXAME12 implements Runnable
{
 public static void main(String argv[])
 {
  Thread t=new Thread(new EXAME12());
  t.run();
  t.run();
  t.start();
 }
 public void run()
 {
 	System.out.print("running");
 }	
}