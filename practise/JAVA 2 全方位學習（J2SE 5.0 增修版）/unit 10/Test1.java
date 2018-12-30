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
  System.out.println("\n原先的a[]及b[]陣列內容值如下");
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
  
   System.out.println("\n\n\na[]陣列所有內容複製到b[]陣列索引值為10之後....");
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
 }
}