public class EXAME3_08
{
 int x=5;
 public static void main(String argv[])
 {
  final EXAME3_08 f1=new EXAME3_08();
  EXAME3_08 f2=new EXAME3_08();
  EXAME3_08 f3=FizzSwitch(f1,f2);
  System.out.println("f1.x = "+f1.x);
  System.out.println("f3.x = "+f3.x);
  System.out.println((f1==f3)+"  "+(f1.x == f3.x));
 }
 static EXAME3_08 FizzSwitch(EXAME3_08 x,EXAME3_08 y)
 {
  final EXAME3_08 z=x;
  z.x=6;
  return z;
 }
}