public class EXAME16
{
 public static void main(String argv[])
 {
  new Thread(new Runnable()
  {
   public void run()
   {
    System.out.println("我被執行到了");	
   }		
  }).run();	
 }
}