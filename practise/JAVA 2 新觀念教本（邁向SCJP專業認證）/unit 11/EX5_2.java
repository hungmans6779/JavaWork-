public class EX5_2
{
 public static void main(String argv[])
 {
  try
  {
   if(argv.length<1)
    throw new ArrayIndexOutOfBoundsException("叫计把计―キよ");
   double i=Double.parseDouble(argv[0]);
   double j=Math.sqrt(i);
   System.out.println(i+" キよ "+j);
  }
  catch(ArithmeticException aie)
  {
   System.out.println("计岿粇");
  }
  finally
  {
   System.out.println("セ祘Αパhong 籹");
  }
 }
}