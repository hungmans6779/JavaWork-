public class EXAME3_12
{
 public static void main(String argv[])
 {
  EXAME3_12 e1=new EXAME3_12();
  EXAME3_12 e2=new EXAME3_12();
  EXAME3_12 e3=new EXAME3_12();
  e3.e=e2;
  e1.e=e3;
  e2=null;
  e3=null;
  e2.e=e1;
  e1=null;
 
 }
 EXAME3_12 e;
}