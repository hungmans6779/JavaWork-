public class Q4_2 extends Q4_1
{
 public static void main(String argv[])
 {
  Q4_1 q1=new Q4_1();
  Q4_1 q2=new Q4_2();
  q1.method(1);
  ((Q4_1)q2).method(2);
 }
 public void method(int k)
 {
  System.out.println(20);
 }
}