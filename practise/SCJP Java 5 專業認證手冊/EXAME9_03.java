public class EXAME9_03 implements Runnable
{
 public void run()
 { }
 public static void main(String argv[])
 {
 	Runnable target=new EXAME9_03();
 	Thread myThread=new Thread(target);
 	myThread.start();
 }	
}