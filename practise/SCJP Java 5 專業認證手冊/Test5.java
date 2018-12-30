public class Test5
{
 public static void main(String argv[])
 {
  Ru t=new Ru();
  t.start();
 }
}

class Ru extends Thread
{
 public void run()
 {
  System.out.println("我執行到了");
 }
}