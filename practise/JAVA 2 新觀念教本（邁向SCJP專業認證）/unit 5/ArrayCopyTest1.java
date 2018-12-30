class ArrayCopyTest1
{
 public static void main(String argv[])
 {
  int a1[]={1,2,3};
  int a2[]=new int[a1.length];
  System.arraycopy(a1,0,a2,0,a1.length);
  a2[1]=32;
  for(int i:a1)
  {
   System.out.print(i+"\t");
  }
  
  System.out.println();
  for(int i:a2)
  {
   System.out.print(i+"\t");
  }
 }
}