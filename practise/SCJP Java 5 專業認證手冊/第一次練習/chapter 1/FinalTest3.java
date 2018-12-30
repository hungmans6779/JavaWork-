public class FinalTest3
{
 public int  getSum(final int x)
 {
  for(int i=0;i<10;i++)
  {
   x+=x;	
  }	
  
  return x;
 }
 public static void main(String argv[])
 {
  System.out.println(new FinalTest3().getSum(3));
 }
}