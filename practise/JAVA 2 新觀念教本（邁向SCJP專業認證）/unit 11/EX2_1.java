public class EX2_1
{
 public static void main(String argv[])
 {
  int i[]={2,0,-2};
  for(int j=0;j<i.length;j++)
  {
   try
   {
    int k=10/i[j];
    System.out.println("k = "+k);
   }
   catch(Exception e)
   {
    System.out.println("�o�ͨҥ~"+e);
   }
  }
 }
}