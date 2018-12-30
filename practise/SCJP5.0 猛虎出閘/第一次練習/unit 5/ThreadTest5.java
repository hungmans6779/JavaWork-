public class ThreadTest5 implements Runnable
{
 public static void main(String argv[])
 {
  Thread t1=new Thread(new ThreadTest5());
  t1.start();
 }
 public void run()
 {
  for(int i=0;i<10;i++)
  {	
   System.out.println(i);
  }
 }
}