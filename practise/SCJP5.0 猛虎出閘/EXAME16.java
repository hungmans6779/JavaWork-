public class EXAME16
{
 public static void main(String argv[])
 {
  new Thread()
  {
   public void run()
   {
    System.out.println("�Ĥ@");
   }
  }.start();
  new Thread(new Runnable()
  {
   public void run()
   {
    System.out.println("�ĤG");	
   }		
  }).run();	
  
  /* ���~�g�k
  new Thread(new Runnable())
  {
   public void run()
   {
    System.out.println("�ĤT");	
   }		
  }.start();	
  */ 
 }
}