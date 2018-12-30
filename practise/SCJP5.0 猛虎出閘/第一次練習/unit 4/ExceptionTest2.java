public class ExceptionTest2
{
 static int number=20;
 static int[] denominator={0,2,4};
 static String answer;
 public static void main(String argv[])
 {
  clac(1);
  System.out.println(number+"/"+denominator[1]+" = "+answer);
  clac(2);
  System.out.println(number+"/"+denominator[2]+" = "+answer);
 }
 
 static void clac(int index)
 {
  double ans=0;
  ans=number/denominator[index];
  answer=String.valueOf(ans);
 }
}