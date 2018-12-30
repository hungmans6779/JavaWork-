public class EXAME115 extends Thread
{
 private static int x;
 public static synchronized void doThings()
 {
  int current=x;
  current++;
  x=current;
  System.out.println("current = "+current);
  System.out.println("x = "+x);
 }
 public void run()
 {
  doThings();
 }
 public static void main(String agv[])
 {
  EXAME115 t=new EXAME115();
 	t.start();
 }
}