public class EXAME13_1 implements Runnable
{
 static int x=0;
 public static void main(String argv[])
 {
  new EXAME13_1().go();
 }
 public void run()
 {
  for(int i=0;i<4;i++)
  {
   int count=x;
   System.out.print(count+",");
   x=count+2;	
  }	
 }
 
 public static void go()
 {
  Runnable r1=new EXAME13_1();
  new Thread(r1).start();
  new Thread(r1).start();
 }
}