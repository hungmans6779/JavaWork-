class Better
{
 enum Faster{Higher,Longer}
}
public class EXAME3_13_1
{
 public static void main(String argv[])
 {
  Better.Faster f1=Better.Faster.Higher;
  Better.Faster f2;
  f2=Better.Faster.Longer;
  System.out.println("f1 = "+f1);
  System.out.println("f2 = "+f2);
 }
}