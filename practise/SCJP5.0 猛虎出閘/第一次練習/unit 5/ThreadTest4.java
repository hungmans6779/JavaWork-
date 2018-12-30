public class ThreadTest4 extends Thread
{
 public static void main(String argv[])
 {
  ThreadTest4 t1=new ThreadTest4();
  ThreadTest4 t2=new ThreadTest4();
  t1.start();
  t2.start();
  t1.setName("T1");
  t1.setPriority(MAX_PRIORITY);
  t2.setName("T2");
  t2.setPriority(MIN_PRIORITY);
  int i=t1.getPriority();
  System.out.println(i);
  System.out.println("============");
  System.out.println("目前有幾個執行緒： "+Thread.activeCount());
  System.out.println("================");
 }
 public void run()
 {
 	for(int i=0;i<9999;i++)
 	{
 	 System.out.println(Thread.currentThread().getName()+":"+i);	
 	}	
 }	
}