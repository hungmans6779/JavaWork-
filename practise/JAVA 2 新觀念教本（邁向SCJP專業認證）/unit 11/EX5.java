public class EX5
{
 public static void main(String argv[])
 {
  try
  {
   double i=Double.parseDouble(argv[0]);
   double j=Math.sqrt(i);
   System.out.println(i+" 的平方根為 "+j);
  }
  catch(ArrayIndexOutOfBoundsException aie)
  {
   System.out.println("請加上一數值參數以求平方根");
  }
  finally
  {
   System.out.println("本程式由hong 製作");
  }
 }
}