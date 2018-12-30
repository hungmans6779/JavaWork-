public class EX11
{
 public static void main(String argv[])
 {
  if(argv.length<2)
  {
   System.out.println("請輸入兩個整數做除法運算");
   return;
  }
  double m=Double.parseDouble(argv[0]);
  double n=Double.parseDouble(argv[1]);
  double r=m/n;
  assert !Double.isNaN(r):"商不是數值";
  System.out.println(r);
 }
}