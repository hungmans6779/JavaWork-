public class ExceptionTest4
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
  System.out.println("===============================");
  clac(4);
  
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
   System.out.println("產生數學錯誤，原因是: "+ae.getMessage());
   System.out.println("產生數學錯誤，原因是: "+ae.getLocalizedMessage());
   System.out.println("詳細的原因如下: ");
   System.out.println();
   ae.printStackTrace();
   System.out.println();
   answer="無法計算";	
  }
  catch(ArrayIndexOutOfBoundsException aiooe)
  {
   System.out.println("錯誤的原因是 : "+aiooe.getMessage());
   System.out.println("詳細錯誤的原因如下 :");
   System.out.println();
   aiooe.printStackTrace();	
  }	
  finally
  {
   System.out.println("我是中國人呀............");
   System.out.println("我不是爪哇人..........");
   //System.exit(1);	
  }		 
 }
}