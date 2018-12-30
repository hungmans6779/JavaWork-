public class EXAME14
{
 void waitForSignal()
 {
  Object obj=new Object();
  synchronized(Thread.currentThread())
  {
   obj.wait();
   obj.notify();
  }
 }
}