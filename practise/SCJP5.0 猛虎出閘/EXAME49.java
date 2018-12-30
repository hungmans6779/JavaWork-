public class EXAME49
{
 public static void main(String argv[])
 {
  Object o=new int[]{1,2,3};
  int someArray[]=(int[])o;
  for(int num:someArray)
  { System.out.print(num); }
 }
}