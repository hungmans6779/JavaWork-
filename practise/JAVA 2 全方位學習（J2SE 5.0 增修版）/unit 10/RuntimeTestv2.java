public class RuntimeTestv2 
{
 static int i=0;
 public static void main(String argv[])
 {
 // Runtime rt=Runtime.getRuntime();
  System.out.println("�{������eFree/Total Memory (bytes)"+Runtime.getRuntime().freeMemory()+"/"+Runtime.getRuntime().totalMemory());
  //System.out.println("�{������eFree/Total Memory (bytes)"+rt.freeMemory()+"/"+rt.totalMemory());
  MyObject obj[]=new MyObject[10000];
  for (i=0;i<1000;i++)
  {
   obj[i]=new MyObject(i);
   System.out.println("�w�g�إ�obj"+i+"��data���Ȭ�"+obj[i].data);
   if (i % 500==0 && i!=0)
   {
    System.out.println("===============================================");
    System.out.println("�ثe��Free/Total Memory (bytes)"+Runtime.getRuntime().freeMemory()+"/"+Runtime.getRuntime().totalMemory());
    //System.out.println("�ثe��Free/Total Memory (bytes)"+rt.freeMemory()+"/"+rt.totalMemory());
    System.out.println("�}�l�^���O����귽.....");
    Runtime.getRuntime().gc();
    System.out.println("�^�������F......");
    System.out.println("�^���᪺Free/Total Memory (bytes)"+Runtime.getRuntime().freeMemory()+"/"+Runtime.getRuntime().totalMemory());
    //System.out.println("�^���᪺Free/Total Memory (bytes)"+rt.freeMemory()+"/"+rt.totalMemory());
    System.out.println("===============================================");
   }
  }
  System.out.println("\n\n***************************************************");
  System.out.println("�{���w���槹��..........");  
  System.out.println("�{������᪺Free/Total Memory (bytes)"+Runtime.getRuntime().freeMemory()+"/"+Runtime.getRuntime().totalMemory());
  //System.out.println("�{������᪺Free/Total Memory (bytes)"+rt.freeMemory()+"/"+rt.totalMemory());
  Runtime.getRuntime().gc();
  System.gc();
  //System.gc();
  System.out.println("�{�������A�̫������Free/Total Memory (bytes)"+Runtime.getRuntime().freeMemory()+"/"+Runtime.getRuntime().totalMemory());
  //System.out.println("�{�������A�̫������Free/Total Memory (bytes)"+rt.freeMemory()+"/"+rt.totalMemory());
  System.out.print("***************************************************");
 }
}
