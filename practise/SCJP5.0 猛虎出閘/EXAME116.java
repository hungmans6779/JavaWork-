public class EXAME116 extends Thread
{
 public void run()
 { m1(); }
 EXAME116(String threadName)
 { super(threadName); }
 public synchronized void m1()
 {
  System.out.println(Thread.currentThread().getName());
 }
 public static void main(String argv[])
 {
  EXAME116 ee1=new EXAME116("A");
  EXAME116 ee2=new EXAME116("B");
  ee1.setPriority(Thread.MIN_PRIORITY);
  ee2.setPriority(Thread.MAX_PRIORITY);
  ee1.start();
  Thread.yield();
  ee2.start();
 }
}