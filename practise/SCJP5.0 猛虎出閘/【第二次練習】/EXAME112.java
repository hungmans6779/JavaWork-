public class EXAME112
{
 public static void main(String argv[])
 {
  new Thread()
  {
   public void run()
   {
   	System.out.println("1�ڳQ����F");
   }		
  }.start();	
  new Thread(new Runnable()
  {
   public void run()
   {
    System.out.println("2�ڳQ����F");	
   }		
  }).run();	
  
  new Thread()
  {
   new Runnable()
   {
    public void run()
    {
     System.out.println("3�ڳQ����F");	
    }		
   }	
  }.start();	
 }
}