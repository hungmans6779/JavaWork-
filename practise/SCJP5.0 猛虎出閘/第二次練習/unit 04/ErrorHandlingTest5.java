public class ErrorHandlingTest5
{
 static int numberator=20;
 static int denominator[]={0,2,4};
 static String answer;
 public static void main(String argv[])
 {
 	try
 	{
   calc(0);
  }
  catch(Exception e)
  {
   System.out.println("錯誤的原因是:"+e.getMessage());	
  }	
   System.out.println(numberator+"/"+denominator[0]+"="+answer);
   System.out.println("計算完畢");
 }
 public static void calc(int index) throws Exception
 {
 	 double ans=0;
   if(index==0 || index>denominator.length)
   {
   	answer="無法計算";
    throw new Exception("denominator[]的索引值不得為:"+index);	
   }
 	 ans=numberator/denominator[index];
 	 answer=String.valueOf(ans);
 
 }	
}