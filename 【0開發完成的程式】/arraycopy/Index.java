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
   System.out.print("請輸入您的陣列大小值: ");
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
  System.out.println("原先的a[]及b[]陣列內容值如下");
  System.out.print("a[]陣列的內容為: ");
  for (int j=0;j<a.length;j++)
  {
      System.out.print("a["+j+"]="+a[j]+",");
  }    
  System.out.print("\n\nb[]陣列的內容為: ");
  
  for (int j=0;j<b.length;j++)
  {
      System.out.print("b["+j+"]="+b[j]+",");
  }    
   System.out.print("\n================================================================================");
    
   System.out.print("\n================================================================================");
   System.out.println("程式語法===>System.arraycopy(來源陣列,來源索引,目的陣列,目的索引,複製個數);");
   System.out.print("================================================================================");
   System.out.println("a[]陣列所有內容複製到b[]陣列索引值為"+a.length+"之後....");
   System.out.println("a[]及b[]陣列的內容值如下......");
   
   System.arraycopy(a,0,b,a.length,a.length);
   
    for (int j=0;j<a.length;j++)
   {
      System.out.print("a["+j+"]="+a[j]+",");
   }    
   System.out.print("\n\nb[]陣列的內容為: ");
  
   for (int j=0;j<b.length;j++)
   {
      System.out.print("b["+j+"]="+b[j]+",");
   }    
  System.out.println("\n================================================================================");
  System.gc();
 }
}