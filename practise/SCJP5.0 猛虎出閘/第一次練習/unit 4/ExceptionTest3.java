public class ExceptionTest3
{
 static int number=20;
 static int[] denominator={0,2,4};
 static String answer;
 public static void main(String argv[])
 {
  clac(0);
  System.out.println(number+"/"+denominator[0]+" = "+answer);
  System.out.println("===============================");
  clac(1);
  System.out.println(number+"/"+denominator[1]+" = "+answer);
  System.out.println("===============================");
  clac(2);
  System.out.println(number+"/"+denominator[2]+" = "+answer);
  
 }
 
 static void clac(int index)
 {
  double ans=0;
  try
  {	
   ans=number/denominator[index];
   answer=String.valueOf(ans);
  }
  catch(ArithmeticException ae)
  {
   System.out.println("���ͼƾǿ��~�A��]�O: "+ae.getMessage());
   System.out.println("���ͼƾǿ��~�A��]�O: "+ae.getLocalizedMessage());
   System.out.println("�ԲӪ���]�p�U: ");
   System.out.println();
   ae.printStackTrace();
   System.out.println();
   answer="�L�k�p��";	
  }	 
 }
}