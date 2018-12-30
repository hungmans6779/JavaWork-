public class EXAME178
{
 public static void main(String argv[])
 {
  new Thread(new Runnable()
  {
   public void run()
   {
    System.out.println("bar");
   }
  }).start();
 }
}