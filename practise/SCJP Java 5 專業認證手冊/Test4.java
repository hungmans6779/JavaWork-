public class Test4
{
 public static void main(String argv[])
 {
 	Runnable r=new Ru();
  Thread t=new Thread(r);
  t.start();
 }
}

class Ru implements Runnable
{
 public void run()
 {
  System.out.println("我執行到了");
 }
}