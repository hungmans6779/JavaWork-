class EX21
{
 public static void main(String argv[])
 {
  int n=Integer.parseInt(argv[0]);
  Out:
  {
   for(int i=1;i<=20;i++)
   {
    for(int j=1;j<=i;j++)
    {
     System.out.print("●");
     if(j==n)
     {
      break Out;
     }
    }
    System.out.println();
   }
   System.out.println("最大只能堆20層！");
  }
 }
}