public class TestExercise25
{
 public static void main(String argv[])
 {
  Integer.parseInt(argv[0]);
  Integer.parseInt(argv[1]); 
  Integer.parseInt(argv[2]);
  Integer.parseInt(argv[3]);
  Integer.parseInt(argv[4]);
  System.out.print("You Input value=");
  for (int j=0;j<=4;j++)
   System.out.print(argv[j]+",");
  int max=Integer.parseInt(argv[0]);
  for (int i=1;i<=4;i++)
  {
   if (max<Integer.parseInt(argv[i]))
    max=Integer.parseInt(argv[i]);
  }
  System.out.println("\n"+"max value = "+max);
 }
}