public class RuntimeTestv1
{
 public static void main(String argv[])
 {
  System.out.println("\n�{���}�l����......");
  //Runtime rt=Runtime.getRuntime();
  //System.out.println("Free/Total Memory (bytes):"+rt.freeMemory()+"/"+rt.totalMemory());
  System.out.println("Free/Total Memory (bytes):"+  Runtime.getRuntime().freeMemory()+"/"+  Runtime.getRuntime().totalMemory());
   
  MyObject obj1=new MyObject(1);
  MyObject obj2=new MyObject(2);
  MyObject obj3=new MyObject(3);
  System.out.println("\n�إ�obj1,obj2,obj3��MyObject�������......");
  //System.out.println("Free/Total Memory (bytes):"+rt.freeMemory()+"/"+rt.totalMemory());
  System.out.println("Free/Total Memory(bytes):"+Runtime.getRuntime().freeMemory()+"/"+Runtime.getRuntime().totalMemory());
  
  obj1=null;
  obj2=null;
  obj3=null;
  System.out.println("\n�M��obj1,obj2,obj3��MyObject�������......");
  System.gc();
  //Runtime.getRuntime().gc();
  //System.out.println("Free/Total Memory (bytes):"+rt.freeMemory()+"/"+rt.totalMemory());
  System.out.println("Free/Total Memory(bytes):"+Runtime.getRuntime().freeMemory()+"/"+Runtime.getRuntime().totalMemory());
 }
}