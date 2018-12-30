public  class EXAME9_15
{
 synchronized void a() {actBusy(); }
 static synchronized void b() {actBusy(); }
 static void actBusy()
 {
  try
  {
   Thread.sleep(1000);	
  }
  catch(InterruptedException ie){}		
 }	
 		
 public static void main(String argv[])
 {
  final EXAME9_15 x=new EXAME9_15();
  final EXAME9_15 y=new EXAME9_15();
  Runnable runnable=new Runnable()
  {
   public void run()
   {
    int option=(int)(Math.random()*4);
    switch(option)
    {
     case 0: x.a(); break;
     case 1: x.b(); break;
     case 2: y.a(); break;
     case 3: y.b(); break;	
    }	
   }		
  };
  Thread thread1=new Thread(runnable);
  Thread thread2=new Thread(runnable);	
  thread1.start();
  thread2.start();
 }
}