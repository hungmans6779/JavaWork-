public class EXAME9_04 extends Thread
{
 public static void main(String argv[])
 {
  EXAME9_04 t=new EXAME9_04();
  t.start();
  System.out.print("one");
  t.start();
  System.out.print("two");
 }
 public void run()
 {
  System.out.print("Threadtttt");	
 }	
}