public class EXAME8
{
 int x=5;	
 public static void main(String argv[])
 {
  final EXAME8 f1=new EXAME8();
  EXAME8 f2=new EXAME8();
  EXAME8 f3=FizzSwitch(f1,f2);
  System.out.println((f1==f3)+"  "+(f1.x==f3.x));
 }
 static EXAME8 FizzSwitch(EXAME8 x,EXAME8 y)
 {
  final EXAME8 z=x;
  z.x=6;
  return z;
 }
}