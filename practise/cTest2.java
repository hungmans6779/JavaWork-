public class cTest2
{
 static int count=0;
 public cTest2(int i)
 {
 	count=i;
  System.out.println("建立了第"+count+"物件");	
 }	
 public static void main(String argv[])
 {
  System.out.println("目前記憶體的大小:"+Runtime.getRuntime().freeMemory()+"bytes.");
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
   System.out.println("執行到第"+count+"個物件的"); 	
   System.out.println("我執行到了finalize....");	
   //System.out.println("目前記憶體的大小:"+Runtime.getRuntime().freeMemory()+"bytes.");
   System.out.println("**********************************************************");
  }	
}