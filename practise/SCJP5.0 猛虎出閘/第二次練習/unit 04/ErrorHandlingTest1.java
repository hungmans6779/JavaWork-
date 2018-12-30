public class ErrorHandlingTest1
{
 static int numberator=20;
 static int denominator[]={0,2,4};
 static String answer;
 public static void main(String argv[])
 {
  calc(1);
  System.out.println(numberator+"/"+denominator[1]+"="+answer);
  calc(2);
  System.out.println(numberator+"/"+denominator[2]+"="+answer);
  System.out.println("­pºâ§¹²¦");
 }
 public static void calc(int index)
 {
 	double ans=0;
 	ans=numberator/denominator[index];
 	answer=String.valueOf(ans);
 }	
}