public class EXAME15_1 implements Runnable
{
 public static void main(String argv[]) throws Exception
 {
  Thread t=new Thread(new EXAME15_1());
  t.start();
  System.out.print("Started");
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