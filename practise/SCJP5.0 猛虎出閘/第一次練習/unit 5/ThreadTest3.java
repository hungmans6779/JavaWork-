public class ThreadTest3 extends Thread
{
 public static void main(String argv[])
 {
  ThreadTest3 t1=new ThreadTest3();
  ThreadTest3 t2=new ThreadTest3();
  t1.setName("T1");
  t2.setName("T2");
  t1.start();
  t2.start();
  System.out.println("現在可用的執行為: "+Thread.activeCount()+" 條");
 }
 public void run()
 {
  for(int i=0;i<9999;i++)
  {
   String name=Thread.currentThread().getName();
   System.out.println(name+" : 第 "+i+" 次"); 
  } 
 }
}
