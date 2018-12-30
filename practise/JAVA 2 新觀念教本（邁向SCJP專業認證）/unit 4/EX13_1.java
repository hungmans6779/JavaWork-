class EX13_1
{
 public static void main(String argv[])
 {
  int count=120;
  for(int i=1;i<=count;i++)
  {
   for(int j=1;j<=i;j++)
   {
    System.out.print("*");
   }
   System.out.println();
  }
  for(int i=count;i>=0;i--)
  {
   for(int j=i;j>=0;j--)
   {
    System.out.print("*");
   }
   System.out.println();
  }
 }
}