public class Test1
{
 public static void main(String argv[])
 {
  int a[]=new int[1000000];
  int b[]=new int[2000000];
  for (int i=0;i<a.length;i++)
  {
   a[i]=i;
   b[i]=i;
   b[i+10]=i+10;
  }
  System.out.println("\n�����a[]��b[]�}�C���e�Ȧp�U");
  System.out.print("a[]�}�C�����e��: ");
  for (int j=0;j<a.length;j++)
  {
      System.out.print("a["+j+"]="+a[j]+",");
  }    
  System.out.print("\n\nb[]�}�C�����e��: ");
  
  for (int j=0;j<b.length;j++)
  {
      System.out.print("b["+j+"]="+b[j]+",");
  }    
  
   System.out.println("\n\n\na[]�}�C�Ҧ����e�ƻs��b[]�}�C���ޭȬ�10����....");
   System.out.println("a[]��b[]�}�C�����e�Ȧp�U......");
   
   System.arraycopy(a,0,b,a.length,a.length);
   
    for (int j=0;j<a.length;j++)
   {
      System.out.print("a["+j+"]="+a[j]+",");
   }    
   System.out.print("\n\nb[]�}�C�����e��: ");
  
   for (int j=0;j<b.length;j++)
   {
      System.out.print("b["+j+"]="+b[j]+",");
   }    
 }
}