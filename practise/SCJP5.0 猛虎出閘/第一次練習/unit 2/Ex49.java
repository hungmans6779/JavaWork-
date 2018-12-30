
public class Ex49
{
 public static void main(String argv[])
 {
  Object obj=new int[]{1,2,3};
  int[]someArray=(int[])obj;
  for(int i:someArray)
  {
   System.out.print(i+" ");
  }
 }
}