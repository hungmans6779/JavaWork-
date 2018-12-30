public class ErrorHandlingTest2
{
 static int numberator=20;
 static int denominator[]={0,2,4};
 static String answer;
 public static void main(String argv[])
 {
  calc(0);
  System.out.println(numberator+"/"+denominator[0]+"="+answer);
  calc(2);
  System.out.println(numberator+"/"+denominator[2]+"="+answer);
  System.out.println("計算完畢");
 }
 public static void calc(int index)
 {
 	 double ans=0;
 	try
 	{
 	 ans=numberator/denominator[index];
 	 answer=String.valueOf(ans);
 	}
 	catch(ArithmeticException ae)
 	{
 	 System.out.println("產生了數學錯誤，原因是:"+ae.getMessage());
 	 System.out.println("詳細錯誤的原因是:");
 	 ae.printStackTrace();	
 	}	 

 }	
}