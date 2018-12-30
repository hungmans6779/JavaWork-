public class EXAME112
{
 public static void main(String argv[])
 {
  new Thread()
  {
   public void run()
   {
   	System.out.println("我是方法一執行了");
   }		
  }.start();	 
  
  new Thread(new Runnable()
  {
   public void run()
   {
    System.out.println("我是方法二執行了");	
   }		  	
  }).run();
  
  new Thread()
  {
   new Runnable()
   {
    public void run()
    {
     System.out.println("我是方法三執行了");	
    }		
   }		
  }.start();	
  
 }
}