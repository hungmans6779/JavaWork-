public class EXAME16
{
 public static void main(String argv[])
 {
  new Thread()
  {
   public void run()
   {
    System.out.println("第一");
   }
  }.start();
  new Thread(new Runnable()
  {
   public void run()
   {
    System.out.println("第二");	
   }		
  }).run();	
  
  /* 錯誤寫法
  new Thread(new Runnable())
  {
   public void run()
   {
    System.out.println("第三");	
   }		
  }.start();	
  */ 
 }
}