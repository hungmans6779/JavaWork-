public class EXAME1_9 implements Runnable
{ 
 public static void main(String argv[])
 {
  Thread t=new Thread(new EXAME1_9());
  t.start();
 }
 public int run()
 {
  for(int i=0;i<10;i++)
  {
   System.out.println(i);
  }
 }
}