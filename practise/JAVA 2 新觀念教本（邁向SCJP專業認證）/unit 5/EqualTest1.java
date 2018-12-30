class EqualTest1
{
 public static void main(String argv[])
 {
  int arry1[]={1,2,3};
  int arry2[];
  arry2=arry1;
  System.out.println(arry2.toString());
  for(int i:arry2)
  {
   System.out.print(i+"\t");
  }
 }
}