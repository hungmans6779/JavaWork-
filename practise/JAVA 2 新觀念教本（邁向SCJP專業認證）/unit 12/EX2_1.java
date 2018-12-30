public class EX2_1 implements Runnable
{
 int n=0;
 public static void main(String argv[])
 {
  EX2_1 e=new EX2_1();
  Thread t=new Thread(e);
  t.start();
  for(int i=0;i<3000;i++)
  {
   if(((i+1)/30==0) && (i>30))
   {
   	System.out.println();
   }	
   e.show();
   try
   {
    Thread.sleep((int)Math.random()*10);	
   }
   catch(InterruptedException ie)
   {
   	ie.printStackTrace();
   }	 
  }	
  System.exit(0);
 }
 public void run()
 {
  while(true)
  {
   n=(n+1)%10;
  }		
 }
 public void show()
 {
 	System.out.print(n+" ");
 }		
}