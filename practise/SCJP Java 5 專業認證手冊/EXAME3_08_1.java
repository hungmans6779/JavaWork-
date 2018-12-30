public class EXAME3_08_1
{
 int x=5;
 public static void main(String argv[])
 {
  final EXAME3_08_1 f1=new EXAME3_08_1();
  EXAME3_08_1 f2=new EXAME3_08_1();
  EXAME3_08_1 f3=FizzSwitch(f1,f2);
  System.out.println("f1.x = "+f1.x);
  System.out.println("f3.x = "+f3.x);
  System.out.println((f1==f3)+"  "+(f1.x == f3.x));
 }
 static EXAME3_08_1 FizzSwitch(EXAME3_08_1 x,EXAME3_08_1 y)
 {
  final EXAME3_08_1 z=new EXAME3_08_1();
  z.x=6;
  return z;
 }
}