public class EXAME112
{
 public static void main(String argv[])
 {
  new Thread()
  {
   public void run()
   {
   	System.out.println("�ڬO��k�@����F");
   }		
  }.start();	 
  
  new Thread(new Runnable()
  {
   public void run()
   {
    System.out.println("�ڬO��k�G����F");	
   }		  	
  }).run();
  
  new Thread()
  {
   new Runnable()
   {
    public void run()
    {
     System.out.println("�ڬO��k�T����F");	
    }		
   }		
  }.start();	
  
 }
}