class EX12
{
 public static void main(String argv[])
 {
 	System.out.println("九九乘法表");
  for(int i=1;i<=9;i++)
  {
   for(int j=1;j<=9;j++)
   {
    System.out.print(i+"*"+j+"="+i*j+"\t");
   }
   System.out.println();
  }
 }
}