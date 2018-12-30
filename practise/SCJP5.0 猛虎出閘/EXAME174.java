public class EXAME174 extends Thread
{
 public static void main(String argv[]) throws Exception
 {
  EXAME174 t=new EXAME174();
  t.start();
  t.join();
  t.run();
  t.doIt();
 }
 public void run()
 {
  System.out.print("Run. ");	
 }	
 public void doIt()
 {
 	System.out.print("DoIt. ");
 }	
}