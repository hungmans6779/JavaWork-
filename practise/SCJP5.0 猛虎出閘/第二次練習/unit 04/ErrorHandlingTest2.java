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
  System.out.println("�p�⧹��");
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
 	 System.out.println("���ͤF�ƾǿ��~�A��]�O:"+ae.getMessage());
 	 System.out.println("�Բӿ��~����]�O:");
 	 ae.printStackTrace();	
 	}	 

 }	
}