public class EXAME46
{
 int x=12;
 public void method(int x)
 {
  x+=x;
  System.out.println(x);
 }
 public static void main(String argv[])
 {
  new EXAME46().method(5);\
 }
}