public class EXAME1_21
{
 int i=10;
 public static void main(String argv[])
 {
  EXAME1_21 t=new EXAME1_21();
  t.m1();
 }
 void m1()
 {
  int i=20;
  EXAME1_21 t=new EXAME1_21();
  t.i=30;
  m2(t,i);
  System.out.println(t.i);
 }
 void m2(EXAME1_21 t,int i)
 {
  i=0;
  t.i=40;
  EXAME1_21 d=new EXAME1_21();
  t=d;
  System.out.print(t.i+","+i+",");
 }
}