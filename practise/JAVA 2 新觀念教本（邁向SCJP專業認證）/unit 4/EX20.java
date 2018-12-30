class EX20
{
 public static void main(String argv[])
 {
  Out:
  for(int i=1;i<=9;i++)
  {
   for(int j=1;j<=9;j++)
   {
    System.out.print(i+"*"+j+"="+(i*j)+"\t");
    if(i==j)
    {
     System.out.println();    	
     continue Out;
    }
   }
  }
 }
}