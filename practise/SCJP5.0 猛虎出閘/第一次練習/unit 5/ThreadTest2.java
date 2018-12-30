public class ThreadTest2 extends Thread
{
 public static void main(String argv[])
 {
  ThreadTest2 t1=new ThreadTest2();
  t1.setName("T1");
  t1.start();
  System.out.println("現在可用的執行為: "+Thread.activeCount()+" 條");
 }
 public void run()
 {
  for(int i=0;i<100;i++)
  {
   String name=Thread.currentThread().getName();
   System.out.println(name+" : 第 "+i+" 次"); 
  } 
 }


}
