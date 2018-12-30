public class runFinalizationTest1
{
 static int count;
 runFinalizationTest1()
 {
  ++count;	
 }		
 public static void main(String argv[])
 {
  runFinalizationTest1 r1=new runFinalizationTest1();
  runFinalizationTest1 r2=new runFinalizationTest1();
  runFinalizationTest1 r3=new runFinalizationTest1();
  System.out.println("count:"+count);
  r2=null;
  System.gc();
  //Runtime.getRuntime().gc();
  //System.runFinalization();
  System.out.println("count:"+count);
 }
 protected void finalize() throws Throwable
 {
 	--count;
 	System.out.println("°õ¦æfinalize()ªº¬O:"+Thread.currentThread().getName());
 }	
}