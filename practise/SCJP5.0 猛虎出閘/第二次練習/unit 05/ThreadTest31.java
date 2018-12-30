public class ThreadTest31 extends Thread
{
 public static void main(String argv[])
 {
 	ThreadTest31 t=new ThreadTest31();
 	t.setName("T1");
 	System.out.println("現在的執行緒有: "+Thread.activeCount()+" 條");
 	t.start();
 	System.out.println("現在的執行緒有: "+Thread.activeCount()+" 條");

 }		
 public void run()
 {
  for(int i=1;i<=10;i++)
  {
   System.out.println("執行緒名稱:"+Thread.currentThread().getName()+" : "+i); 
  }
 }
}