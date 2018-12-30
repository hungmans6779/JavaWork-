public class EX5
{
 public static void main(String argv[]) throws InterruptedException
 {
  PriorityTest p[]=new PriorityTest[3];
  Thread t[]=new Thread[p.length];
  for(int i=0;i<3;i++)
  {
   p[i]=new PriorityTest();
   t[i]=new Thread(p[i]);
  }
  t[0].setPriority(Thread.MIN_PRIORITY);
  t[2].setPriority(Thread.MAX_PRIORITY);
  for(int i=0;i<p.length;i++)
  {
   System.out.print(wr(t[i].getPriority()));
   t[i].start();
  }
  System.out.println("\n====================================================================");
  for(int i=0;i<10;i++)
  {
   Thread.sleep(100);
   System.out.println(wr(p[0].n)+wr(p[1].n)+wr(p[2].n));
  }
  System.exit(0);
 }
 static String wr(long n)
 {
  String str="                  "+n;
  return str.substring(str.length()-13);
 }
}

class PriorityTest implements Runnable
{
 long n;
 public void run()
 {
  for(long i=0;i<Long.MAX_VALUE;i++)
  {
   n++;
  }
 }
}