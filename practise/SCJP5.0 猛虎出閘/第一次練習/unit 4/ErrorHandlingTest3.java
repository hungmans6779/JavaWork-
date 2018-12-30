public class ErrorHandlingTest3
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
 	
 	calc(99);
 	System.out.println(number+"/"+"�W�X�}�C���ޭ�"+" = "+answer); 
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
 	 System.out.println("���ͤF�ƾǿ��~�A��]�O : "+e.getMessage());
 	 System.out.print("�Բӿ��~ : ");
 	 e.printStackTrace();
 	 answer="�L�k�p��";	
 	}	 
 	catch(ArrayIndexOutOfBoundsException ae)
 	{
 	 System.out.println();
 	 System.out.println("���ͤF�ƾǿ��~�A��]�O : "+ae.getMessage());
 	 System.out.print("�Բӿ��~ : ");
 	 ae.printStackTrace();
 	 answer="�L�k�p��";		
 	}	
 }		
}	