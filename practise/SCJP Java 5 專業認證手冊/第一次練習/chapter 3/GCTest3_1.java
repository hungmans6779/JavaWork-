class Island
{
 static long create=1;
 static long delete=1;	
 Island i;
 int num;
 Island()
 {
 	System.out.println(this+" 被建立第 "+create+" 個");
 	create++;
 }	
 public void finalize()
 {
 	System.out.println(this+" 被回收第 "+delete+" 個");
 	delete++;
 }	
}
public class GCTest3_1
{
 public static void main(String argv[])
 {
 	long l=Long.MAX_VALUE;
  Island islan[]=new Island[Byte.MAX_VALUE*20];
  Runtime r=Runtime.getRuntime();
  System.out.println("建立前總共記憶體是 : "+r.totalMemory()+" Bytes.");
  System.out.println("建立前剩餘記憶體是 : "+r.freeMemory()+" Bytes.");
  int count=1;
  for(Island island:islan)
  {
   island=new Island();	
   island.num=count;
   count++;
  }  
  for(int n=0;n<islan.length-1;n++)
  {
   islan[n].i=islan[n+1];	
  }	
  for(int n=0;n<islan.length-1;n++)
  {
   islan[n]=null;
  }	
  System.out.println("============================================\n");
  System.out.println("總共建立了 "+Island.create+" 個物件");
  System.out.println("總共被回收 "+Island.delete+" 個物件");	
  System.out.println("回收前總共記憶體是 : "+r.totalMemory()+" Bytes.");
  System.out.println("回收前剩餘記憶體是 : "+r.freeMemory()+" Bytes.");

  
  System.out.println("回收後總共記憶體是 : "+r.totalMemory()+" Bytes.");
  System.out.println("回收後剩餘記憶體是 : "+r.freeMemory()+" Bytes.");
  
 }
}