class EX13
{
 public static void main(String argv[])
 {
  int a[][]={{1,3,5},{2,4},{9,8,7,6}};
  int b[][]=new int[3][];
  b[0]=a[2];
  b[0][0]=20;
  b[1]=new int[2];
  b[2]=new int[3];
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a[i].length;j++)
   {
    System.out.print("a["+i+"]["+j+"]="+a[i][j]+"\t");
   }
   System.out.println();
  }
  System.out.println();
  System.out.println("==============================================================");
  for(int i=0;i<b.length;i++)
  {
   for(int j=0;j<b[i].length;j++)
   {
    System.out.print("b["+i+"]["+j+"]="+b[i][j]+"\t");
   }
   System.out.println();
  }
  
  
  
 }
}