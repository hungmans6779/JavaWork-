public class EXAME049
{
 public static void main(String argv[])
 {
  Object o=new int[]{1,2,3};
  int []someArray=(int [])o;
  for(int i:someArray)
  {
   System.out.print(i);
  } 
 }
}