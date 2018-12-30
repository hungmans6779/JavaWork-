public class EXAME18 extends Thread
{
 private int num;
 private boolean isComplete;
 private int result;
 public EXAME18(int num)
 {
  this.num=num;
 }
 public synchronized void run()
 {
  result=num*2;
  isComplete=true;
  notify();
 }
 public synchronized int getResult()
 {
  while(!isComplete)
  {
   try
   {
    wait();
   }
   catch(InterruptedException ie)
   {
    ie.printStackTrace();
   }
  }
  return result;
 }
 public static void main(String argv[])
 {
  EXAME18 ex[]=new EXAME18[4];
  for(int i=0;i<4;i++)
  {
   ex[i]=new EXAME18(i);
   ex[i].start();
  }
  for(EXAME18 ee:ex)
  {
   System.out.print(ee.getResult()+" ");
  }
 }
}