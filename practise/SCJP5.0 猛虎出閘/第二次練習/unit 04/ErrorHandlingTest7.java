public class ErrorHandlingTest7
{
 static int numberator=20;
 static int denominator[]={0,2,4};
 static String answer;
 public static void main(String argv[])
 {
 	for(int i=0;i<66;i++)
 	{
 	 try
 	 {
    calc(i);
   }
   catch(Exception e)
   {
    System.out.println("���~����]�O:"+e.getMessage());	
   }	
  } 
  System.out.println("�p�⧹��"); 
 }
 public static void calc(int index) throws ArithmeticException,ArrayIndexOutOfBoundsException
 {
 	 double ans=0;
 	 if(index==0)
 	 {
 	  throw new ArithmeticException("�������o��0");	
 	 }	
   if(index>denominator.length-1)
   {
    throw new ArrayIndexOutOfBoundsException("denominator[]�����ޭȤ��o��:"+index+",�W�L�}�C�d��");	
   }
 	 ans=numberator/denominator[index];
 	 answer=String.valueOf(ans);
 	 System.out.println(numberator+"/"+denominator[index]+"="+answer);
 }	
}