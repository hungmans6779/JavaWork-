public class Test6
{
 public static void main(String argv[])
 {
  Thread t=new Thread(
   new Runnable()
   {
    public void run()
    {
     System.out.println("¶]§a¡I«Ä¤l");	
    }		
   }	
  );
  t.start();
 }
}