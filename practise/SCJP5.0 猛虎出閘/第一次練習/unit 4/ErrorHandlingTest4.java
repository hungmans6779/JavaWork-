public class ErrorHandlingTest4
{
 static int numerator=20;
 static int[]denominator={0,2,4};
 static String answer;
 public static void main(String argv[])
 {
  try
  {
   calc(0);
  }
  catch(Exception e)
  {
   System.out.println("���~�T��:"+e.getMessage());
  }
  System.out.println(numerator+"/"+denominator[0]+"="+answer);
  System.out.println("�p�⧹��!");
 }
 public static void calc(int index) throws Exception
 {
 	double ans=0;
 	if((index==0)||(index>=denominator.length))
 	{
 	 answer="�L�k�p��";
 	 throw new Exception("denominator[] �� ���ޭȤ��o�� " +index);  	
 	}	
 	ans=numerator/denominator[index];
 	answer=String.valueOf(ans);
 }	
}