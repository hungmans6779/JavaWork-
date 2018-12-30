public class VarargTest2
{
 public static void main(String argv[])
 {
  new VarargTest2().calc("a",1,2,3);
 }
 void calc(String i,int ... value)
 {
  int sum=0;
  for(int vv:value)
  {
   sum+=vv;
  }
  System.out.println("sum="+sum);
  System.out.println("i="+i);
 }
}