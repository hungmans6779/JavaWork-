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
    System.out.println("錯誤的原因是:"+e.getMessage());	
   }	
  } 
  System.out.println("計算完畢"); 
 }
 public static void calc(int index) throws ArithmeticException,ArrayIndexOutOfBoundsException
 {
 	 double ans=0;
 	 if(index==0)
 	 {
 	  throw new ArithmeticException("分母不得為0");	
 	 }	
   if(index>denominator.length-1)
   {
    throw new ArrayIndexOutOfBoundsException("denominator[]的索引值不得為:"+index+",超過陣列範圍");	
   }
 	 ans=numberator/denominator[index];
 	 answer=String.valueOf(ans);
 	 System.out.println(numberator+"/"+denominator[index]+"="+answer);
 }	
}