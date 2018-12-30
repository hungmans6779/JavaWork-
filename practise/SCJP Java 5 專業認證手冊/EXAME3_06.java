public class EXAME3_06
{
 EXAME3_06(){}
 EXAME3_06(EXAME3_06 e)
 {
  m1=e;
 }
 EXAME3_06 m1;
 public static void main(String argv[])
 {
  EXAME3_06 m2=new EXAME3_06();
  EXAME3_06 m3=new EXAME3_06(m2); m3.go();
  EXAME3_06 m4=m3.m1;             m4.go();
  EXAME3_06 m5=m2.m1;             m5.go();
 }
 public void go()
 {
  System.out.println("hi ");	
 }	
}