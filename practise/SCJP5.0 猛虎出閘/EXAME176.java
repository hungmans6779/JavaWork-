public class EXAME176
{
 private boolean isReady=false;
 public synchronized void priduce()
 {
  isReady=true;
  notifyAll();	
 }	
 public synchronized void consume()
 {
  while(!isReady)
  {
   try
   {
   	wait();
   }
   catch(InterruptedException ie) {}		
  }
  isReady=false;		
 }	
 public static void main(String argv[])
 {
  
 }
}