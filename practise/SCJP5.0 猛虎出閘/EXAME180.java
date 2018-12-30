public class EXAME180 
{
 public static void main(String argv[])
 {
  new EXAME180().go();
 }
 
 public void go()
 {
  Runnable r=new Runnable()
  {
   public void run()
   {
    System.out.println("foo");
   }
  };
 Thread t=new Thread(r);
 t.start();
 t.start();
 };
}