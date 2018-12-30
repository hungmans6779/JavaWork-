public class ExceptionTest7
{
 static int denomin[]={0,2,4};
 static int aa=20;
 static String answer;
 public static void main(String argv[])
 {
  try
  {
   calc(0);
  }
  catch(Exception aie)
  {
   aie.printStackTrace();
  }
  System.out.println(aa+"/"+denomin[0]+" = "+answer);
  System.out.println("=============================");
  calc(1);
  System.out.println(aa+"/"+denomin[1]+" = "+answer);
  System.out.println("=============================");
  calc(2);
  System.out.println(aa+"/"+denomin[2]+" = "+answer);
  System.out.println("=============================");
  System.out.println("計算完畢");
 }
 static void calc(int index) throws ArithmeticException
 {
  double ans=0.0;
  if(index==0 || index>denomin.length)
  {
   answer="無法計算";
   throw new ArithmeticException ("其分母的值不能為 "+denomin[index]);
  }
  ans=aa/denomin[index];
  answer=String.valueOf(ans);
 }
}