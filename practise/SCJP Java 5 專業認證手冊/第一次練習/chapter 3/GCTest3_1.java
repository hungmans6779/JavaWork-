class Island
{
 static long create=1;
 static long delete=1;	
 Island i;
 int num;
 Island()
 {
 	System.out.println(this+" �Q�إ߲� "+create+" ��");
 	create++;
 }	
 public void finalize()
 {
 	System.out.println(this+" �Q�^���� "+delete+" ��");
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
  System.out.println("�إ߫e�`�@�O����O : "+r.totalMemory()+" Bytes.");
  System.out.println("�إ߫e�Ѿl�O����O : "+r.freeMemory()+" Bytes.");
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
  System.out.println("�`�@�إߤF "+Island.create+" �Ӫ���");
  System.out.println("�`�@�Q�^�� "+Island.delete+" �Ӫ���");	
  System.out.println("�^���e�`�@�O����O : "+r.totalMemory()+" Bytes.");
  System.out.println("�^���e�Ѿl�O����O : "+r.freeMemory()+" Bytes.");

  
  System.out.println("�^�����`�@�O����O : "+r.totalMemory()+" Bytes.");
  System.out.println("�^����Ѿl�O����O : "+r.freeMemory()+" Bytes.");
  
 }
}