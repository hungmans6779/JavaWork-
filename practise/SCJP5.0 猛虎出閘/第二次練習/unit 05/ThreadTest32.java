public class ThreadTest32 extends Thread
{
 public static void main(String argv[])
 {
 	ThreadTest32 t1=new ThreadTest32();
 	ThreadTest32 t2=new ThreadTest32();
 	t1.setName("T1");
 	t2.setName("T2");
 	t1.start();
 	t2.start();
 	System.out.println("現在的執行緒有: "+Thread.activeCount()+" 條");

 }		
 public void run()
 {
  for(int i=1;i<=99;i++)
  {
   System.out.println("執行緒名稱:"+Thread.currentThread().getName()+" : "+i); 
  }
 }
}