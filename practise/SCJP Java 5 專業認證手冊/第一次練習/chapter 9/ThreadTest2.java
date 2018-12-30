class MyRunnable implements Runnable
{
 public void run()
 {
  System.out.println("Runnable....");
  System.out.println("Name : "+Thread.currentThread().getName());
 }
}

public class ThreadTest2
{
 public static void main(String argv[])
 {
 	System.out.println("¥D°õ¦æºüªºName : "+Thread.currentThread().getName());
  MyRunnable r=new MyRunnable();
  Thread t=new Thread(r);
  t.setName("Jacky");
  t.start();
 }
}