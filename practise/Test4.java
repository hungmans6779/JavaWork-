public class Test4
{
 public static void main(String argv[])
 {
 	int sum=0;
  for(int i=1;i<=99;i++)
  {
   if(i%2==0)
    continue;
   sum+=i;	
  }	
  System.out.println("sum="+sum);
 }
}