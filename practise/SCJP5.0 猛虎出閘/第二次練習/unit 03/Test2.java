public class Test2
{
 public static void main(String argv[])
 {
  int value[]={1,2,3,4,5};
  new Test2().calc(value);
 }
 public void calc(int [] value)
 {
  int sum=0;
  for(int vv:value)
  {
   sum+=vv;
  }
  System.out.println("sum="+sum);
 }
}