public class cTest2
{
 static int count=0;
 public cTest2(int i)
 {
 	count=i;
  System.out.println("�إߤF��"+count+"����");	
 }	
 public static void main(String argv[])
 {
  System.out.println("�ثe�O���骺�j�p:"+Runtime.getRuntime().freeMemory()+"bytes.");
  cTest2 b[]=new cTest2[100];
  for(int i=0;i<b.length;i++)
  {
   b[i]=new cTest2(i+1);
   b[i]=null;
   System.gc();
  }	
 }
  protected void finalize()
  {
   System.out.println("**********************************************************");		
   System.out.println("������"+count+"�Ӫ���"); 	
   System.out.println("�ڰ����Ffinalize....");	
   //System.out.println("�ثe�O���骺�j�p:"+Runtime.getRuntime().freeMemory()+"bytes.");
   System.out.println("**********************************************************");
  }	
}