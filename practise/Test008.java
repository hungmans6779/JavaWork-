public class Test008
{
 public static void main(String argv[])
 {
  Runtime rt=Runtime.getRuntime();
  System.out.println("Before run....");
  System.out.println(rt.freeMemory()+"/"+rt.totalMemory());
  String data[]=new String[Short.MAX_VALUE];
  System.out.println(rt.freeMemory()+"/"+rt.totalMemory());
  for(int i=0;i<data.length;i++)
   data[i]=null;
  System.gc();
  System.out.println(rt.freeMemory()+"/"+rt.totalMemory());
 }
}