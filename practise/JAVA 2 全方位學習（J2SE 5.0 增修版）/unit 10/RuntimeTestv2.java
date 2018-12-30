public class RuntimeTestv2 
{
 static int i=0;
 public static void main(String argv[])
 {
 // Runtime rt=Runtime.getRuntime();
  System.out.println("程式執行前Free/Total Memory (bytes)"+Runtime.getRuntime().freeMemory()+"/"+Runtime.getRuntime().totalMemory());
  //System.out.println("程式執行前Free/Total Memory (bytes)"+rt.freeMemory()+"/"+rt.totalMemory());
  MyObject obj[]=new MyObject[10000];
  for (i=0;i<1000;i++)
  {
   obj[i]=new MyObject(i);
   System.out.println("已經建立obj"+i+"其data的值為"+obj[i].data);
   if (i % 500==0 && i!=0)
   {
    System.out.println("===============================================");
    System.out.println("目前的Free/Total Memory (bytes)"+Runtime.getRuntime().freeMemory()+"/"+Runtime.getRuntime().totalMemory());
    //System.out.println("目前的Free/Total Memory (bytes)"+rt.freeMemory()+"/"+rt.totalMemory());
    System.out.println("開始回收記憶體資源.....");
    Runtime.getRuntime().gc();
    System.out.println("回收完畢了......");
    System.out.println("回收後的Free/Total Memory (bytes)"+Runtime.getRuntime().freeMemory()+"/"+Runtime.getRuntime().totalMemory());
    //System.out.println("回收後的Free/Total Memory (bytes)"+rt.freeMemory()+"/"+rt.totalMemory());
    System.out.println("===============================================");
   }
  }
  System.out.println("\n\n***************************************************");
  System.out.println("程式已執行完畢..........");  
  System.out.println("程式執行後的Free/Total Memory (bytes)"+Runtime.getRuntime().freeMemory()+"/"+Runtime.getRuntime().totalMemory());
  //System.out.println("程式執行後的Free/Total Memory (bytes)"+rt.freeMemory()+"/"+rt.totalMemory());
  Runtime.getRuntime().gc();
  System.gc();
  //System.gc();
  System.out.println("程式執行後，最後所釋放的Free/Total Memory (bytes)"+Runtime.getRuntime().freeMemory()+"/"+Runtime.getRuntime().totalMemory());
  //System.out.println("程式執行後，最後所釋放Free/Total Memory (bytes)"+rt.freeMemory()+"/"+rt.totalMemory());
  System.out.print("***************************************************");
 }
}
