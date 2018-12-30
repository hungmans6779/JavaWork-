class EX2
{
 public static void main(String argv[])
 {
  int num[]=new int[5];
  for(int i=0;i<num.length;i++)
  {
   num[i]=num.length-i;
  }
  for(int i=0;i<num.length;i++)
  {
   System.out.println("num["+i+"]="+num[i]);
  }
 }
}