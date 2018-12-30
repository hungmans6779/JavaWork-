public class EXAME112
{
 public static void main(String argv[])
 {
  new Thread()
  {
   new Runnable()
   {
    public void run()
    {
     System.out.println("我被執行了");	
    }		
   }		
  }.start();	
 }
}