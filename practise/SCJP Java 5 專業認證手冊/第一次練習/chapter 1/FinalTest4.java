public class FinalTest4
{
 public static void main(String argv[])
 {
  final int a[]={1,2,3};
  for(int num:a)
  {
   System.out.print(num+"\t");	
   a[1]=4;
  }	
  //final int a1[]=new int[3];
  int a1[]=new  int[3];
  a1=new int[5];
 }
}