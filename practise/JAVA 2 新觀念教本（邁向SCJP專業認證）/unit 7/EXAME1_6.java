public class EXAME1_6
{
 int a=10;
 public static void main(String argv[])
 {
  int a=20;
  EXAME1_6 t=new EXAME1_6();
  t.method(a);
  System.out.println(a);
 }
 void method(int a)
 {
  a*=a;
 }
}