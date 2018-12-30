public class ErrorHandlingTest1
{
 static int number=20;
 static int[]denominator={0,2,4};
 static String answer;
 public static void main(String argv[])
 {
 	calc(1);
 	System.out.println(number+"/"+denominator[1]+" = "+answer);
 	
 	calc(2);
 	System.out.println(number+"/"+denominator[2]+" = "+answer); 	
 }
 
 static void calc(int index)
 {
 	double ans=0.0;
 	ans=number/denominator[index];
 	answer=String.valueOf(ans);
 }		
}	