import java.io.*;
public class Index
{
 public static void main(String argv[])
 {
  String str="";
  int value=0;
  int a[]=new int[0];
  int b[]=new int[0];  
 
  InputStreamReader ir=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(ir);
  try
  {
   Author.showAuthor();
   System.out.print("�п�J�z���}�C�j�p��: ");
   str=br.readLine();
   value=Integer.parseInt(str);
   a=new int[value];
   b=new int[value*2];
  }
  catch(IOException e)
  {
   e.printStackTrace();
  }
  
  System.out.print("================================================================================");
  for (int i=0;i<a.length;i++)
  {
   a[i]=i;
   b[i]=i;
   b[a.length+i]=i+a.length;
  }
  System.out.println("�����a[]��b[]�}�C���e�Ȧp�U");
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
   System.out.print("\n================================================================================");
    
   System.out.print("\n================================================================================");
   System.out.println("�{���y�k===>System.arraycopy(�ӷ��}�C,�ӷ�����,�ت��}�C,�ت�����,�ƻs�Ӽ�);");
   System.out.print("================================================================================");
   System.out.println("a[]�}�C�Ҧ����e�ƻs��b[]�}�C���ޭȬ�"+a.length+"����....");
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
  System.out.println("\n================================================================================");
  System.gc();
 }
}