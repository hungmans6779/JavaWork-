public class ThreadTest31 extends Thread
{
 public static void main(String argv[])
 {
 	ThreadTest31 t=new ThreadTest31();
 	t.setName("T1");
 	System.out.println("�{�b���������: "+Thread.activeCount()+" ��");
 	t.start();
 	System.out.println("�{�b���������: "+Thread.activeCount()+" ��");

 }		
 public void run()
 {
  for(int i=1;i<=10;i++)
  {
   System.out.println("������W��:"+Thread.currentThread().getName()+" : "+i); 
  }
 }
}