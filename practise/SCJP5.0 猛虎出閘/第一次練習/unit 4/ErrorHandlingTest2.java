public class ErrorHandlingTest2
{
 static int number=20;
 static int[]denominator={0,2,4};
 static String answer;
 public static void main(String argv[])
 {
 	calc(0);
 	System.out.println(number+"/"+denominator[0]+" = "+answer);
 	
 	calc(1);
 	System.out.println(number+"/"+denominator[1]+" = "+answer);
 	
 	calc(2);
 	System.out.println(number+"/"+denominator[2]+" = "+answer); 	
 }
 
 static void calc(int index)
 {
 	try
 	{
 	 double ans=0.0;
 	 ans=number/denominator[index];
 	 answer=String.valueOf(ans);
 	}
 	catch(ArithmeticException  e)
 	{
 	 System.out.println("產生了數學錯誤，原因是 : "+e.getMessage());
 	 System.out.print("詳細錯誤 : ");
 	 e.printStackTrace();
 	 answer="無法計算";	
 	}	 
 }		
}	