public class EXAME1 implements Runnable
{
 public static void main(String argv[])
 {
  new Thread(new EXAME1("Wallace")).start();
  new Thread(new EXAME1("Gromit")).start();
 }
 private String name;
 public EXAME1(String name)
 {
  this.name=name;
 }
 public void run()
 {
 	try
 	{
 		Thread.sleep(3000);
 	}
 	catch(InterruptedException ie){}	
  message(1);
  message(2);
 }
 private synchronized void message(int n)
 {
  System.out.print(name+"-"+n+" ");
 }
}