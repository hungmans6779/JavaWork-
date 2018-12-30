public class EXAME1_10 extends Thread
{
 static String s="A";
 public static void main(String argv[])
 {
  EXAME1_10 t=new EXAME1_10();
  t.go();
  System.out.println(s);
 }
 public void go()
 {
  start();
  s+="B";
 }
 public void run()
 {
  s+="C";
 }
}