public class P12
{
 P12 e;
 public static void main(String argv[])
 {
  P12 e1=new P12();
  P12 e2=new P12();
  P12 e3=new P12();
  e3.e=e2;
  e1.e=e3;
  e2=null;
  e3=null;
  e2.e=e1;
  e1=null;
 }
}