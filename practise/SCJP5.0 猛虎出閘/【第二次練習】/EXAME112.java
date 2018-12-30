public class EXAME112
{
 public static void main(String argv[])
 {
  new Thread()
  {
   public void run()
   {
   	System.out.println("1我被執行了");
   }		
  }.start();	
  new Thread(new Runnable()
  {
   public void run()
   {
    System.out.println("2我被執行了");	
   }		
  }).run();	
  
  new Thread()
  {
   new Runnable()
   {
    public void run()
    {
     System.out.println("3我被執行了");	
    }		
   }	
  }.start();	
 }
}