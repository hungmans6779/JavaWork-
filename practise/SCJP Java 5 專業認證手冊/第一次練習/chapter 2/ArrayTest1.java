public class ArrayTest1
{
 public static void main(String argv[])
 {
  int a[]={1,2,3,4,5};
  for(int i:a)
  { System.out.print(i+"\t"); }
  int b[]=new int[]{1,2,3,4,5,6,7};
  System.out.println();
  for(int i:b)
  { System.out.print(i+"\t");}
  int c=new int[]{1,2,3,4,5,6,7}[0];
  System.out.println("\nb = "+c);
 }
}