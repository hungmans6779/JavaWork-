public class EXAME13
{
 public static synchronized void main(String argv[]) throws InterruptedException
 {
  Thread t=new Thread();
  t.start();
  System.out.print("X");
  synchronized(t)
  {
   t.wait(10000);
  } 
  System.out.print("Y");
 
 }
}