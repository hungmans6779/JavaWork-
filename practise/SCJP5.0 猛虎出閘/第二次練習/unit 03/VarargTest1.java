public class VarargTest1
{
 public static void main(String argv[])
 {
  new VarargTest1().calc(1,2,3);
 }
 void calc(int ... value)
 {
  int sum=0;
  for(int vv:value)
  {
   sum+=vv;
  }
  System.out.println("sum="+sum);
 }
}