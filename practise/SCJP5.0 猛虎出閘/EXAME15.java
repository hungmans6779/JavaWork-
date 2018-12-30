public class EXAME15 implements Runnable
{
 public static void main(String argv[]) throws Exception
 {
  Thread t=new Thread(new EXAME15());
  t.start();
  System.out.print("Started");
  t.join();
  System.out.print("Complete");
 }
 public void run()
 {
  for(int i=0;i<4;i++)
  {
   System.out.print(i);
  }
 }
}