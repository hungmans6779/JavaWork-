import static java.lang.System.out;
class IntArrayTest1
{
 public static void main(String argv[])
 {
  int i1[]={1,2,3,4,5};
  for(int a:i1)
  {
   out.print(a+"\t");
  }
  out.println();
  int i2[]=new int[5];
  i2[0]=1;
  i2[1]=2;
  i2[2]=3;
  i2[3]=4;
  i2[4]=5;
  for(int a:i2)
  { out.print(a+"\t");}
  Object o=new int[5];
  Object o1=new int[]{1,2,3,4,5};
 }
}
